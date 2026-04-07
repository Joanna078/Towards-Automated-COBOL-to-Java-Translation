PROGRAM-ID.                      ABC_107_B.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP     PIC X(7).
    01 INP2    PIC X(100).

    01 H       PIC 9(3).
    01 W       PIC 9(3).

    01 i       PIC 9(3) BINARY.
    01 j       PIC 9(3) BINARY.

    01 a1.
        03 a PIC X(100) OCCURS 100 INDEXED AX.

    01 cntH1.
        03 cntH PIC 9(1) OCCURS 100 INDEXED HX VALUE ZERO.

    01 cntW1.
        03 cntW PIC 9(1) OCCURS 100 INDEXED WX VALUE ZERO.

    01 cnt     PIC 9(3) VALUE ZERO.

    01 c       PIC 9(3) VALUE ZERO.

    01 flgH    PIC 9(1).
    01 flgW    PIC 9(1).

    01 st      PIC X(100).

PROCEDURE                        DIVISION.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO H W.

    PERFORM VARYING i FROM 1 BY 1 UNTIL H < i
        SET AX TO i
        ACCEPT a(AX)
    END-PERFORM

    MOVE 1 TO flgH

    PERFORM VARYING i FROM 1 BY 1 UNTIL H < i
        MOVE 1 TO flgH
        PERFORM VARYING j FROM 1 BY 1 UNTIL W < j
            SET AX TO i
            IF a(AX)(j:1) = '#'
                MOVE ZERO TO flgH
                EXIT PERFORM
            END-IF
        END-PERFORM
        IF 1 = flgH
            SET HX TO i
            MOVE 1 TO cntH(HX)
        END-IF
    END-PERFORM.

    PERFORM VARYING i FROM 1 BY 1 UNTIL W < i
        MOVE 1 TO flgW
        PERFORM VARYING j FROM 1 BY 1 UNTIL H < j
            SET AX TO j
            IF a(AX)(i:1) = '#'
                MOVE ZERO TO flgW
                EXIT PERFORM
            END-IF
        END-PERFORM
        IF 1 = flgW
            SET WX TO i
            MOVE 1 TO cntW(WX)
            ADD 1 TO cnt
        END-IF
    END-PERFORM.

    PERFORM VARYING i FROM 1 BY 1 UNTIL H < i
        SET HX TO i
        SET AX TO i
        IF ZERO = cntH(HX)

            MOVE ZERO TO c
            PERFORM VARYING j FROM 1 BY 1 UNTIL W < j
                SET WX TO j
                IF ZERO = cntW(WX)
                    MOVE a(AX)(j:1) TO st(j - c:1)
                ELSE
                    ADD 1 TO c
                END-IF
            END-PERFORM

            DISPLAY st(1:FUNCTION STORED-CHAR-LENGTH(st))

        END-IF

    END-PERFORM.

    STOP RUN.
