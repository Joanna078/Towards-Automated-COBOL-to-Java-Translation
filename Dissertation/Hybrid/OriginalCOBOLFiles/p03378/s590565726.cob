IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_094_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(12).

    01 INP2   PIC X(401).

    01 maxlen PIC 9(1)  VALUE 3.
    01 cur    PIC 9(2)  VALUE 1.
    01 i      PIC 9(18) VALUE 1.
    01 j      PIC 9(18).

    01 m      PIC 9(3).
    01 n      PIC 9(3).

    01 len    PIC 9(2).
    01 ans    PIC X(3).
    01 NMX1.
        03 NMX11 OCCURS 3.
            05 NMX PIC 9(3).
    01 A1.
        03 A11 OCCURS 100.
            05 A PIC 9(1) VALUE 0.

    01 x      PIC 9(3).

    01 tmp    PIC 9(3).
    01 sm     PIC 9(3) VALUE 101.
    01 ZS     PIC Z(3)9.

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

        MOVE INP(cur:len) TO NMX(i)

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    MOVE 1 TO cur.
    MOVE NMX(2) TO maxlen.
    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP2(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP2(cur:len) TO x
        MOVE 1 TO A(x)

        COMPUTE cur = j + 1

    END-PERFORM.

    MOVE 0 TO tmp.
    PERFORM VARYING m FROM NMX(3) BY 1 UNTIL NMX(1) < m
        ADD A(m) TO tmp
    END-PERFORM.

    COMPUTE sm = FUNCTION MIN(sm, tmp).

    MOVE 0 TO tmp.
    PERFORM VARYING n FROM NMX(3) BY -1 UNTIL n <= 0
        ADD A(n) TO tmp
    END-PERFORM.

    COMPUTE sm = FUNCTION MIN(sm, tmp).

    MOVE sm TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
