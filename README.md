# Towards-Automated-COBOL-to-Java-Translation

This repository provides the code and supporting results for the Dissertation titled "Towards Fully Automated COBOL-To-Java Translation". It is organized into two sections:

Python_Scripts which contains all the .py scripts run to produce the results:

- CodeNet.ipynb - This notebook contains the code segments used to load Project CodeNet from IBM and extract the COBOL and Java focused dataset that we use.
  
  - Translations.ipynb - This notebook contains the code segments used to perform the translations for 3 translators - opensource COBOL4J, XMAiNframe-instruct-7b and Qwen2.5-Coder-7B-Instruc.
    
  - Tests.ipynb - This notebook contains the code segments to construct our testing pipeline to assess functional correctness using compilation / runtime / test pass rates, and code maintainability using Lizard.
    
  - BugTaxonomy.ipynb - This notebook contains the code segments used to build the stratified samples for manual bug inspection, and support functions that help in the analysis process by printing COBOL code, translated Java, and error messages together.
 
  - Hybrid Scripts: This folder contains the scripts used for the hybrid experiments across Strategy 1-5.
    
        - COBOL4Jscripts - v1.py to v5.py scripts for each strategy
        - qwenscripts - v1.py to v5.py scripts for each strategy
        - xmainframescripts - v1.py to v5.py scripts for each strategy
        - Original_Translations - Contains the original translations for each tool for passing in as context in the hybrid                   experiments
  
  - HybridPromptFinetuning.ipynb - This notebook contains the functional tests for the results of the hybrid experiments, and getting statistics like how many tests passed per iteration.
    
  - java_and_cobol.txt - This is a text file containing the Problem IDs (PIDs) of CodeNet problems that have at least one COBOL and one Java submission, along with their input and output test values.

Results which contain the code translations obtained for each experiment.
