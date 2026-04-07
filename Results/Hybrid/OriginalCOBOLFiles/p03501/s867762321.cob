IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_080_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(2).

    01 T      PIC 9(4).

    01 INP    PIC X(12).
    01 a      PIC 9(3).
    01 b      PIC 9(4).
    01 ans    PIC X(4).

    01 ZS     PIC Z(4)9.
    01 DUMMY  PIC X(1).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO N A B.

    IF A * N <= B THEN
        MULTIPLY A BY N GIVING T
    ELSE
        MOVE B TO T
    END-IF

    MOVE T TO ZS

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
