IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_102_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(10).
    01 X      PIC 9(10).
    01 D      PIC 9(10).
    01 ZS     PIC Z(11).
    01 ans    PIC X(10).
    01 DUMMY  PIC X(1).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    DIVIDE 2 INTO N GIVING X REMAINDER D.

    IF D NOT = 0 THEN
        MULTIPLY 2 BY N
    END-IF

    MOVE N TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
