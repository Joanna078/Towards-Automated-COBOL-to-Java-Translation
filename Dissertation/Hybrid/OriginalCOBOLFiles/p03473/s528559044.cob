IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_084_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 M      PIC 9(2).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT M.

    SUBTRACT M FROM 48 GIVING M.

    DISPLAY M.
    STOP RUN.
