PROGRAM-ID.                      ABC_106_B.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N       PIC 9(3).
    01 i       PIC 9(3).
    01 j       PIC 9(3).
    01 tmp     PIC 9(3).
    01 cnt     PIC 9(3).

    01 d       PIC 9(3).
    01 m       PIC 9(3).

    01 ans     PIC X(3).

    01 ZS      PIC Z(3)9.
    01 DUMMY   PIC X(1).


PROCEDURE                        DIVISION.
    ACCEPT N.

    MOVE ZERO TO cnt.

    PERFORM VARYING i FROM 1 BY 2 UNTIL N < i
        MOVE ZERO TO tmp
        PERFORM VARYING j FROM 1 BY 1 UNTIL i < j
            DIVIDE j INTO i GIVING D REMAINDER m
            IF ZERO = m
                ADD 1 TO tmp
            END-IF
        END-PERFORM
        IF 8 = tmp
            ADD 1 TO cnt
        END-IF
    END-PERFORM

    MOVE cnt TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
