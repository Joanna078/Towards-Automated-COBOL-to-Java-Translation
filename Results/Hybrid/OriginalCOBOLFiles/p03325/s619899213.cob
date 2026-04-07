PROGRAM-ID.                      ABC_999_A.
ENVIRONMENT                      DIVISION.
INPUT-OUTPUT                     SECTION.
FILE-CONTROL.
    SELECT SYSIN ASSIGN TO KEYBOARD ORGANIZATION LINE SEQUENTIAL.

DATA                             DIVISION.
FILE                             SECTION.
    FD  SYSIN.
        01 INDATA PIC X(110000).

WORKING-STORAGE                  SECTION.
    01 INP     PIC X(110000).

    01 N       PIC 9(5).
    01 maxlen  PIC 9(6) VALUE 110000.
    01 cur     PIC 9(6) VALUE 1.
    01 i       PIC 9(18) VALUE 1.
    01 j       PIC 9(18).
    01 len     PIC 9(6).
    01 ans     PIC X(6).
    01 a       PIC 9(10).

    01 r       PIC 9(1).
    01 num     PIC 9(2).
    01 sm      PIC 9(6).

    01 ZS      PIC Z(6)9.
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT N.

    OPEN INPUT SYSIN.

    READ SYSIN INTO INP.

    CLOSE SYSIN.

    MOVE N TO maxlen.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO a

        PERFORM GETNUM

        ADD num TO sm

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

GETNUM                           SECTION.
    MOVE ZERO TO num

    PERFORM UNTIL ZERO = a
        DIVIDE 2 INTO a GIVING a REMAINDER r
        IF ZERO = r THEN
            ADD 1 TO NUM
        ELSE
            EXIT PERFORM
        END-IF
    END-PERFORM.
