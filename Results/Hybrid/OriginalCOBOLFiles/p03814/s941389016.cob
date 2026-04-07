PROGRAM-ID.                      ABC_053_B.
ENVIRONMENT                      DIVISION.
INPUT-OUTPUT                     SECTION.
FILE-CONTROL.
    SELECT SYSIN ASSIGN TO KEYBOARD ORGANIZATION LINE SEQUENTIAL.

DATA                             DIVISION.
FILE                             SECTION.
    FD  SYSIN.
        01 INDATA PIC X(200000).

WORKING-STORAGE                  SECTION.
    01 INP1.
        03 INP PIC X(1) OCCURS 200000.

    01 len     PIC 9(6).

    01 i       PIC 9(6) BINARY.
    01 j       PIC 9(6) BINARY.

    01 ZS      PIC Z(7).
    01 DUMMY   PIC X(1).

    01 ans     PIC X(6).

PROCEDURE                        DIVISION.
    OPEN INPUT SYSIN.

    READ SYSIN INTO INP1.

    CLOSE SYSIN.

    COMPUTE len = FUNCTION STORED-CHAR-LENGTH(INP1).

    PERFORM VARYING i FROM 1 BY 1 UNTIL len < i
        IF INP(i) = 'A' THEN
            EXIT PERFORM
        END-IF
    END-PERFORM.

    PERFORM VARYING j FROM len BY -1 UNTIL j < 1
        IF INP(j) = 'Z' THEN
            EXIT PERFORM
        END-IF
    END-PERFORM.

    SUBTRACT i FROM j.
    ADD 1 TO j.

    MOVE j TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
