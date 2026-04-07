PROGRAM-ID.                      ABC_052_A.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP     PIC X(23).
    01 A       PIC 9(4).
    01 B       PIC 9(7).
    01 C       PIC 9(4).
    01 D       PIC 9(7).
    01 ans     PIC X(7).

    01 ZS      PIC Z(8).
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO A B C D.

    MULTIPLY A BY B.
    MULTIPLY C BY D.

    COMPUTE B = FUNCTION MAX(B, D).
    MOVE B TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
