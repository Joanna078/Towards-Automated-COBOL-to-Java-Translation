IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_101_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 S      PIC X(4).
    01 len    PIC 9(1)   VALUE 1.

    01 i      PIC 9(1).

    01 ans    PIC X(2).
    01 SS     PIC S9(1).
    01 ZS     PIC -(2)9.
    01 DUMMY  PIC X(1).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT S.

    MOVE 0 TO ZS.

    PERFORM VARYING i FROM 1 BY 1 UNTIL 4 < i
        IF S(i:len) = '+' THEN
            ADD 1 TO SS
        ELSE
            SUBTRACT 1 FROM SS
        END-IF
    END-PERFORM.

    MOVE SS TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).

    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
