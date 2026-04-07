IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_067_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(7).
    01 A      PIC 9(3).
    01 B      PIC 9(3).

    01 MODA   PIC 9(1).
    01 MODB   PIC 9(1).
    01 MODAB  PIC 9(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO A B.

    COMPUTE MODA = FUNCTION MOD(A, 3).
    COMPUTE MODB = FUNCTION MOD(B, 3).
    ADD A TO B.
    COMPUTE MODAB = FUNCTION MOD(B, 3).

    IF MODA = 0 OR MODB = 0 OR MODAB = 0 THEN
        DISPLAY "Possible"
    ELSE
        DISPLAY "Impossible"
    END-IF.

    STOP RUN.
