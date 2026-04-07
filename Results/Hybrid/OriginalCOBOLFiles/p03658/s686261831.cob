IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_067_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 NK     PIC X(5).
    01 N      PIC 9(2).
    01 K      PIC 9(2).

    01 mx     PIC 9(4).

    01 INP    PIC X(2550).
    01 maxlen PIC 9(2).
    01 cur    PIC 9(4)  VALUE 1.
    01 i      PIC 9(18).
    01 j      PIC 9(18).
    01 len    PIC 9(4).

    01 qary1.
        03 qary11 OCCURS 100.
            05 qary    PIC 9(2).

    01 stack1.
        03 stack11 OCCURS 1000.
            05 st    PIC 9(2).
            05 ed    PIC 9(2).

    01 sidx   PIC 9(2) VALUE 0.
    01 nowidx PIC 9(2) VALUE 0.

    01 sttmp  PIC 9(2).
    01 edtmp  PIC 9(2).

    01 a      PIC 9(2).
    01 b      PIC 9(2).

    01 t      PIC 9(2).
    01 x      PIC 9(2).

    01 qfirst PIC 9(2).
    01 qlast  PIC 9(2).
    01 q      PIC 9(2).

    01 ret    PIC 9(2).
    01 bk     PIC 9(2).

    01 ZS     PIC Z(5).
    01 ans    PIC X(4).

    01 DUMMY  PIC X(1).

    01 FLG    PIC 9(1).

    01 num    PIC 9(3) VALUE 0.

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT NK.

    UNSTRING NK
    DELIMITED BY SPACE
    INTO N K.

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

    MOVE 1 TO qfirst.
    MOVE N TO qlast.

    PERFORM PARTITION.

    MOVE 1 TO FLG.

    PERFORM UNTIL FLG = 0
        PERFORM QSORT
        IF FLG = 0 THEN
            IF nowidx < sidx THEN
                MOVE 1 TO FLG
                ADD 1 TO nowidx
                MOVE st(nowidx) TO qfirst
                MOVE ed(nowidx) TO qlast
                PERFORM PARTITION
            END-IF
        END-IF
    END-PERFORM.

    MOVE 0 TO mx.

    PERFORM VARYING i FROM N BY -1 UNTIL i <= N - K
        ADD qary(i) TO mx
    END-PERFORM.

    MOVE mx TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.

PARTITION                        SECTION.
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

QSORT                            SECTION.
    IF qfirst < qlast THEN
        MOVE q TO ret

        MOVE qlast TO bk
        SUBTRACT 1 FROM ret GIVING qlast

        ADD 1 ret GIVING sttmp
        MOVE bk TO edtmp

        IF sttmp < edtmp THEN
            ADD 1 TO sidx
            MOVE sttmp TO st(sidx)
            MOVE edtmp TO ed(sidx)
        END-IF

        IF qfirst < qlast THEN
            PERFORM PARTITION
        ELSE
            MOVE 0 TO FLG
        END-IF
    ELSE
        MOVE 0 TO FLG
    END-IF.
