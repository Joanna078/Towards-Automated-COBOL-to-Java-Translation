IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_055_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(3).
    01 tmpN   PIC 9(3).
    01 tmp    PIC 9(6).
    01 ans    PIC X(6).

    01 ZS     PIC Z(7).
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    DIVIDE 15 INTO N GIVING tmpN.

    COMPUTE tmp = 800 * N - tmpN * 200

    MOVE tmp TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
