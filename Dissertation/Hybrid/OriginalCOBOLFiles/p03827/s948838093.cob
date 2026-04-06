PROGRAM-ID.                      ABC_052_B.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N       PIC 9(3).
    01 S1.
        03 S PIC X(1) OCCURS 100.

    01 tmp     PIC S9(3).
    01 mx      PIC S9(3).

    01 ans     PIC X(18).

    01 ZS      PIC -(3)9.
    01 DUMMY   PIC X(1).

    01 i       PIC 9(3).

PROCEDURE                        DIVISION.
    ACCEPT N.

    ACCEPT S1.

    MOVE ZERO TO mx.
    MOVE ZERO TO tmp.

    PERFORM VARYING i FROM 1 BY 1 UNTIL N < i
        IF S(i) = 'I' THEN
            ADD 1 TO tmp
        ELSE
            SUBTRACT 1 FROM tmp
        END-IF
        COMPUTE mx = FUNCTION MAX(mx, tmp)
    END-PERFORM.

    MOVE mx TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
