IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_061_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(5).
    01 N      PIC 9(2).
    01 M      PIC 9(2).

    01 INP2   PIC X(10).

    01 i      PIC 9(18).

    01 len    PIC 9(10).

    01 a      PIC 9(2).
    01 b      PIC 9(2).

    01 town1.
        03 town11 OCCURS 50.
            05 town PIC 9(2) VALUE 0.

    01 ans    PIC X(2).

    01 ZS     PIC Z(2)9.
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO N M.

    PERFORM VARYING i FROM 1 BY 1 UNTIL M < i
        ACCEPT INP2

        UNSTRING INP2
        DELIMITED BY SPACE
        INTO a b

        ADD 1 TO town(a)
        ADD 1 TO town(b)
    END-PERFORM.

    PERFORM VARYING i FROM 1 BY 1 UNTIL N < i
        MOVE town(i) TO ZS

    PERFORM UNANS

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans))

    END-PERFORM.

    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
