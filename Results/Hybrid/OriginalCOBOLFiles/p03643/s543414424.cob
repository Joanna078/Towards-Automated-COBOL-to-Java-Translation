IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_068_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC X(3).
    01 ans    PIC X(18).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    DISPLAY "ABC" N.
    STOP RUN.
