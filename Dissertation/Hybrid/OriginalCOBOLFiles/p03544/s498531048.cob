IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_079_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(2).
    01 i      PIC 9(2).
    01 tmp    PIC 9(18).
    01 ppr    PIC 9(18).
    01 pr     PIC 9(18).
    01 lucas  PIC 9(18).
    01 ans    PIC X(18).
    01 ZS     PIC Z(18)9.
    01 DUMMY  PIC X(1).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    PERFORM LUCASNUMBER.

    MOVE lucas TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.

LUCASNUMBER                      SECTION.
    MOVE 2 TO ppr.
    MOVE 1 TO pr.

    PERFORM VARYING i FROM 2 BY 1 UNTIL N < i
        ADD ppr pr GIVING lucas
        MOVE pr TO ppr
        MOVE lucas TO pr
    END-PERFORM.

    IF N = 1 THEN
        MOVE 1 TO lucas
    END-IF.
