import os
import json
import torch
from tqdm import tqdm
import gc
import time

# -------------------------------
# CONFIGURATION
# -------------------------------

# Model selection
MODEL_NAME = "Qwen/Qwen2.5-Coder-14B-Instruct"  # 128K context, fits in 16GB GPU

# Error JSON and code directories (relative paths - run from dissertation folder)
ERROR_FILE = 'Dissertation/Hybrid/Stratified_Sampling/DevAndHoldout/errors_dev_COBOL4J.json'
BUGGY_CODE_DIR = 'Dissertation/Functional/COBOL4J_results'

# Output directory
OUTPUT_DIR = 'strategytwo_results'

# Create output folder if it doesn't exist
os.makedirs(OUTPUT_DIR, exist_ok=True)

# -------------------------------
# FUNCTION: Extract Java code from model output
# -------------------------------
def extract_java_code(raw_output):
    """Extract only Java code from LLM output"""
    if not raw_output:
        return None

    text = raw_output.strip()

    # Remove common prefixes and markdown
    prefixes_to_remove = ['```java', '```', 'Here is the fixed code:', "Here's the corrected version:"]
    for prefix in prefixes_to_remove:
        if text.startswith(prefix):
            text = text[len(prefix):].strip()
    
    if text.endswith('```'):
        text = text[:-3].strip()

    # Find where Java code actually starts
    java_start_patterns = [
        'import ', 'package ', 'public class ', 'class ',
        'public interface ', 'interface ', '//', '/*'
    ]

    lines = text.split('\n')
    start_idx = 0
    
    for i, line in enumerate(lines):
        line_stripped = line.strip()
        if any(line_stripped.startswith(pattern) for pattern in java_start_patterns):
            start_idx = i
            break

    # Find where Java code ends
    end_idx = len(lines)
    for i in range(len(lines)-1, -1, -1):
        line_stripped = lines[i].strip()
        if not line_stripped or line_stripped in ['```', '</s>', '<|endoftext|>']:
            continue
        if line_stripped == '}' or (len(line_stripped) > 0 and line_stripped[0] == '}'):
            end_idx = i + 1
            break
        if (line_stripped.endswith(';') or line_stripped.endswith('}') or 
            line_stripped.endswith('{') or line_stripped.startswith('//')):
            end_idx = i + 1
            break

    java_lines = lines[start_idx:end_idx]
    java_code = '\n'.join(java_lines).strip()

    # Must have at least one class definition
    if 'class ' not in java_code.lower():
        return None
    
    return java_code if len(java_code) > 0 else None

# -------------------------------
# SETUP MODEL
# -------------------------------
print("\n   Loading model...")
print(f"   Model: {MODEL_NAME}")

from transformers import AutoTokenizer, AutoModelForCausalLM, BitsAndBytesConfig

# 4-bit quantization config
bnb_config = BitsAndBytesConfig(
    load_in_4bit=True,
    bnb_4bit_quant_type="nf4",
    bnb_4bit_compute_dtype=torch.bfloat16,
    bnb_4bit_use_double_quant=True,
)

# Load tokenizer
tokenizer = AutoTokenizer.from_pretrained(MODEL_NAME)
tokenizer.pad_token = tokenizer.eos_token
tokenizer.pad_token_id = tokenizer.eos_token_id

print(f"  Tokenizer loaded")

# Load model
print("  Loading model weights (this may take a minute)...")
model = AutoModelForCausalLM.from_pretrained(
    MODEL_NAME,
    quantization_config=bnb_config,
    device_map="auto"
)
model.config.pad_token_id = tokenizer.pad_token_id

# Check model config
max_position = getattr(model.config, 'max_position_embeddings', 'unknown')
print(f"  Model loaded successfully!")
print(f"     Model device: {model.device}")
print(f"   Max position embeddings: {max_position}")

if torch.cuda.is_available():
    print(f"   GPU: {torch.cuda.get_device_name(0)}")
    print(f"   GPU memory: {torch.cuda.get_device_properties(0).total_memory/1e9:.1f} GB")
    allocated = torch.cuda.memory_allocated(0) / 1e9
    print(f"   Currently allocated: {allocated:.2f} GB")
else:
    print("    Running on CPU (this will be slow)")

print()

# -------------------------------
# FIX SINGLE BUG FUNCTION (WITH ERROR CONTEXT)
# -------------------------------
def fix_single_bug(bug_info, bug_num, total_bugs):
    """Fix a single bug using Qwen2.5-Coder with error context"""
    
    problem_id = bug_info['problem_id']
    buggy_code = bug_info['buggy_code']
    error_type = bug_info.get('error_type', 'unknown')
    error_message = bug_info.get('error_message', 'No error message provided')
    
    print(f"\n{'='*70}")
    print(f"   Bug {bug_num}/{total_bugs}: {problem_id}")
    print(f"   Error Type: {error_type}")
    print(f"   Error Message: {error_message}")
    print(f"{'='*70}")
    
    # Create prompt with error context
    messages = [
        {"role": "system", "content": "You are an expert Java programmer specializing in debugging and fixing code errors."},
        {"role": "user", "content": f"""Fix the following buggy Java code. The code currently has this error:

Error Type: {error_type}
Error Message: {error_message}

Please fix the code to resolve this error and output ONLY the corrected code without any explanations.

Buggy Java code:

{buggy_code}"""}
    ]
    
    # Apply chat template
    print("   Creating prompt with error context...")
    text = tokenizer.apply_chat_template(
        messages,
        tokenize=False,
        add_generation_prompt=True
    )
    
    # Tokenize
    print("   Tokenizing input...")
    model_inputs = tokenizer(
        text,
        return_tensors="pt",
        truncation=True,
        max_length=100000  # Use up to 100K of the 128K context window
    ).to(model.device)
    
    input_length = model_inputs["input_ids"].shape[1]
    print(f"   Input tokens: {input_length:,}")
    
    # Show GPU memory before generation
    if torch.cuda.is_available():
        allocated = torch.cuda.memory_allocated(0) / 1e9
        print(f"   GPU memory allocated: {allocated:.2f} GB")
    
    # Generate
    print("   Generating fixed code...")
    start_time = time.time()
    
    with torch.no_grad():
        generated_ids = model.generate(
            **model_inputs,
            max_new_tokens=20000,  # Allow longer outputs for complete Java files
            do_sample=False,
            temperature=0.1,
            top_p=0.95,
            pad_token_id=tokenizer.pad_token_id,
        )
    
    generation_time = time.time() - start_time
    print(f"    Generation time: {generation_time:.1f} seconds")
    
    # Decode only the generated part
    print("   Decoding output...")
    generated_tokens = generated_ids[0][input_length:]
    output_length = len(generated_tokens)
    print(f"   Output tokens: {output_length:,}")
    
    raw_output = tokenizer.decode(generated_tokens, skip_special_tokens=True)
    
    # Extract Java code
    print("    Extracting Java code...")
    fixed_code = extract_java_code(raw_output)
    
    if fixed_code:
        lines = fixed_code.count('\n') + 1
        print(f"  SUCCESS - Fixed code extracted ({lines} lines)")
    else:
        print(f"  FAILED - Could not extract valid Java code")
        print(f"      Raw output preview: {raw_output[:200]}...")
    
    # Clean up GPU memory
    del model_inputs, generated_ids
    torch.cuda.empty_cache()
    gc.collect()
    
    return fixed_code, raw_output  # Return both cleaned and raw

# -------------------------------
# LOAD ERROR DATA
# -------------------------------
def load_error_data(error_file_path):
    """Load error data from JSON file"""
    try:
        with open(error_file_path, 'r', encoding='utf-8') as f:
            return json.load(f)
    except Exception as e:
        print(f"  Error loading {error_file_path}: {e}")
        return {}

def load_buggy_codes(error_data):
    """Load all buggy Java files"""
    bug_list = []
    
    for problem_id, bug_info in error_data.items():
        java_filename = bug_info.get('java_file', '')
        error_type = bug_info.get('error_type', 'unknown')
        error_message = bug_info.get('error_message', '')
        
        buggy_file_path = os.path.join(BUGGY_CODE_DIR, problem_id, java_filename)
        
        if not os.path.exists(buggy_file_path):
            bug_list.append({
                'problem_id': problem_id,
                'java_filename': java_filename,
                'error_type': error_type,
                'error_message': error_message,
                'status': 'file_not_found',
                'buggy_code': None
            })
            continue
        
        try:
            with open(buggy_file_path, 'r', encoding='utf-8', errors='ignore') as f:
                buggy_code = f.read()
            
            bug_list.append({
                'problem_id': problem_id,
                'java_filename': java_filename,
                'error_type': error_type,
                'error_message': error_message,
                'status': 'loaded',
                'buggy_code': buggy_code
            })
        except Exception as e:
            bug_list.append({
                'problem_id': problem_id,
                'java_filename': java_filename,
                'error_type': error_type,
                'error_message': error_message,
                'status': 'read_error',
                'buggy_code': None,
                'error': str(e)
            })
    
    return bug_list

# -------------------------------
# PROCESS PIPELINE
# -------------------------------
def process_all_bugs(bug_list):
    """Process all bugs one by one"""
    
    # Filter only loadable bugs
    fixable_bugs = [b for b in bug_list if b['status'] == 'loaded' and b['buggy_code']]
    
    if not fixable_bugs:
        print("    No bugs to fix!")
        return []
    
    results = []
    total = len(fixable_bugs)
    
    print(f"\n{'#'*70}")
    print(f"   Starting to process {total} bugs")
    print(f"{'#'*70}")
    
    overall_start_time = time.time()
    
    # Process each bug individually
    for i, bug in enumerate(fixable_bugs, 1):
        problem_id = bug['problem_id']
        
        try:
            # Fix the bug (returns both cleaned and raw)
            fixed_code, raw_output = fix_single_bug(bug, i, total)
            
            # Store both results
            bug['fixed_code'] = fixed_code
            bug['raw_output'] = raw_output
            bug['success'] = fixed_code is not None
            
            results.append(bug)
            
            # Show quick summary
            success_so_far = sum(1 for r in results if r.get('success', False))
            print(f"\n   Progress: {i}/{total} processed |   {success_so_far} successful |   {i - success_so_far} failed")
            
        except Exception as e:
            print(f"\n  ERROR processing {problem_id}: {str(e)}")
            import traceback
            traceback.print_exc()
            
            bug['fixed_code'] = None
            bug['raw_output'] = None
            bug['success'] = False
            bug['error'] = str(e)
            results.append(bug)
    
    overall_time = time.time() - overall_start_time
    print(f"\n{'#'*70}")
    print(f"    Total processing time: {overall_time/60:.1f} minutes ({overall_time:.0f} seconds)")
    print(f"    Average time per bug: {overall_time/total:.1f} seconds")
    print(f"{'#'*70}")
    
    return results

# -------------------------------
# SAVE RESULTS
# -------------------------------
def save_fixed_codes(fixed_bugs):
    """Save all fixed codes to output directory (raw + cleaned)"""
    
    results_list = []
    success_count = 0
    failed_count = 0
    raw_saved = 0
    
    # Create subdirectories
    raw_dir = os.path.join(OUTPUT_DIR, 'raw')
    cleaned_dir = os.path.join(OUTPUT_DIR, 'cleaned')
    os.makedirs(raw_dir, exist_ok=True)
    os.makedirs(cleaned_dir, exist_ok=True)
    
    print("\n   Saving results...")
    
    for bug in fixed_bugs:
        problem_id = bug['problem_id']
        java_filename = bug['java_filename']
        raw_output = bug.get('raw_output')  # Raw LLM response
        fixed_code = bug.get('fixed_code')  # Cleaned Java code
        
        # Always save raw output if it exists
        if raw_output:
            raw_problem_dir = os.path.join(raw_dir, problem_id)
            os.makedirs(raw_problem_dir, exist_ok=True)
            raw_path = os.path.join(raw_problem_dir, java_filename)
            
            try:
                with open(raw_path, 'w', encoding='utf-8') as f:
                    f.write(raw_output)
                raw_saved += 1
            except Exception as e:
                print(f"       Could not save raw output for {problem_id}: {e}")
        
        # Save cleaned code only if extraction succeeded
        if fixed_code:
            cleaned_problem_dir = os.path.join(cleaned_dir, problem_id)
            os.makedirs(cleaned_problem_dir, exist_ok=True)
            cleaned_path = os.path.join(cleaned_problem_dir, java_filename)
            
            try:
                with open(cleaned_path, 'w', encoding='utf-8') as f:
                    f.write(fixed_code)
                
                print(f"     Saved: {problem_id}/{java_filename} (raw + cleaned)")
                
                results_list.append({
                    'problem_id': problem_id,
                    'status': 'fixed',
                    'success': True,
                    'raw_file': raw_path,
                    'cleaned_file': cleaned_path
                })
                success_count += 1
                
            except Exception as e:
                print(f"     Write error for {problem_id}: {e}")
                results_list.append({
                    'problem_id': problem_id,
                    'status': 'write_error',
                    'success': False,
                    'error': str(e)
                })
                failed_count += 1
        else:
            # Cleaned extraction failed, but raw is still saved
            print(f"       No cleaned code for: {problem_id} (raw saved)")
            results_list.append({
                'problem_id': problem_id,
                'status': 'extraction_failed',
                'success': False,
                'raw_file': os.path.join(raw_dir, problem_id, java_filename) if raw_output else None,
                'error': 'Could not extract valid Java code from LLM output'
            })
            failed_count += 1
    
    print(f"\n   Saved {raw_saved} raw outputs, {success_count} cleaned outputs")
    
    return results_list, success_count, failed_count

# -------------------------------
# MAIN PIPELINE
# -------------------------------
def main():
    print("\n" + "="*80)
    print("STRATEGY TWO - WITH ERROR CONTEXT (Qwen2.5-Coder-14B-Instruct)")
    print("="*80)
    print(f"\n   Error file: {ERROR_FILE}")
    print(f"   Buggy code dir: {BUGGY_CODE_DIR}")
    print(f"   Output dir: {OUTPUT_DIR}")
    print(f"   Model: {MODEL_NAME}")
    print(f"\n   Strategy: Providing error type and message as context in prompt")
    
    # Load error data
    print("\n   Loading error data...")
    error_data = load_error_data(ERROR_FILE)
    
    if not error_data:
        print("  No error data loaded. Exiting.")
        return
    
    print(f"  Loaded {len(error_data)} error entries from JSON")
    
    # Load all buggy codes
    print("\n   Loading buggy Java files...")
    bug_list = load_buggy_codes(error_data)
    
    loadable = sum(1 for b in bug_list if b['status'] == 'loaded')
    not_found = sum(1 for b in bug_list if b['status'] == 'file_not_found')
    read_errors = sum(1 for b in bug_list if b['status'] == 'read_error')
    
    print(f"  Loaded: {loadable}/{len(bug_list)} files")
    if not_found > 0:
        print(f"    Not found: {not_found} files")
    if read_errors > 0:
        print(f"    Read errors: {read_errors} files")
    
    # Fix all bugs
    fixed_bugs = process_all_bugs(bug_list)
    
    # Save results
    results, success_count, failed_count = save_fixed_codes(fixed_bugs)
    
    # Save results log
    results_log_path = os.path.join(OUTPUT_DIR, 'strategytwo_dev_results.json')
    with open(results_log_path, 'w', encoding='utf-8') as f:
        json.dump(results, f, indent=2)
    
    print(f"\n  Results log saved: {results_log_path}")
    
    # Print summary
    print("\n" + "="*80)
    print("FINAL SUMMARY - STRATEGY TWO")
    print("="*80)
    print(f"\n  Successfully fixed: {success_count}/{len(error_data)} ({success_count/len(error_data)*100:.1f}%)")
    print(f"  Failed to fix:      {failed_count}/{len(error_data)} ({failed_count/len(error_data)*100:.1f}%)")
    print(f"\n   Fixed files saved to: {OUTPUT_DIR}")
    print(f"   Results log: {results_log_path}")
    print("\n  Strategy Two (with error context) complete!")


if __name__ == "__main__":
    main()