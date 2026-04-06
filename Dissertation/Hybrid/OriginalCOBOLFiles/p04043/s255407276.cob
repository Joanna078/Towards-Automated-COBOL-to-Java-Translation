PROGRAM-ID.                      ABC_042_A.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP     PIC X(33).
    01 maxlen  PIC 9(1) VALUE 3.
    01 cur     PIC 9(33) VALUE 1.
    01 i       PIC 9(18) VALUE 1.
    01 j       PIC 9(18).
    01 len     PIC 9(33).
    01 ans     PIC X(8).
    01 five    PIC 9(1) VALUE ZERO.
    01 seven   PIC 9(1) VALUE ZERO.
    01 ABC1.
        03 ABC11 OCCURS 3.
            05 ABC PIC 9(2).

PROCEDURE                        DIVISION.
    ACCEPT INP.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO ABC(i)

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    PERFORM VARYING i FROM 1 BY 1 UNTIL 3 < i
        IF ABC(i) = 5 THEN
            ADD 1 TO five
        ELSE IF ABC(i) = 7
            ADD 1 TO seven
        END-IF
    END-PERFORM.

    IF five = 2 AND seven = 1 THEN
        DISPLAY "YES"
    ELSE
        DISPLAY "NO"
    END-IF.

    STOP RUN.
