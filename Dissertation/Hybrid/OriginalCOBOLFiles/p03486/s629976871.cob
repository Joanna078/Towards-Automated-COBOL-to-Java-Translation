IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_082_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(101).
    01 INP2   PIC X(101).

    01 i      PIC 9(18).
    01 j      PIC 9(18).

    01 sary1.
        03 sary11 OCCURS 100.
            05 qary    PIC X(1).

    01 tary1.
        03 tary11 OCCURS 100.
            05 qary    PIC X(1).

    01 qary1.
        03 qary11 OCCURS 100.
            05 qary    PIC X(1).

    01 stack1.
        03 stack11 OCCURS 1000.
            05 st    PIC 9(3).
            05 ed    PIC 9(3).

    01 sidx   PIC 9(4) VALUE 0.
    01 nowidx PIC 9(4) VALUE 0.

    01 sttmp  PIC 9(3).
    01 edtmp  PIC 9(3).

    01 a      PIC 9(3).
    01 b      PIC 9(3).

    01 t      PIC X(1).
    01 x      PIC X(1).

    01 qfirst PIC 9(3).
    01 qlast  PIC 9(3).
    01 q      PIC 9(3).

    01 slast  PIC 9(3).
    01 tlast  PIC 9(3).
    01 xlast  PIC 9(3).

    01 ret    PIC 9(3).
    01 bk     PIC 9(3).

    01 ZS     PIC Z(5)9.
    01 ans    PIC X(5).

    01 DUMMY  PIC X(1).

    01 FLG    PIC 9(1).

    01 judge  PIC 9(1) VALUE 9.

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    ACCEPT INP2.

    PERFORM VARYING i FROM 1 BY 1 UNTIL INP(i:1) = SPACE
        MOVE INP(i:1) TO qary OF qary11(i)
    END-PERFORM.

    SUBTRACT 1 FROM i.
    MOVE i TO slast.

    MOVE 1 TO qfirst.
    MOVE slast TO qlast.

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

    PERFORM VARYING i FROM 1 BY 1 UNTIL slast < i
        MOVE qary OF qary11(i) TO qary OF sary11(i)
    END-PERFORM.

    INITIALIZE qary1.
    INITIALIZE stack1.

    PERFORM VARYING i FROM 1 BY 1 UNTIL INP2(i:1) = SPACE
        MOVE INP2(i:1) TO qary OF qary11(i)
    END-PERFORM.

    SUBTRACT 1 FROM i.
    MOVE i TO tlast.

    MOVE 1 TO qfirst.
    MOVE tlast TO qlast.

    COMPUTE xlast = FUNCTION MIN(slast, qlast).

    PERFORM PARTITION.

    MOVE 0 TO sidx.
    MOVE 0 TO nowidx.

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

    MOVE tlast TO j.

    PERFORM VARYING i FROM 1 BY 1 UNTIL tlast < i
        MOVE qary OF qary11(j) TO qary OF tary11(i)
        SUBTRACT 1 FROM j
    END-PERFORM.

    PERFORM VARYING i FROM 1 BY 1 UNTIL xlast < i
        IF qary OF sary11(i) < qary OF tary11(i) THEN
            MOVE 1 TO judge
            EXIT PERFORM
        ELSE
            IF qary OF tary11(i) < qary OF sary11(i) THEN
                MOVE 0 TO judge
                EXIT PERFORM
            END-IF
        END-IF
    END-PERFORM.

    IF tlast <= slast AND judge = 9 THEN
        MOVE 0 TO judge
    END-IF

    IF judge = 0 THEN
        DISPLAY "No"
    ELSE
        DISPLAY "Yes"
    END-IF.

    STOP RUN.

PARTITION                        SECTION.
    MOVE qary OF qary11(qlast) TO x
    MOVE qfirst TO a

    SUBTRACT 1 FROM a

    PERFORM VARYING b FROM qfirst BY 1 UNTIL qlast <= b
        IF qary OF qary11(b) <= x THEN
            ADD 1 TO a
            MOVE qary OF qary11(a) TO t
            MOVE qary OF qary11(b) TO qary OF qary11(a)
            MOVE t TO qary OF qary11(b)
        END-IF
    END-PERFORM

    ADD 1 TO a
    MOVE qary OF qary11(a) TO t
    MOVE qary OF qary11(qlast) TO qary OF qary11(a)
    MOVE t TO qary OF qary11(qlast)
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
