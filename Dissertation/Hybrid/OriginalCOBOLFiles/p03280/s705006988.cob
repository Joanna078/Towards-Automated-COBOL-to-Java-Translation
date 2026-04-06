PROGRAM-ID.                      ABC_106_A.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP     PIC X(7).
    01 A       PIC 9(3).
    01 B       PIC 9(3).
    01 tmp     PIC 9(5).
    01 ans     PIC X(5).

    01 ZS      PIC Z(5)9.
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO A B.

    COMPUTE tmp = A * B - (A + B - 1).
    MOVE tmp TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
