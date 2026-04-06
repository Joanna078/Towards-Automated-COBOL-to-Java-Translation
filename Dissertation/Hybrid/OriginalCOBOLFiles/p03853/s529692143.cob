PROGRAM-ID.                      ABC_049_B.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP     PIC X(7).
    01 H       PIC 9(3).
    01 W       PIC 9(3).
    01 C       PIC X(100).
    01 i       PIC 9(3).

PROCEDURE                        DIVISION.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO H W.

    PERFORM VARYING i FROM 1 BY 1 UNTIL H < i
        ACCEPT C
        DISPLAY C(1:FUNCTION STORED-CHAR-LENGTH(C))
        DISPLAY C(1:FUNCTION STORED-CHAR-LENGTH(C))
    END-PERFORM.

    STOP RUN.
