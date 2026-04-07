IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_069_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(7).
    01 n      PIC 9(3).
    01 m      PIC 9(3).

    01 tmp    PIC 9(4).

    01 ans    PIC X(4).

    01 ZS     PIC Z(5).
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO n m.

    SUBTRACT 1 FROM n.
    SUBTRACT 1 FROM m.

    MULTIPLY n BY m GIVING tmp.

    MOVE tmp TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
