IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_070_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(15).
    01 A      PIC 9(3).
    01 B      PIC 9(3).
    01 C      PIC 9(3).
    01 D      PIC 9(3).
    01 mx     PIC 9(3).
    01 mn     PIC 9(3).

    01 ZS     PIC Z(3)9.
    01 DUMMY  PIC X(1).
    01 ans    PIC X(3).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO A B C D.

    COMPUTE mx = FUNCTION MAX(A, C).
    COMPUTE mn = FUNCTION MIN(B, D).

    IF mx < mn THEN
        SUBTRACT mx FROM mn
    ELSE
        MOVE ZERO to MN
    END-IF.

    MOVE mn TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
