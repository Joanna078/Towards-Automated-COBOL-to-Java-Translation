IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_084_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(11).
    01 S      PIC X(10).
    01 A      PIC 9(1).
    01 B      PIC 9(1).
    01 i      PIC 9(2).
    01 flg    PIC 9(1) VALUE 1.
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.
    ACCEPT S.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO A B.

    PERFORM VARYING i FROM 1 BY 1 UNTIL A + B + 1 < i
        IF A + 1 = i AND S(i:1) NOT = '-' THEN
            MOVE 0 TO flg
        ELSE
            IF A + 1 NOT = i AND S(i:1) = '-' THEN
                MOVE 0 TO flg
            END-IF
        END-IF
    END-PERFORM.

    IF flg = 1 THEN
        DISPLAY "Yes"
    ELSE
        DISPLAY "No"
    END-IF.

    STOP RUN.
