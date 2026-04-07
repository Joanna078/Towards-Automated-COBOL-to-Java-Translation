IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_092_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 A      PIC 9(4).
    01 B      PIC 9(4).
    01 C      PIC 9(4).
    01 D      PIC 9(4).

    01 X      PIC 9(4).
    01 Y      PIC 9(4).

    01 ZS     PIC Z(5).
    01 ans    PIC X(4).
    01 DUMMY  PIC X(1).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT A.
    ACCEPT B.
    ACCEPT C.
    ACCEPT D.

    MOVE FUNCTION MIN(A, B) TO X.
    MOVE FUNCTION MIN(C, D) TO Y.

    ADD X TO Y.

    MOVE Y TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
