IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_064_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(3).

    01 INP    PIC X(800).
    01 maxlen PIC 9(3).
    01 cur    PIC 9(3)  VALUE 1.
    01 i      PIC 9(18) VALUE 1.
    01 j      PIC 9(18).
    01 len    PIC 9(3).

    01 mn     PIC 9(4) VALUE 1001.
    01 mx     PIC 9(4) VALUE 0.

    01 ans    PIC X(4).

    01 a      PIC 9(4).

    01 ZS     PIC Z(4)9.
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.
    ACCEPT INP.

    MOVE N TO maxlen.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO a

        COMPUTE mn = FUNCTION min(mn, a)
        COMPUTE mx = FUNCTION max(mx, a)

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    SUBTRACT mn FROM mx.

    MOVE mx TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
