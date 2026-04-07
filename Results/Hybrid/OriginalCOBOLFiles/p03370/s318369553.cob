IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_095_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(11).
    01 INP2   PIC 9(4).
    01 maxlen PIC 9(1)  VALUE 2.
    01 cur    PIC 9(2)  VALUE 1.

    01 i      PIC 9(18) VALUE 1.
    01 j      PIC 9(18).
    01 k      PIC 9(18).

    01 len    PIC 9(2).

    01 ans    PIC X(8).

    01 NX1.
        03 NX11 OCCURS 2.
            05 NX PIC 9(8).

    01 tmp    PIC 9(8).

    01 mn     PIC 9(6).
    01 sm     PIC 9(6).
    01 x      PIC 9(6).

    01 ZS     PIC Z(9).
    01 DUMMY  PIC X(1).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO NX(i)

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    MOVE 0 TO sm.
    MOVE 1001 TO mn.
    PERFORM VARYING k FROM 1 BY 1 UNTIL NX(1) < k
        ACCEPT INP2
        ADD INP2 TO sm
        COMPUTE mn = FUNCTION MIN(mn, INP2)
    END-PERFORM.

    SUBTRACT sm FROM NX(2) GIVING tmp.
    DIVIDE mn INTO tmp GIVING x.

    ADD x TO NX(1).
    MOVE NX(1) TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
