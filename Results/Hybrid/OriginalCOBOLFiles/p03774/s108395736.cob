IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_057_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 i      PIC 9(2).
    01 j      PIC 9(2).

    01 INP    PIC X(5).
    01 INP2   PIC X(21).

    01 N      PIC 9(2).
    01 M      PIC 9(2).

    01 st1.
        03 st11 OCCURS 50.
            05 stx PIC S9(9).
            05 sty PIC S9(9).

    01 pt1.
        03 pt11 OCCURS 50.
            05 ptx PIC S9(9).
            05 pty PIC S9(9).

    01 dt     PIC 9(9).
    01 dtx    PIC 9(9).
    01 dty    PIC 9(9).

    01 mn     PIC 9(9).
    01 p      PIC 9(2).

    01 ans    PIC X(2).

    01 ZS     PIC Z(2)9.
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO N M.

    PERFORM VARYING i FROM 1 BY 1 UNTIL N < i
        ACCEPT INP2

        UNSTRING INP2
        DELIMITED BY SPACE
        INTO stx(i) sty(i)
    END-PERFORM.

    PERFORM VARYING i FROM 1 BY 1 UNTIL M < i
        ACCEPT INP2

        UNSTRING INP2
        DELIMITED BY SPACE
        INTO ptx(i) pty(i)
    END-PERFORM.

    PERFORM VARYING i FROM 1 BY 1 UNTIL N < i

        MOVE 200000001 TO mn

        PERFORM VARYING j FROM 1 BY 1 UNTIL M < j
            SUBTRACT ptx(j) FROM stx(i) GIVING dtx
            SUBTRACT pty(j) FROM sty(i) GIVING dty
            ADD dtx TO dty GIVING dt
            IF dt < mn THEN
                MOVE dt TO mn
                MOVE j TO p
            END-IF
        END-PERFORM

        MOVE p TO ZS

        PERFORM UNANS

        DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans))

    END-PERFORM.

    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
