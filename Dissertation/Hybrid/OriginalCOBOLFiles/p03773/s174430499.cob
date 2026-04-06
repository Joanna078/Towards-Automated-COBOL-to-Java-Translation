IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_057_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(5).
    01 A      PIC 9(2).
    01 B      PIC 9(2).
    01 ans    PIC X(2).

    01 ZS     PIC Z(2)9.
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO A B.

    ADD B TO A.

    IF 24 <= A THEN
        SUBTRACT 24 FROM A
    END-IF.

    MOVE A TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
