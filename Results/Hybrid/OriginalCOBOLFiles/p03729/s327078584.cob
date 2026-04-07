IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_060_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(32).
    01 A      PIC X(10).
    01 B      PIC X(10).
    01 C      PIC X(10).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO A B C.

    IF A(FUNCTION STORED-CHAR-LENGTH(A):1) = B(1:1)
        AND B(FUNCTION STORED-CHAR-LENGTH(B):1) = C(1:1) THEN
            DISPLAY "YES"
    ELSE
        DISPLAY "NO"
    END-IF.

    STOP RUN.
