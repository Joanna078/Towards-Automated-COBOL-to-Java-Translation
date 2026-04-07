IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_066_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(17).
    01 a      PIC 9(5).
    01 b      PIC 9(5).
    01 c      PIC 9(5).
    01 ans    PIC X(5).

    01 tmp    PIC 9(5).

    01 ZS     PIC Z(6).
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO a b c.

    ADD a b TO c GIVING tmp.

    COMPUTE c = FUNCTION MAX(a, b, c).

    SUBTRACT tmp FROM c.

    MOVE c TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
