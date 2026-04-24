# Towards Automated COBOL-to-Java Translation

This repository contains the code, scripts, and results for the dissertation project "Towards Automated COBOL-to-Java Translation". The project explores automated translation techniques from COBOL to Java, including repair pipelines, refactoring strategies, and evaluation methodologies.

The repository is organized into two main directories: `Python_Scripts` for the implementation and analysis scripts, and `Results` for the experimental outputs and data.

---

## Python_Scripts

This directory contains Jupyter notebooks and Python scripts used for data processing, translation, testing, and analysis.

- **Python_Scripts/**
  - **Notebooks/**
    - **`CodeNet.ipynb`** — Loads Project CodeNet dataset from IBM and extracts the COBOL and Java focused dataset used in the dissertation.
    - **`Translations.ipynb`** — Executes translations using three tools: COBOL4J, XMAiNframe-instruct-7b, and Qwen2.5-Coder-7B-Instruct.
    - **`Tests.ipynb`** — Implements the testing pipeline to evaluate functional correctness (compilation, runtime, test pass rates) and maintainability using Lizard static analysis.
    - **`BugTaxonomy.ipynb`** — Creates stratified samples for manual bug inspection, displaying COBOL source, translated Java, and error messages for analysis.
    - **`RefactoringPipeline_helper.ipynb`** — Helper notebook for the refactoring pipeline experiments.
    - **`RepairPipeline_helper.ipynb`** — Helper notebook for the repair pipeline experiments.
  - **Data Files/**
    - **`java_and_cobol.txt`** — Lists Problem IDs (PIDs) that have at least one COBOL and one Java submission, including their test input/output values.
  - **Script Directories/**
    - **RefactoringPipeline_Scripts/**
      - `s1.py` — Strategy 1 implementation
      - `s2.py` — Strategy 2 implementation
      - `s3.py` — Strategy 3 implementation
      - `s4.py` — Strategy 4 implementation
    - **RepairPipeline_Scripts/**
      - **COBOL4Jscripts/**
        - `v1.py` to `v5.py` — Versions/implementations for COBOL4J repair strategies
      - **qwenscripts/**
        - `v1.py` to `v5.py` — Versions/implementations for Qwen repair strategies
      - **xmainframescripts/**
        - `v1.py` to `v5.py` — Versions/implementations for XMainframe repair strategies

---

## Results

This directory contains the experimental results, analysis data, and evaluation outputs from the various research questions and experiments.

- **Results/**
  - **Bug Taxonomy/**
    - **Functional/**
      - **cobol4j_results/** - Results for COBOL4J translations
      - **jsons_functional_testing/** — JSON files for functional testing results
      - **Qwen_results/** — Results for Qwen translations
      - **XMainframe_results/** — Results for XMainframe translations
  - **RefactoringPipeline/**
    - **holdout_results/** — Holdout set evaluation results
    - **rq5_strategy1_results/** — Results for RQ5 Strategy 1
    - **rq5_strategy2_results/** — Results for RQ5 Strategy 2
    - **rq5_strategy3_results/** — Results for RQ5 Strategy 3
    - **rq5_strategy4_results/** — Results for RQ5 Strategy 4
  - **RepairPipeline/**
    - **Results/** — Main results directory, with the detailed results of 5 iterations and holdout
run per tool
    - **Stratified_Sampling/** — Data related to stratified sampling methodology
  - **Static/**
    - `static_analysis_cobol4j.json` — Static analysis for COBOL4J translations
    - `staticanalysis_qwen.json` — Static analysis for Qwen translations
    - `staticanalysis_xmainframe.json` — Static analysis for XMainframe translations

---

## Getting Started

To reproduce the experiments or analyze the results:

1. Ensure you have Python and required dependencies installed
2. Run the notebooks in `Python_Scripts/` in order (starting with `CodeNet.ipynb` `Translations.ipynb` `Tests.ipynb`)
3. Execute the scripts in the respective subdirectories as needed for Repair and Refactoring pipelines, following the details in the Methodology section of the report.
4. Review results in the `Results/` directory

For detailed methodology and research questions, refer to the dissertation document.

## License

This project is part of academic research. Please cite appropriately if used in other works.
