PROGRAM-ID.                      ABC_072_B.
ENVIRONMENT                      DIVISION.
INPUT-OUTPUT                     SECTION.
FILE-CONTROL.
    SELECT SYSIN ASSIGN TO KEYBOARD ORGANIZATION LINE SEQUENTIAL.
DATA                             DIVISION.
FILE                             SECTION.
FD  SYSIN.
    01 INDATA PIC X(100000).
WORKING-STORAGE                  SECTION.
    01 i      PIC 9(6).
    01 s      PIC X(100000).
    01 m      PIC 9(1).
    01 ln     PIC X(100000).
PROCEDURE                        DIVISION.
    OPEN INPUT SYSIN.

    READ SYSIN INTO s.

    CLOSE SYSIN.

    PERFORM VARYING i FROM 1 BY 1 UNTIL s(i:1) = SPACE
        COMPUTE m = FUNCTION MOD(i, 2)
        IF m = 1 THEN
            STRING
                ln(1:FUNCTION STORED-CHAR-LENGTH(ln))
                s(i:1)
                INTO ln
            END-STRING
        END-IF
    END-PERFORM

    DISPLAY ln(1:FUNCTION STORED-CHAR-LENGTH(ln)).
    STOP RUN.
