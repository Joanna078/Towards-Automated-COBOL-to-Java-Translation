import os
import json
import subprocess
import shutil
import re
import time
import gc
import traceback
from pathlib import Path

# ============================================================
# CONFIGURATION
# ============================================================

MODEL_NAME        = "Qwen/Qwen2.5-Coder-14B-Instruct"
MAX_ITERATIONS    = 5

# Error JSON and code directories (relative paths - run from dissertation folder)
ERROR_FILE = 'Dissertation/Hybrid/Stratified_Sampling/DevAndHoldout/errors_dev_COBOL4J.json'
BUGGY_CODE_DIR = 'Dissertation/Functional/COBOL4J_results'

COBOL_DIR = 'Dissertation/Hybrid/OriginalCOBOLFiles'  # Original COBOL files

OUTPUT_DIR        = 'strategyfour_results'  
TEMP_COMPILE_DIR = '/tmp/temp_compile'
# Test data (input.txt / output.txt) lives alongside COBOL in COBOL_DIR/pid/

TEST_RESULTS_FILE = os.path.join(OUTPUT_DIR, 'test_results.json')

# ============================================================
# JAVA EXTRACTION
# ============================================================

def extract_java_code(raw_output):
    """Extract only Java code from LLM output."""
    if not raw_output:
        return None

    text = raw_output.strip()
    for prefix in ['```java', '```', 'Here is the fixed code:', "Here's the corrected version:"]:
        if text.startswith(prefix):
            text = text[len(prefix):].strip()
    if text.endswith('```'):
        text = text[:-3].strip()

    java_start_patterns = [
        'import ', 'package ', 'public class ', 'class ',
        'public interface ', 'interface ', '//', '/*'
    ]
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
# COBOL LOADER
# ============================================================

def load_cobol_file(problem_id):
    cobol_dir = os.path.join(COBOL_DIR, problem_id)
    if not os.path.exists(cobol_dir):
        return None, "COBOL directory not found"
    try:
        cobol_files = sorted([
            f for f in os.listdir(cobol_dir)
            if f.endswith(('.cob', '.cbl', '.COB', '.CBL')) or '.' not in f
        ])
        if not cobol_files:
            return None, "No COBOL files found"
        with open(os.path.join(cobol_dir, cobol_files[0]), 'r',
                  encoding='utf-8', errors='ignore') as fh:
            return fh.read(), None
    except Exception as e:
        return None, str(e)


# ============================================================
# MODEL SETUP
# ============================================================

def setup_model():
    import torch
    from transformers import AutoTokenizer, AutoModelForCausalLM, BitsAndBytesConfig

    print("\n   Loading model...")
    print(f"   Model: {MODEL_NAME}")

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
    print("  Model loaded")

    if torch.cuda.is_available():
        print(f"   GPU: {torch.cuda.get_device_name(0)}")
    return model, tokenizer


# ============================================================
# LLM FIX (single bug, iteration-aware)
# ============================================================

def fix_single_bug(model, tokenizer, bug_info, bug_num, total_bugs, iteration):
    """
    Fix one bug using the LLM.

    On iteration 1:
      buggy_code   = original buggy Java from BUGGY_CODE_DIR
      error_type   = original error from errors_dev.json
      error_message = original error message

    On iteration 2+:
      buggy_code   = the Java code the LLM produced last iteration
      error_type   = the NEW test error (compilation_error / runtime_error / output_mismatch)
      error_message = the NEW error details from the test

    Returns (fixed_code, raw_output) or (None, None) if skipped.
    """
    import torch

    problem_id    = bug_info['problem_id']
    buggy_code    = bug_info['buggy_code']
    error_type    = bug_info.get('error_type', 'unknown')
    error_message = bug_info.get('error_message', 'No error message provided')

    print(f"\n{'='*70}")
    print(f"   [iter {iteration}] Bug {bug_num}/{total_bugs}: {problem_id}  |  {error_type}")

    cobol_code, cobol_err = load_cobol_file(problem_id)
    if not cobol_code:
        print(f"     COBOL not found ({cobol_err})   SKIPPING")
        return None, None

    # Build iteration-aware prompt
    if iteration == 1:
        intro = "You are tasked with fixing a buggy Java translation of a COBOL program."
    else:
        intro = (
            f"You are tasked with fixing a buggy Java translation of a COBOL program.\n"
            f"This is attempt #{iteration}. A previous fix attempt was made but it still "
            f"has errors. Please carefully analyse the error and produce a corrected version."
        )

    prompt_content = f"""{intro}

ORIGINAL COBOL CODE:
{cobol_code}

The COBOL code above was translated to Java, but the Java translation has the following error:

Error Type: {error_type}
Error Message: {error_message}

BUGGY JAVA CODE (translated from COBOL):
{buggy_code}

Please fix the buggy Java code to resolve the error while maintaining the logic from the original COBOL program. Output ONLY the corrected Java code without any explanations."""

    messages = [
        {"role": "system", "content": "You are an expert programmer specializing in COBOL to Java translation and debugging."},
        {"role": "user", "content": prompt_content}
    ]

    text = tokenizer.apply_chat_template(messages, tokenize=False, add_generation_prompt=True)
    model_inputs = tokenizer(text, return_tensors="pt", truncation=True, max_length=100000).to(model.device)
    input_length = model_inputs["input_ids"].shape[1]
    print(f"      Input tokens: {input_length:,}")

    start = time.time()
    with torch.no_grad():
        generated_ids = model.generate(
            **model_inputs,
            max_new_tokens=20000,
            do_sample=False,
            temperature=0.1,
            top_p=0.95,
            pad_token_id=tokenizer.pad_token_id,
        )
    print(f"       Generation: {time.time() - start:.1f}s")

    generated_tokens = generated_ids[0][input_length:]
    raw_output = tokenizer.decode(generated_tokens, skip_special_tokens=True)
    fixed_code = extract_java_code(raw_output)

    if fixed_code:
        print(f"     Extracted fixed code ({fixed_code.count(chr(10))+1} lines)")
    else:
        print(f"     Could not extract valid Java")

    del model_inputs, generated_ids
    torch.cuda.empty_cache()
    gc.collect()

    return fixed_code, raw_output


# ============================================================
# TESTING HELPERS
# ============================================================

def extract_main_class_name(java_file_path):
    try:
        with open(java_file_path, 'r', encoding='utf-8', errors='ignore') as f:
            content = f.read()
        m = re.search(r'public\s+class\s+(\w+)', content)
        if m:
            return m.group(1)
        m = re.search(r'class\s+(\w+)', content)
        return m.group(1) if m else None
    except Exception:
        return None


def compile_java(java_file_path):
    try:
        class_name = extract_main_class_name(java_file_path)
        if not class_name:
            return False, "Could not extract class name", None
        os.makedirs(TEMP_COMPILE_DIR, exist_ok=True)
        dest = os.path.join(TEMP_COMPILE_DIR, f"{class_name}.java")
        shutil.copy(java_file_path, dest)
        result = subprocess.run(
            ['javac',  dest],
            capture_output=True, text=True, timeout=10, cwd=TEMP_COMPILE_DIR
        )
        if result.returncode == 0 and os.path.exists(os.path.join(TEMP_COMPILE_DIR, f'{class_name}.class')):
            return True, None, class_name
        return False, result.stderr.strip() or "No .class file generated", None
    except subprocess.TimeoutExpired:
        return False, "Compilation timeout (>10s)", None
    except Exception as e:
        return False, str(e), None


def run_java_with_input(class_name, input_data):
    try:
        start = time.time()
        result = subprocess.run(
            ['java', '-cp', '.', class_name],
            input=input_data, capture_output=True, text=True,
            timeout=5, cwd=TEMP_COMPILE_DIR
        )
        elapsed = time.time() - start
        if result.returncode == 0:
            return True, result.stdout.strip(), None, elapsed
        return False, None, f"Runtime error: {result.stderr.strip()}", None
    except subprocess.TimeoutExpired:
        return False, None, (
            "Execution timeout (>5s). The program did not terminate, "
            "likely due to an infinite loop. Check all loop conditions "
            "(PERFORM UNTIL equivalents, while/for loops) and ensure they "
            "have proper exit conditions. Also verify that input is being "
            "read correctly and not causing the program to block waiting "
            "for additional input."
        ), None
    except Exception as e:
        return False, None, str(e), None


def compare_outputs(actual, expected):
    return [l.strip() for l in actual.strip().split('\n')] == \
           [l.strip() for l in expected.strip().split('\n')]


def clean_temp():
    if os.path.exists(TEMP_COMPILE_DIR):
        shutil.rmtree(TEMP_COMPILE_DIR)
    os.makedirs(TEMP_COMPILE_DIR, exist_ok=True)


def test_single_file(java_file_path, problem_id):
    """
    Test a single Java file.
    Returns: { passed: bool, error_type: str|None, error_details: str|None }
    """
    result = {'passed': False, 'error_type': None, 'error_details': None}

    # Compile
    ok, err, cls = compile_java(java_file_path)
    if not ok:
        result['error_type']    = 'compilation_error'
        result['error_details'] = err
        clean_temp()
        return result

    # Locate test data (lives in hybridcobol/pid/ alongside the COBOL file)
    inp_file = os.path.join(COBOL_DIR, problem_id, 'input.txt')
    out_file = os.path.join(COBOL_DIR, problem_id, 'output.txt')
    if not os.path.exists(inp_file) or not os.path.exists(out_file):
        result['error_type']    = 'missing_test_data'
        result['error_details'] = 'input.txt or output.txt not found'
        clean_temp()
        return result

    with open(inp_file, 'r', encoding='utf-8') as fh:
        test_input = fh.read()
    with open(out_file, 'r', encoding='utf-8') as fh:
        expected = fh.read()

    # Execute
    ok, actual, err, elapsed = run_java_with_input(cls, test_input)
    if not ok:
        result['error_type']    = 'runtime_error'
        result['error_details'] = err
        clean_temp()
        return result

    # Compare
    if compare_outputs(actual, expected):
        result['passed'] = True
    else:
        result['error_type']    = 'output_mismatch'
        result['error_details'] = f"expected: {expected[:120]}... | got: {actual[:120]}..."

    clean_temp()
    return result


# ============================================================
# MAIN ITERATIVE PIPELINE
# ============================================================

def main():
    print("\n" + "#" * 80)
    print(f"#  ITERATIVE PIPELINE  (max {MAX_ITERATIONS} iterations)")
    print(f"#  Fix   Test   Feed errors back   Repeat until all pass")
    print("#" * 80)

    os.makedirs(OUTPUT_DIR, exist_ok=True)

    # ----------------------------------------------------------
    # Load initial error data & buggy source files
    # ----------------------------------------------------------
    print("\n   Loading error data...")
    with open(ERROR_FILE, 'r', encoding='utf-8') as f:
        error_data = json.load(f)
    print(f"  {len(error_data)} error entries")

    # Build initial bug list   keyed by problem_id
    bugs = {}
    for pid, info in error_data.items():
        java_fn = info.get('java_file', '')
        path    = os.path.join(BUGGY_CODE_DIR, pid, java_fn)
        entry   = {
            'problem_id':    pid,
            'java_filename': java_fn,
            'error_type':    info.get('error_type', 'unknown'),
            'error_message': info.get('error_message', ''),
            'buggy_code':    None,
        }
        if os.path.exists(path):
            with open(path, 'r', encoding='utf-8', errors='ignore') as fh:
                entry['buggy_code'] = fh.read()
        bugs[pid] = entry

    fixable_pids = [pid for pid, b in bugs.items() if b['buggy_code']]
    print(f"   {len(fixable_pids)} fixable bugs out of {len(bugs)} total")

    # ----------------------------------------------------------
    # Load model ONCE (reused across all iterations)
    # ----------------------------------------------------------
    model, tokenizer = setup_model()

    # ----------------------------------------------------------
    # Track state across iterations
    # ----------------------------------------------------------
    passed_pids        = set()                               # problems that passed
    all_iteration_logs = []                                  # per-iteration summaries
    problem_history    = {pid: [] for pid in fixable_pids}  # full history per problem

    # ----------------------------------------------------------
    # PROCESS EACH PROBLEM (up to MAX_ITERATIONS per problem)
    # ----------------------------------------------------------
    to_fix = sorted(fixable_pids)
    overall_start = time.time()

    for idx, pid in enumerate(to_fix, 1):
        bug = bugs[pid]
        jfn = bug['java_filename']

        print(f"\n{'#'*80}")
        print(f"#  PROBLEM {idx}/{len(to_fix)}: {pid}")
        print(f"#  Error: {bug['error_type']}   {bug['error_message'][:80]}")
        print(f"{'#'*80}")

        for iteration in range(1, MAX_ITERATIONS + 1):
            print(f"\n      Iteration {iteration}/{MAX_ITERATIONS}   ")

            # --- LLM Fix ---
            try:
                fixed_code, raw_output = fix_single_bug(
                    model, tokenizer, bug, idx, len(to_fix), iteration
                )
            except Exception as e:
                print(f"     Exception during LLM fix: {e}")
                traceback.print_exc()
                problem_history[pid].append({
                    'iteration': iteration, 'action': 'fix_attempted',
                    'passed': False, 'error_type': 'exception', 'error_details': str(e),
                })
                continue

            # Skipped (e.g. no COBOL file)
            if fixed_code is None and raw_output is None:
                print(f"       Skipped (no COBOL)")
                problem_history[pid].append({
                    'iteration': iteration, 'action': 'skipped', 'reason': 'COBOL not found',
                })
                break  # no point retrying without COBOL

            # Save raw output
            iter_dir_raw = os.path.join(OUTPUT_DIR, f'iter{iteration}', 'raw')
            os.makedirs(os.path.join(iter_dir_raw, pid), exist_ok=True)
            if raw_output:
                with open(os.path.join(iter_dir_raw, pid, jfn), 'w', encoding='utf-8') as fh:
                    fh.write(raw_output)

            # Extraction failed — save note and continue to next iteration with same input
            if not fixed_code:
                print(f"     Extraction failed   continuing to next iteration")
                problem_history[pid].append({
                    'iteration':     iteration,
                    'action':        'fix_attempted',
                    'extraction_ok': False,
                    'passed':        False,
                    'error_type':    'extraction_failed',
                    'error_details': 'Could not extract valid Java from LLM output.',
                })
                continue

            # Save cleaned output
            iter_dir_cleaned = os.path.join(OUTPUT_DIR, f'iter{iteration}', 'cleaned')
            os.makedirs(os.path.join(iter_dir_cleaned, pid), exist_ok=True)
            cleaned_path = os.path.join(iter_dir_cleaned, pid, jfn)
            with open(cleaned_path, 'w', encoding='utf-8') as fh:
                fh.write(fixed_code)

            # --- Test the fixed code ---
            print(f"      Testing...")
            test_result = test_single_file(cleaned_path, pid)

            if test_result['passed']:
                print(f"     PASSED on iteration {iteration}!")
                passed_pids.add(pid)
                problem_history[pid].append({
                    'iteration':     iteration,
                    'action':        'fix_attempted',
                    'extraction_ok': True,
                    'passed':        True,
                })
                break  # done with this problem
            else:
                print(f"     FAILED   {test_result['error_type']}: "
                      f"{(test_result['error_details'] or '')[:100]}")
                problem_history[pid].append({
                    'iteration':     iteration,
                    'action':        'fix_attempted',
                    'extraction_ok': True,
                    'passed':        False,
                    'error_type':    test_result['error_type'],
                    'error_details': test_result['error_details'],
                })

                # Feed new error + latest Java back for next iteration
                bug['buggy_code']    = fixed_code
                bug['error_type']    = test_result['error_type']
                bug['error_message'] = test_result['error_details'] or ''

        # --- Per-problem summary ---
        hist = problem_history[pid]
        iters_tried = len([h for h in hist if h.get('action') == 'fix_attempted'])
        status = "  PASSED" if pid in passed_pids else "  FAILED"
        print(f"\n      {pid}: {status} after {iters_tried} iteration(s)")
        print(f"      Cumulative: {len(passed_pids)} passed | "
              f"{idx - len(passed_pids)} failed/incomplete")

    overall_time = time.time() - overall_start
    print(f"\n    Total processing time: {overall_time/60:.1f} minutes")

    # ----------------------------------------------------------
    # Copy best (latest) cleaned version to final cleaned dir
    # ----------------------------------------------------------
    final_cleaned = os.path.join(OUTPUT_DIR, 'cleaned')
    os.makedirs(final_cleaned, exist_ok=True)

    for it in range(1, MAX_ITERATIONS + 1):
        src = os.path.join(OUTPUT_DIR, f'iter{it}', 'cleaned')
        if not os.path.isdir(src):
            continue
        for pid in os.listdir(src):
            pid_src = os.path.join(src, pid)
            pid_dst = os.path.join(final_cleaned, pid)
            if os.path.isdir(pid_src):
                os.makedirs(pid_dst, exist_ok=True)
                for fn in os.listdir(pid_src):
                    shutil.copy2(os.path.join(pid_src, fn), os.path.join(pid_dst, fn))

    # ----------------------------------------------------------
    # Build final structured test results JSON
    # ----------------------------------------------------------
    final_results = []
    for pid in sorted(fixable_pids):
        history = problem_history[pid]
        bug     = bugs[pid]
        is_pass = pid in passed_pids

        pass_iter          = None
        last_error_type    = bug.get('error_type')
        last_error_details = bug.get('error_message', '')

        for h in history:
            if h.get('passed'):
                pass_iter          = h['iteration']
                last_error_type    = None
                last_error_details = None
                break

        if not is_pass and history:
            for h in reversed(history):
                if h.get('error_type'):
                    last_error_type    = h['error_type']
                    last_error_details = h.get('error_details', '')
                    break

        final_results.append({
            'problem_id':       pid,
            'passed':           'Y' if is_pass else 'N',
            'passed_on_iter':   pass_iter,
            'iterations_tried': len([h for h in history if h.get('action') == 'fix_attempted']),
            'error_type':       last_error_type,
            'error_details':    last_error_details,
            'history':          history,
        })

    # ----------------------------------------------------------
    # Save everything
    # ----------------------------------------------------------
    with open(TEST_RESULTS_FILE, 'w', encoding='utf-8') as fh:
        json.dump(final_results, fh, indent=2)
    print(f"\n   Test results       {TEST_RESULTS_FILE}")

    # Final summary
    total  = len(final_results)
    passed = sum(1 for r in final_results if r['passed'] == 'Y')
    failed = total - passed

    pass_by_iter = {}
    for r in final_results:
        if r['passed_on_iter']:
            it = r['passed_on_iter']
            pass_by_iter[it] = pass_by_iter.get(it, 0) + 1

    print(f"\n{'#'*80}")
    print(f"#  FINAL RESULTS")
    if total:
        print(f"#  Passed: {passed}/{total} ({passed/total*100:.1f}%)")
        print(f"#  Failed: {failed}/{total} ({failed/total*100:.1f}%)")
    else:
        print("#  No bugs processed")
    print(f"#")
    cumulative = 0
    for it in sorted(pass_by_iter.keys()):
        cumulative += pass_by_iter[it]
        print(f"#   Iter {it}: +{pass_by_iter[it]} passed  (cumulative {cumulative}/{total})")
    print(f"#")
    print(f"#  Results : {TEST_RESULTS_FILE}")
    print(f"#  Cleaned : {final_cleaned}/")
    print(f"{'#'*80}\n")


if __name__ == "__main__":
    main()
