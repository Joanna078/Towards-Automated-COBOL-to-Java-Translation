PROGRAM-ID.                      ABC_026_A.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 MAX_A   PIC 9(3) VALUE 999.

    01 N       PIC 9(3).
    01 INP     PIC X(600).
    01 maxlen  PIC 9(3).
    01 cur     PIC 9(3) VALUE 1.
    01 i       PIC 9(18) VALUE 1.
    01 j       PIC 9(18).
    01 len     PIC 9(3).
    01 ans     PIC X(3).

    01 sm      PIC 9(3).
    01 cnt     PIC 9(3).
    01 bk      PIC 9(3).

    01 a       PIC 9(3).

    01 ZS      PIC Z(3)9.
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT N.

    ACCEPT INP.

    MOVE N TO maxlen.

    MOVE MAX_A TO bk.

    MOVE 1 TO cnt.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO a

        IF bk NOT = a
            DIVIDE 2 INTO cnt
            ADD cnt TO sm
            MOVE 1 TO cnt
            MOVE a TO bk
        ELSE
            ADD 1 TO cnt
        END-IF

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    DIVIDE 2 INTO cnt.
    ADD cnt TO sm.

    MOVE sm TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
