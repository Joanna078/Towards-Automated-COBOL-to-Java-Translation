IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_089_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(4).
    01 tmp    PIC 9(4).
    01 ZS     PIC Z(3)9.
    01 ans    PIC X(3).
    01 DUMMY  PIC X(1).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    DIVIDE 3 INTO N GIVING tmp.

    MOVE tmp TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
