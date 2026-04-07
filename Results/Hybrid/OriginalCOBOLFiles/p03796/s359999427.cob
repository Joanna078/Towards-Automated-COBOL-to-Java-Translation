IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_055_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 i      PIC 9(6).
    01 INF    PIC 9(10) VALUE 1000000007.
    01 N      PIC 9(6).
    01 tmp    PIC 9(10).
    01 ans    PIC X(10).

    01 ZS     PIC Z(11).
    01 DUMMY  PIC X(1).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    MOVE 1 TO tmp.

    PERFORM VARYING i FROM 1 BY 1 UNTIL N < i
        COMPUTE tmp = FUNCTION MOD(tmp * i, INF)
    END-PERFORM.

    MOVE tmp TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
