PROGRAM-ID.                      ABC_048_B.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP     PIC X(59).
    01 a       PIC 9(19).
    01 b       PIC 9(19).
    01 x       PIC 9(19).
    01 ans     PIC X(19).

    01 q1      PIC 9(19).
    01 q2      PIC 9(19).
    01 r       PIC 9(19).

    01 ZS      PIC Z(19)9.
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO a b x.

    DIVIDE x INTO a GIVING q1 REMAINDER r.
    DIVIDE x INTO b GIVING q2.

    SUBTRACT q1 FROM q2.
    IF r = 0 THEN
        ADD 1 TO q2
    END-IF.

    MOVE q2 TO ZS.
    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
