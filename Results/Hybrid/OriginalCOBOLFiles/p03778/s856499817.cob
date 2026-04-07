IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_056_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(20).
    01 W      PIC 9(6).
    01 a      PIC 9(6).
    01 b      PIC 9(6).
    01 ans    PIC X(6).

    01 tmp    PIC 9(6).

    01 ZS     PIC Z(6)9.
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO W a b.

    IF b < a THEN
        MOVE b TO tmp
        MOVE a TO b
        MOVE tmp TO a
    END-IF.

    ADD W TO a.

    IF b < a THEN
        DISPLAY ZERO
    ELSE
        SUBTRACT a FROM b
        MOVE b TO ZS
        PERFORM UNANS
        DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans))
    END-IF.

    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
