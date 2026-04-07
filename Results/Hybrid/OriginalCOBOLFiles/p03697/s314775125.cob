IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_063_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(3).
    01 a      PIC 9(1).
    01 b      PIC 9(1).
    01 tmp    PIC 9(2).

    01 ZS     PIC Z(3).
    01 DUMMY  PIC X(1).

    01 ans    PIC X(2).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO A B.

    ADD a TO b GIVING tmp.

    MOVE tmp TO ZS.

    PERFORM UNANS.

    IF 10 <= tmp THEN
        DISPLAY "error"
    ELSE
        DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans))
    END-IF.

    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
