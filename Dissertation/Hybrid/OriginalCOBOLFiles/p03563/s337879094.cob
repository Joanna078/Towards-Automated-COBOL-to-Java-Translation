IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_076_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 R      PIC S9(4).
    01 G      PIC 9(4).
    01 ZS     PIC -(5)9.
    01 ans    PIC X(5).

    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT R.
    ACCEPT G.

    SUBTRACT R FROM G GIVING R.

    ADD G TO R.

    MOVE R TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
