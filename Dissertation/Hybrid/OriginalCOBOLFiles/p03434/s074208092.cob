IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_088_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(600).
    01 maxlen PIC 9(3).
    01 cur    PIC 9(3)  VALUE 1.
    01 i      PIC 9(18).
    01 j      PIC 9(18).
    01 len    PIC 9(3).

    01 N      PIC 9(3).

    01 qary1.
        03 qary11 OCCURS 100.
            05 qary    PIC 9(3).

    01 a      PIC 9(3).
    01 b      PIC 9(3).

    01 t      PIC 9(3).
    01 x      PIC 9(3).

    01 qfirst PIC 9(3) VALUE 1.
    01 qlast  PIC 9(3).
    01 q      PIC 9(3).

    01 alice  PIC 9(5) VALUE 0.
    01 bob    PIC 9(5) VALUE 0.

    01 D      PIC 9(5).
    01 R      PIC 9(5).

    01 ZS     PIC Z(5)9.
    01 ans    PIC X(5).

    01 DUMMY  PIC X(1).

    01 FLG    PIC 9(1).

    01 num    PIC 9(3) VALUE 0.

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    ACCEPT INP.

    MOVE N TO maxlen.

    PERFORM VARYING i FROM 1 BY 1 UNTIL maxlen < i

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO qary(i)

        COMPUTE cur = j + 1

    END-PERFORM.

    MOVE N TO qlast.

    MOVE 1 TO FLG.

    PERFORM UNTIL FLG = 0
        IF qfirst < qlast THEN
            PERFORM QSORT
            IF qfirst < q - 1 THEN
                SUBTRACT 1 FROM q
                MOVE q TO qlast
                PERFORM QSORT
            ELSE
                IF q + 1 < qlast THEN
                    ADD 1 TO q
                    MOVE q TO qfirst
                    PERFORM QSORT
                ELSE
                    MOVE 0 TO FLG
                END-IF
            END-IF
        ELSE
            MOVE 0 TO FLG
        END-IF
    END-PERFORM.

    PERFORM VARYING i FROM N BY -1 UNTIL i <= 0
        ADD 1 TO num
        DIVIDE 2 INTO num GIVING D REMAINDER R
        IF R = 0 THEN
            ADD qary(i) TO bob
        ELSE
            ADD qary(i) TO alice
        END-IF
    END-PERFORM.

    SUBTRACT bob FROM alice.
    MOVE alice TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.

QSORT                            SECTION.
    MOVE qary(qlast) TO x
    MOVE qfirst TO a

    SUBTRACT 1 FROM a

    PERFORM VARYING b FROM qfirst BY 1 UNTIL qlast <= b
        IF qary(b) <= x THEN
            ADD 1 TO a
            MOVE qary(a) TO t
            MOVE qary(b) TO qary(a)
            MOVE t TO qary(b)
        END-IF
    END-PERFORM

    ADD 1 TO a
    MOVE qary(a) TO t
    MOVE qary(qlast) TO qary(a)
    MOVE t TO qary(qlast)
    MOVE a TO q.
