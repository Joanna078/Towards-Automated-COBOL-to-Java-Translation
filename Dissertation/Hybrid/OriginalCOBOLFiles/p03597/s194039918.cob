IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_074_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(5).
    01 A      PIC 9(5).
    01 ans    PIC X(5).

    01 ZS     PIC Z(6)9.
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.
    ACCEPT A.

    COMPUTE N = N ** 2.
    SUBTRACT A FROM N.

    MOVE N TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
