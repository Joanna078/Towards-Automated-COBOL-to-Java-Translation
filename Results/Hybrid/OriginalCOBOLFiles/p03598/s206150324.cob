IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_074_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(3).
    01 K      PIC 9(3).

    01 INP    PIC X(300).
    01 maxlen PIC 9(3).
    01 cur    PIC 9(3)  VALUE 1.
    01 i      PIC 9(18) VALUE 1.
    01 j      PIC 9(18).
    01 len    PIC 9(3).
    01 ans    PIC X(5).

    01 x      PIC 9(3).

    01 sm     PIC 9(5)  VALUE 0.

    01 ZS     PIC Z(6).
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.
    ACCEPT K.
    ACCEPT INP.

    MOVE N TO maxlen.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO x

        COMPUTE x = FUNCTION MIN(x, K - x)
        MULTIPLY 2 BY x
        ADD x TO sm

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    MOVE sm TO ZS

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
