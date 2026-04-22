import os
import json
import torch
import gc
import time
import subprocess
import shutil
import re

# ============================================================
# CONFIGURATION
# ============================================================

MODEL_NAME     = "Qwen/Qwen2.5-Coder-14B-Instruct"
MAX_ITERATIONS = 5

WORKSPACE         = '/workspace'
RQ5_DIR           = os.path.join(WORKSPACE, 'rq5')
COBOL4J_DEV_DIR   = os.path.join(RQ5_DIR, 'dev')
COBOL_DIR         = os.path.join(RQ5_DIR, 'cobol')
SPLIT_FILE        = os.path.join(RQ5_DIR, 'rq5_split.json')
LIBCOBJ_JAR       = '/usr/lib/opensourcecobol4j/libcobj.jar'

OUTPUT_DIR       = os.path.join(WORKSPACE, 'rq5_strategy4_results')
TEMP_COMPILE_DIR = '/tmp/rq5_s4_compile'

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
# COBOL LOADER
# ============================================================

def load_cobol_file(problem_id):
    pid_dir = os.path.join(COBOL_DIR, problem_id)
    if not os.path.exists(pid_dir):
        return None, f"No directory at {pid_dir}"
    try:
        cobol_files = sorted([
            f for f in os.listdir(pid_dir)
            if f.endswith(('.cob', '.cbl', '.COB', '.CBL'))
        ])
        if not cobol_files:
            return None, "No COBOL files found"
        with open(os.path.join(pid_dir, cobol_files[0]), 'r',
                  encoding='utf-8', errors='ignore') as f:
            return f.read(), None
    except Exception as e:
        return None, str(e)

# ============================================================
# LIZARD
# ============================================================

def run_lizard(java_file_path):
    try:
        result = subprocess.run(
            ['lizard', java_file_path],
            capture_output=True, text=True, timeout=30
        )
        if result.returncode != 0:
            return None
        lines = result.stdout.strip().split('\n')
        functions = []
        for line in lines:
            if '@' in line and not line.startswith('=') and \
               not line.startswith('-') and 'NLOC' not in line:
                parts = line.split()
                if len(parts) >= 5:
                    try:
                        functions.append({
                            'nloc':  int(parts[0]),
                            'ccn':   int(parts[1]),
                            'token': int(parts[2]),
                        })
                    except (ValueError, IndexError):
                        continue
        if not functions:
            return None
        return {
            'function_count': len(functions),
            'total_nloc':     sum(f['nloc'] for f in functions),
            'avg_ccn':        sum(f['ccn'] for f in functions) / len(functions),
            'max_ccn':        max(f['ccn'] for f in functions),
            'avg_nloc':       sum(f['nloc'] for f in functions) / len(functions),
        }
    except Exception:
        return None

def lizard_score(lizard_result):
    if not lizard_result:
        return None
    return lizard_result['avg_ccn'] * lizard_result['function_count']

# ============================================================
# FUNCTIONAL TESTING
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

def clean_temp():
    if os.path.exists(TEMP_COMPILE_DIR):
        shutil.rmtree(TEMP_COMPILE_DIR)
    os.makedirs(TEMP_COMPILE_DIR, exist_ok=True)

def compile_java(java_file_path):
    try:
        class_name = extract_main_class_name(java_file_path)
        if not class_name:
            return False, "Could not extract class name", None
        dest = os.path.join(TEMP_COMPILE_DIR, f"{class_name}.java")
        shutil.copy(java_file_path, dest)
        result = subprocess.run(
            ['javac', '-cp', os.path.abspath(LIBCOBJ_JAR), dest],
            capture_output=True, text=True, timeout=10, cwd=TEMP_COMPILE_DIR
        )
        if result.returncode == 0:
            return True, None, class_name
        return False, result.stderr.strip(), None
    except subprocess.TimeoutExpired:
        return False, "Compilation timeout", None
    except Exception as e:
        return False, str(e), None

def run_java_with_input(class_name, input_data):
    try:
        result = subprocess.run(
            ['java', '-cp', f'.:{os.path.abspath(LIBCOBJ_JAR)}', class_name],
            input=input_data, capture_output=True, text=True,
            timeout=5, cwd=TEMP_COMPILE_DIR
        )
        if result.returncode == 0:
            return True, result.stdout.strip(), None
        return False, None, f"Runtime error: {result.stderr.strip()}"
    except subprocess.TimeoutExpired:
        return False, None, "Execution timeout (>5s)"
    except Exception as e:
        return False, None, str(e)

def compare_outputs(actual, expected):
    return [l.strip() for l in actual.strip().split('\n')] == \
           [l.strip() for l in expected.strip().split('\n')]

def test_java_file(java_file_path, problem_id):
    ok, err, cls = compile_java(java_file_path)
    if not ok:
        clean_temp()
        return False, 'compilation_error', err
    inp_file = os.path.join(COBOL_DIR, problem_id, 'input.txt')
    out_file = os.path.join(COBOL_DIR, problem_id, 'output.txt')
    if not os.path.exists(inp_file) or not os.path.exists(out_file):
        clean_temp()
        return False, 'missing_test_data', 'input.txt or output.txt not found'
    with open(inp_file, 'r') as f:
        test_input = f.read()
    with open(out_file, 'r') as f:
        expected = f.read()
    ok, actual, err = run_java_with_input(cls, test_input)
    if not ok:
        clean_temp()
        return False, 'runtime_error', err
    if compare_outputs(actual, expected):
        clean_temp()
        return True, None, None
    clean_temp()
    return False, 'output_mismatch', f"expected: {expected[:120]} | got: {actual[:120]}"

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
# TWO PROMPTS
# ============================================================

def build_prompt_a(java_code, cobol_code):
    """Prompt A — last iteration passed. Push for more maintainability."""
    return f"""The following Java code was automatically translated from COBOL using a rule-based compiler. It is functionally correct but non-idiomatic — it uses a custom COBOL runtime library (jp.osscons.opensourcecobol.libcobj.*) and over-engineered constructs that a Java developer would not write.

The original COBOL source is provided as a reference. Use it to understand the intended program logic and ensure the refactored Java preserves the exact same semantics and input/output behaviour.

Refactor the Java code into clean, idiomatic Java 17. Remove dependencies on the custom runtime library and replace them with standard Java equivalents. Reduce function count, simplify control flow, and eliminate unnecessary complexity while preserving the exact functional behaviour defined by the COBOL source.

Output ONLY the refactored Java code with no explanations.

Original COBOL source:

{cobol_code}

Java code to refactor:

{java_code}"""


def build_prompt_b(java_code, cobol_code, error_type, error_details):
    """Prompt B — last iteration failed. Fix the error AND keep it short."""
    return f"""The following Java code was refactored from a COBOL translation but contains an error. Fix the error while also ensuring the code is clean, idiomatic Java 17 with minimal complexity.

Error type: {error_type}
Error details: {error_details}

The original COBOL source is provided as a semantic reference to help you understand the correct behaviour.

Fix the error and produce correct, idiomatic Java 17. Remove any remaining dependencies on the custom COBOL runtime library (jp.osscons.opensourcecobol.libcobj.*). Keep the code as simple and concise as possible while ensuring it produces the correct output.

Output ONLY the corrected Java code with no explanations.

Original COBOL source:

{cobol_code}

Failing Java code to fix:

{java_code}"""


def call_model(model, tokenizer, prompt):
    messages = [
        {"role": "system", "content": "You are an expert Java programmer specialising in code refactoring and modernisation."},
        {"role": "user",   "content": prompt}
    ]
    text = tokenizer.apply_chat_template(messages, tokenize=False, add_generation_prompt=True)
    model_inputs = tokenizer(text, return_tensors="pt", truncation=True,
                             max_length=100000).to(model.device)
    input_length = model_inputs["input_ids"].shape[1]
    print(f"      >> Input tokens: {input_length:,}")

    start = time.time()
    with torch.no_grad():
        generated_ids = model.generate(
            **model_inputs,
            max_new_tokens=20000,
            do_sample=False,          # DETERMINISTIC
            pad_token_id=tokenizer.pad_token_id,
        )
    print(f"      >> Generation: {time.time() - start:.1f}s")

    generated_tokens = generated_ids[0][input_length:]
    raw_output = tokenizer.decode(generated_tokens, skip_special_tokens=True)
    refactored = extract_java_code(raw_output)

    del model_inputs, generated_ids
    torch.cuda.empty_cache()
    gc.collect()

    return refactored, raw_output

# ============================================================
# SAVE HELPERS
# ============================================================

def save_java(code, pid, java_filename, subdir):
    path = os.path.join(OUTPUT_DIR, subdir, pid)
    os.makedirs(path, exist_ok=True)
    with open(os.path.join(path, java_filename), 'w', encoding='utf-8') as f:
        f.write(code)
    return os.path.join(path, java_filename)

def save_results(results):
    with open(os.path.join(OUTPUT_DIR, 'rq5_strategy4_results.json'), 'w') as f:
        json.dump(results, f, indent=2)

# ============================================================
# MAIN
# ============================================================

def main():
    print("\n" + "="*80)
    print("RQ5 STRATEGY 4 — ITERATIVE DETERMINISTIC (Qwen2.5-Coder-14B)")
    print(f"Max iterations: {MAX_ITERATIONS} | do_sample=False")
    print("Prompt A: passing code → push for maintainability")
    print("Prompt B: failing code → fix error AND keep short")
    print("Stop early if tests pass AND lizard improves")
    print("="*80)

    os.system("pip install -q lizard")

    with open(SPLIT_FILE, 'r') as f:
        split_data = json.load(f)
    dev_pids = split_data['dev']
    print(f">> Dev set: {len(dev_pids)} programs")

    model, tokenizer = setup_model()
    results       = []
    overall_start = time.time()

    for idx, pid in enumerate(dev_pids, 1):
        print(f"\n{'#'*80}")
        print(f"#  [{idx}/{len(dev_pids)}] {pid}")
        print(f"{'#'*80}")

        pid_dir    = os.path.join(COBOL4J_DEV_DIR, pid)
        java_files = sorted([f for f in os.listdir(pid_dir) if f.endswith('.java')]) \
                     if os.path.isdir(pid_dir) else []
        if not java_files:
            results.append({'problem_id': pid, 'status': 'no_java_file'})
            save_results(results)
            continue

        java_filename = java_files[0]
        with open(os.path.join(pid_dir, java_filename), 'r',
                  encoding='utf-8', errors='ignore') as f:
            original_java = f.read()

        cobol_code, cobol_err = load_cobol_file(pid)
        if not cobol_code:
            print(f">> COBOL not found ({cobol_err}), skipping")
            results.append({'problem_id': pid, 'status': 'no_cobol_file'})
            save_results(results)
            continue

        orig_lizard = run_lizard(os.path.join(pid_dir, java_filename))
        orig_score  = lizard_score(orig_lizard)
        print(f"   >> Baseline lizard score: {orig_score:.2f}" if orig_score else "   >> Baseline lizard: invalid")

        current_java  = original_java
        last_passed   = True          # original COBOL4J output passes by definition
        error_type    = None
        error_details = None
        best_code     = None
        best_score    = orig_score
        last_code     = None
        history       = []
        stopped_early = False

        for iteration in range(1, MAX_ITERATIONS + 1):
            print(f"\n   -- Iteration {iteration}/{MAX_ITERATIONS} --")

            # Choose prompt based on whether last iteration passed
            if last_passed:
                prompt = build_prompt_a(current_java, cobol_code)
                print(f"      >> Using Prompt A (improve maintainability)")
            else:
                prompt = build_prompt_b(current_java, cobol_code, error_type, error_details)
                print(f"      >> Using Prompt B (fix error + keep short)")

            refactored, raw_output = call_model(model, tokenizer, prompt)

            # Save raw
            if raw_output:
                raw_path = os.path.join(OUTPUT_DIR, f'iter{iteration}', 'raw', pid)
                os.makedirs(raw_path, exist_ok=True)
                with open(os.path.join(raw_path, java_filename), 'w') as f:
                    f.write(raw_output)

            if not refactored:
                print(f"      >> Extraction failed, continuing")
                history.append({'iteration': iteration, 'outcome': 'extraction_failed'})
                continue

            last_code = refactored
            iter_path = save_java(refactored, pid, java_filename, f'iter{iteration}/cleaned')

            # Lizard
            liz       = run_lizard(iter_path)
            liz_score = lizard_score(liz)
            print(f"      >> Lizard score: {liz_score:.2f}" if liz_score else "      >> Lizard: invalid")

            # Functional test
            passed, err_type, err_details = test_java_file(iter_path, pid)
            print(f"      >> Tests: {'PASSED' if passed else 'FAILED'} — {err_type or ''}")

            if passed and liz_score and (best_score is None or liz_score < best_score):
                # Best so far — stop early
                best_code  = refactored
                best_score = liz_score
                history.append({
                    'iteration': iteration, 'outcome': 'best',
                    'lizard': liz, 'lizard_score': liz_score,
                    'passed_tests': True, 'prompt': 'A',
                })
                print(f"      >> New best! Score: {liz_score:.2f} — stopping early")
                stopped_early = True
                break

            elif passed:
                # Passes but no lizard improvement — feed forward with Prompt A
                current_java  = refactored
                last_passed   = True
                error_type    = None
                error_details = None
                history.append({
                    'iteration': iteration, 'outcome': 'passed_no_improvement',
                    'lizard': liz, 'lizard_score': liz_score, 'passed_tests': True,
                })

            else:
                # Failed — feed forward with Prompt B
                current_java  = refactored
                last_passed   = False
                error_type    = err_type
                error_details = err_details
                history.append({
                    'iteration': iteration, 'outcome': 'tests_failed',
                    'lizard': liz, 'lizard_score': liz_score,
                    'passed_tests': False, 'error_type': err_type,
                })

        # Save best or last
        final_code = best_code if best_code else last_code
        if final_code:
            save_java(final_code, pid, java_filename, 'cleaned')
            print(f"\n   >> Saved {'best (early stop)' if best_code else 'last iteration'} to cleaned/")

        results.append({
            'problem_id':     pid,
            'java_file':      java_filename,
            'status':         'processed',
            'baseline_score': orig_score,
            'best_score':     best_score if best_code else None,
            'improvement':    (orig_score - best_score) if (orig_score and best_code and best_score) else None,
            'stopped_early':  stopped_early,
            'saved':          'best' if best_code else ('last_iter' if last_code else 'none'),
            'history':        history,
        })
        save_results(results)

    overall_time = time.time() - overall_start
    total        = len(results)
    improved     = sum(1 for r in results if r.get('saved') == 'best')
    fallback     = sum(1 for r in results if r.get('saved') == 'last_iter')
    early        = sum(1 for r in results if r.get('stopped_early'))

    print(f"\n{'='*80}")
    print(f"FINAL SUMMARY — STRATEGY 4 (DETERMINISTIC)")
    print(f"Total:         {total}")
    print(f"Improved:      {improved}")
    print(f"Early stopped: {early}")
    print(f"Fallback:      {fallback}")
    print(f"Time:          {overall_time/60:.1f} minutes")
    print(f"{'='*80}")

if __name__ == "__main__":
    main()