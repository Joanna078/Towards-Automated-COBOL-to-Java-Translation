IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_073_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(4).

    01 INP    PIC X(13).
    01 l      PIC 9(6).
    01 r      PIC 9(6).

    01 i      PIC 9(6).

    01 sm     PIC 9(6).

    01 ZS     PIC Z(7).
    01 DUMMY  PIC X(1).

    01 ans    PIC X(6).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    MOVE 0 TO sm.

    PERFORM VARYING i FROM 1 BY 1 UNTIL N < i
        ACCEPT INP

        UNSTRING INP
        DELIMITED BY SPACE
        INTO l r

        SUBTRACT l FROM r
        ADD 1 TO r
        ADD r TO sm
    END-PERFORM.

    MOVE sm TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
