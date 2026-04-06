IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_077_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(10).
    01 ans    PIC X(10).
    01 ZS     PIC Z(11).
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    COMPUTE N = FUNCTION SQRT(N).

    COMPUTE N = N ** 2.

    MOVE N TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
