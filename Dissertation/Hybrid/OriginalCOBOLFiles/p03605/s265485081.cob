IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_073_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(2).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    IF INP(1:1) = 9 OR INP(2:1) = 9 THEN
        DISPLAY "Yes"
    ELSE
        DISPLAY "No"
    END-IF

    STOP RUN.
