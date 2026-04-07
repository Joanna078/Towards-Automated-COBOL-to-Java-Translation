IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_097_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(16).
    01 maxlen PIC 9(1)  VALUE 4.
    01 cur    PIC 9(2)  VALUE 1.
    01 i      PIC 9(18) VALUE 1.
    01 j      PIC 9(18).
    01 len    PIC 9(2).
    01 abcd1.
        03 abcd11 OCCURS 4.
            05 abcd PIC 9(3).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO abcd(i)

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    IF (abcd(1) - abcd(3) <= abcd(4)) THEN
       DISPLAY "Yes"
    ELSE
        IF (abcd(1) - abcd(2) <= abcd(4))
           AND (abcd(2) - abcd(3) <= abcd(4)) THEN
            DISPLAY "Yes"
        ELSE
            DISPLAY "No"
        END-IF
    END-IF.

    STOP RUN.
