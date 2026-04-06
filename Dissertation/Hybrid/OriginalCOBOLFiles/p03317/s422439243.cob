IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_101_C.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(14).
    01 INP2   PIC X(700000).
    01 maxlen PIC 9(1)  VALUE 2.
    01 cur    PIC 9(2)  VALUE 1.
    01 i      PIC 9(18) VALUE 1.
    01 j      PIC 9(18).
    01 len    PIC 9(2).

    01 X      PIC 9(6).
    01 R      PIC 9(6).

    01 NK1.
        03 NK11 OCCURS 2.
            05 NK PIC 9(6).

    01 ans    PIC X(6).
    01 ZS     PIC Z(6).
    01 DUMMY  PIC X(1).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.
    ACCEPT INP2.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO NK(i)

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

*> N <= K + (K - 1) * (G - 1)
*> (N - K) / (K - 1) + 1

    SUBTRACT NK(2) FROM NK(1).
    SUBTRACT 1 FROM NK(2).

    DIVIDE NK(2) INTO NK(1) GIVING X REMAINDER R.

    IF R NOT = 0 THEN
       ADD 1 TO X
    END-IF.

    ADD 1 TO X.
    MOVE X TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
