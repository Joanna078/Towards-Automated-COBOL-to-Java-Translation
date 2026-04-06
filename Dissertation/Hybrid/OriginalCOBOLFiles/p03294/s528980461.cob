PROGRAM-ID.                      ABC_103_C.
ENVIRONMENT                      DIVISION.
INPUT-OUTPUT                     SECTION.
FILE-CONTROL.
    SELECT SYSIN ASSIGN TO KEYBOARD ORGANIZATION LINE SEQUENTIAL.

DATA                             DIVISION.
FILE                             SECTION.
    FD  SYSIN.
        01 INDATA PIC X(21000).

WORKING-STORAGE                  SECTION.
    01 N       PIC 9(4).
    01 INP     PIC X(21000).

    01 maxlen  PIC 9(4) VALUE 3000.
    01 cur     PIC 9(5) VALUE 1.
    01 i       PIC 9(18) VALUE 1.
    01 j       PIC 9(18).
    01 len     PIC 9(5).
    01 ans     PIC X(9).

    01 a       PIC 9(6).
    01 sm      PIC 9(9).

    01 ZS      PIC Z(10).
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT N.

    OPEN INPUT SYSIN.

    READ SYSIN INTO INP.

    CLOSE SYSIN.

    MOVE ZERO TO sm.

    MOVE N TO maxlen.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO a

        SUBTRACT 1 FROM a

        ADD a TO sm

        COMPUTE cur = j + 1

        ADD 1 TO i

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
