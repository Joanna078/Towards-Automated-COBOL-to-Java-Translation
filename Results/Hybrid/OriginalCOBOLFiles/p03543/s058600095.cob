IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_079_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC 9(4).
    01 D      PIC 9(4).
    01 R      PIC 9(1).
    01 cnt    PIC 9(1).
    01 bk     PIC 9(2).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    MOVE N TO D.

    DIVIDE 10 INTO D GIVING D REMAINDER bk.

    MOVE 1 TO cnt.

    PERFORM UNTIL D = 0
        DIVIDE 10 INTO D GIVING D REMAINDER R
        IF bk = R THEN
            ADD 1 TO cnt
        END-IF
        MOVE R TO bk
    END-PERFORM.

    IF 3 <= cnt THEN
        DISPLAY "Yes"
    ELSE
        DISPLAY "No"
    END-IF.

    STOP RUN.
