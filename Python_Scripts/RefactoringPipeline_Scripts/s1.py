import os
import json
import torch
import gc
import time

# ============================================================
# CONFIGURATION
# ============================================================

MODEL_NAME        = "Qwen/Qwen2.5-Coder-14B-Instruct"

WORKSPACE         = '/workspace'
RQ5_DIR           = os.path.join(WORKSPACE, 'rq5')
COBOL4J_DEV_DIR   = os.path.join(RQ5_DIR, 'dev')
SPLIT_FILE        = os.path.join(RQ5_DIR, 'rq5_split.json')

OUTPUT_DIR        = os.path.join(WORKSPACE, 'rq5_strategy1_results')

os.makedirs(OUTPUT_DIR, exist_ok=True)

# ============================================================
# JAVA EXTRACTION
# ============================================================

def extract_java_code(raw_output):
    if not raw_output:
        return None
    text = raw_output.strip()
    for prefix in ['```java', '```', 'Here is the refactored code:', "Here's the refactored version:"]:
        if text.startswith(prefix):
            text = text[len(prefix):].strip()
    if text.endswith('```'):
        text = text[:-3].strip()

    java_start_patterns = ['import ', 'package ', 'public class ', 'class ',
                           'public interface ', 'interface ', '//', '/*']
    lines = text.split('\n')
    start_idx = 0
    for i, line in enumerate(lines):
        if any(line.strip().startswith(p) for p in java_start_patterns):
            start_idx = i
            break

    end_idx = len(lines)
    for i in range(len(lines) - 1, -1, -1):
        ls = lines[i].strip()
        if not ls or ls in ['```', '</s>', '<|endoftext|>']:
            continue
        if ls == '}' or ls[0] == '}':
            end_idx = i + 1
            break
        if ls.endswith(';') or ls.endswith('}') or ls.endswith('{') or ls.startswith('//'):
            end_idx = i + 1
            break

    java_code = '\n'.join(lines[start_idx:end_idx]).strip()
    if 'class ' not in java_code.lower():
        return None
    return java_code if java_code else None

# ============================================================
# MODEL SETUP
# ============================================================

def setup_model():
    from transformers import AutoTokenizer, AutoModelForCausalLM, BitsAndBytesConfig
    print(f"\n>> Loading model: {MODEL_NAME}")
    bnb_config = BitsAndBytesConfig(
        load_in_4bit=True,
        bnb_4bit_quant_type="nf4",
        bnb_4bit_compute_dtype=torch.bfloat16,
        bnb_4bit_use_double_quant=True,
    )
    tokenizer = AutoTokenizer.from_pretrained(MODEL_NAME)
    tokenizer.pad_token = tokenizer.eos_token
    tokenizer.pad_token_id = tokenizer.eos_token_id
    model = AutoModelForCausalLM.from_pretrained(
        MODEL_NAME, quantization_config=bnb_config, device_map="auto"
    )
    model.config.pad_token_id = tokenizer.pad_token_id
    print(">> Model loaded")
    if torch.cuda.is_available():
        print(f">> GPU: {torch.cuda.get_device_name(0)}")
        print(f">> VRAM: {torch.cuda.get_device_properties(0).total_memory/1e9:.1f} GB")
    return model, tokenizer

# ============================================================
# REFACTOR FUNCTION
# ============================================================

def refactor_single(model, tokenizer, problem_id, java_code, prog_num, total):
    print(f"\n{'='*70}")
    print(f">> [{prog_num}/{total}] Refactoring: {problem_id}")

    prompt_content = f"""The following Java code was automatically translated from COBOL using a rule-based compiler. It is functionally correct but non-idiomatic — it uses a custom COBOL runtime library (jp.osscons.opensourcecobol.libcobj.*) and over-engineered constructs that a Java developer would not write.

Refactor this code into clean, idiomatic Java 17. Remove dependencies on the custom runtime library and replace them with standard Java equivalents. Simplify any unnecessarily complex constructs while preserving the exact functional behaviour of the program.

Output ONLY the refactored Java code with no explanations.

Java code to refactor:

{java_code}"""

    messages = [
        {"role": "system", "content": "You are an expert Java programmer specialising in code refactoring and modernisation."},
        {"role": "user",   "content": prompt_content}
    ]

    text = tokenizer.apply_chat_template(messages, tokenize=False, add_generation_prompt=True)
    model_inputs = tokenizer(text, return_tensors="pt", truncation=True, max_length=100000).to(model.device)
    input_length = model_inputs["input_ids"].shape[1]
    print(f"   >> Input tokens: {input_length:,}")

    start = time.time()
    with torch.no_grad():
        generated_ids = model.generate(
            **model_inputs,
            max_new_tokens=20000,
            do_sample=False,
            pad_token_id=tokenizer.pad_token_id,
        )
    print(f"   >> Generation: {time.time() - start:.1f}s")

    generated_tokens = generated_ids[0][input_length:]
    raw_output = tokenizer.decode(generated_tokens, skip_special_tokens=True)
    refactored_code = extract_java_code(raw_output)

    if refactored_code:
        print(f"   >> Extracted ({refactored_code.count(chr(10))+1} lines)")
    else:
        print(f"   >> Could not extract valid Java")

    del model_inputs, generated_ids
    torch.cuda.empty_cache()
    gc.collect()

    return refactored_code, raw_output

# ============================================================
# SAVE HELPER
# ============================================================

def save_results(results):
    path = os.path.join(OUTPUT_DIR, 'rq5_strategy1_results.json')
    with open(path, 'w') as f:
        json.dump(results, f, indent=2)

# ============================================================
# MAIN
# ============================================================

def main():
    print("\n" + "="*80)
    print("RQ5 STRATEGY 1 — CODE ONLY REFACTORING (Qwen2.5-Coder-14B-Instruct)")
    print("="*80)
    print(f"\n>> RQ5 dir:    {RQ5_DIR}")
    print(f">> Output dir: {OUTPUT_DIR}")

    with open(SPLIT_FILE, 'r') as f:
        split_data = json.load(f)
    dev_pids = split_data['dev']
    print(f">> Dev set: {len(dev_pids)} programs")

    model, tokenizer = setup_model()

    results     = []
    raw_dir     = os.path.join(OUTPUT_DIR, 'raw')
    cleaned_dir = os.path.join(OUTPUT_DIR, 'cleaned')
    os.makedirs(raw_dir, exist_ok=True)
    os.makedirs(cleaned_dir, exist_ok=True)

    overall_start = time.time()

    for idx, pid in enumerate(dev_pids, 1):
        pid_dir    = os.path.join(COBOL4J_DEV_DIR, pid)
        java_files = sorted([f for f in os.listdir(pid_dir) if f.endswith('.java')]) \
                     if os.path.isdir(pid_dir) else []

        if not java_files:
            print(f">> [{idx}] No Java file for {pid}, skipping")
            results.append({'problem_id': pid, 'status': 'no_java_file'})
            save_results(results)
            continue

        java_filename = java_files[0]
        with open(os.path.join(pid_dir, java_filename), 'r', encoding='utf-8', errors='ignore') as f:
            java_code = f.read()

        refactored_code, raw_output = refactor_single(
            model, tokenizer, pid, java_code, idx, len(dev_pids)
        )

        # Save raw output
        raw_pid_dir = os.path.join(raw_dir, pid)
        os.makedirs(raw_pid_dir, exist_ok=True)
        if raw_output:
            with open(os.path.join(raw_pid_dir, java_filename), 'w', encoding='utf-8') as f:
                f.write(raw_output)

        # Save cleaned output
        if refactored_code:
            cleaned_pid_dir = os.path.join(cleaned_dir, pid)
            os.makedirs(cleaned_pid_dir, exist_ok=True)
            with open(os.path.join(cleaned_pid_dir, java_filename), 'w', encoding='utf-8') as f:
                f.write(refactored_code)

        results.append({
            'problem_id': pid,
            'java_file':  java_filename,
            'status':     'refactored' if refactored_code else 'extraction_failed',
        })

        # Save incrementally after every program
        save_results(results)

        passed = sum(1 for r in results if r.get('status') == 'refactored')
        print(f"   >> Progress: {idx}/{len(dev_pids)} | Extracted: {passed}")

    overall_time = time.time() - overall_start
    total     = len(results)
    extracted = sum(1 for r in results if r.get('status') == 'refactored')

    print(f"\n{'='*80}")
    print(f"FINAL SUMMARY — STRATEGY 1")
    print(f"Extracted: {extracted}/{total}")
    print(f"Time:      {overall_time/60:.1f} minutes")
    print(f"Results:   {os.path.join(OUTPUT_DIR, 'rq5_strategy1_results.json')}")
    print(f"{'='*80}")

if __name__ == "__main__":
    main()