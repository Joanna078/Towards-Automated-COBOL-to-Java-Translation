IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_101_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N      PIC X(11).
    01 NUM    PIC 9(10).
    01 X      PIC 9(10).
    01 R      PIC 9(10).
    01 i      PIC 9(2).
    01 SN     PIC 9(3).
    01 now    PIC 9(1).
    01 ans    PIC Z(18).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT N.

    MOVE N TO NUM.
    MOVE 0 TO SN.

    PERFORM VARYING i FROM 1 BY 1 UNTIL N(i:1) = SPACE
        MOVE N(i:1) TO now
        COMPUTE SN = SN + now
    END-PERFORM.

    DIVIDE SN INTO NUM GIVING X REMAINDER R.

    IF R = 0 THEN
        DISPLAY "Yes"
    ELSE
        DISPLAY "No"
    END-IF.

    STOP RUN.
