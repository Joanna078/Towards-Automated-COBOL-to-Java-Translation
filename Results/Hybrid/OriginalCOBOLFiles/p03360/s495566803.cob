IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_096_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(10).
    01 K      PIC 9(2).

    01 maxlen PIC 9(1)  VALUE 3.
    01 cur    PIC 9(2)  VALUE 1.
    01 i      PIC 9(18) VALUE 1.
    01 j      PIC 9(18).
    01 len    PIC 9(2).

    01 mx     PIC 9(5).
    01 tmp    PIC 9(5).
    01 ans    PIC X(5).
    01 ZS     PIC Z(6).
    01 ABC1.
        03 ABC11 OCCURS 3.
            05 ABC PIC 9(2).

    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    ACCEPT K.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO ABC(i)

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    ADD ABC(1) ABC(2) ABC(3) TO tmp.
    COMPUTE mx = FUNCTION MAX(ABC(1), ABC(2), ABC(3)).

    SUBTRACT mx FROM tmp.
    COMPUTE mx = mx * (2 ** K).
    ADD mx TO tmp.

    MOVE tmp TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
