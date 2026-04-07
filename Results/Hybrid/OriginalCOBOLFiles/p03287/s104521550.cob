PROGRAM-ID.                      ABC_105_D.
ENVIRONMENT                      DIVISION.
INPUT-OUTPUT                     SECTION.
FILE-CONTROL.
    SELECT SYSIN ASSIGN TO KEYBOARD ORGANIZATION LINE SEQUENTIAL.

DATA                             DIVISION.
FILE                             SECTION.
    FD  SYSIN.
        01 INDATA PIC X(1100000).

WORKING-STORAGE                  SECTION.
    01 NM      PIC X(17).
    01 N       PIC 9(6).
    01 M       PIC 9(10).
    01 INP     PIC X(1100000).

    01 X1.
        03 X11 OCCURS 100000.
            05 X PIC 9(15).

    01 sx      PIC 9(15).

    01 Y1.
        03 Y11 OCCURS 100000 DEPENDING N ASCENDING Y.
            05 Y PIC 9(15).

    01 bk      PIC 9(10).

    01 Z1.
        03 ZNUM PIC 9(6) VALUE ZERO.
        03 Z11 OCCURS 100000 DEPENDING ZNUM ASCENDING Z INDEXED BY K.
            05 Z PIC 9(15).
            05 ZCNT PIC 9(6) VALUE ZERO.

    01 flg     PIC 9(1).
    01 ky      PIC 9(15).

    01 tmp     PIC 9(10).
    01 r       PIC 9(10).
    01 sm      PIC 9(24).

    01 zc      PIC 9(12).

    01 maxlen  PIC 9(7).
    01 cur     PIC 9(7) VALUE 1.
    01 i       PIC 9(7) VALUE 1.
    01 j       PIC 9(7).
    01 len     PIC 9(7).

    01 ans     PIC X(24).

    01 ZS      PIC Z(24)9.
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT NM.

    UNSTRING NM
    DELIMITED BY SPACE
    INTO N M.

    OPEN INPUT SYSIN.

    READ SYSIN INTO INP.

    CLOSE SYSIN.

*>    DISPLAY FUNCTION STORED-CHAR-LENGTH(INP)

    MOVE N TO maxlen.

    MOVE ZERO TO sx.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO tmp

        ADD tmp TO sx

        MOVE sx TO X(i)

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    PERFORM VARYING i FROM 1 BY 1 UNTIL maxlen < i

        COMPUTE ky = FUNCTION MOD(X(i), M)

        MOVE ky TO Y(i)

    END-PERFORM.

    SORT Y11 ASCENDING Y.

    MOVE 9999999999 TO bk.

    PERFORM VARYING i FROM 1 BY 1 UNTIL maxlen < i

        IF bk = Y(i) THEN
            ADD 1 TO ZCNT(ZNUM)
        ELSE
            MOVE Y(i) TO bk
            ADD 1 TO ZNUM
            MOVE Y(i) TO Z(ZNUM)
            ADD 1 TO ZCNT(ZNUM)
        END-IF

    END-PERFORM.

    MOVE ZERO TO sm.

    PERFORM VARYING i FROM 1 BY 1 UNTIL ZNUM < i
*> pair
        SUBTRACT 1 FROM ZCNT(i) GIVING zc
        COMPUTE zc = ZCNT(i) * zc
        DIVIDE 2 INTO zc
        COMPUTE sm = sm + zc
        IF ZERO = Z(i)
*> alone
            COMPUTE sm = sm + ZCNT(i)
        END-IF
    END-PERFORM.

    MOVE sm TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
