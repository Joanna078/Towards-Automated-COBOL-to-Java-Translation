PROGRAM-ID.                      ABC_050_B.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP     PIC X(700).
    01 maxlen  PIC 9(3) VALUE 600.
    01 cur     PIC 9(3) VALUE 1.
    01 i       PIC 9(18) VALUE 1.
    01 j       PIC 9(18).
    01 len     PIC 9(3).
    01 ans     PIC X(8).
    01 T1.
        03 T11 OCCURS 600 DEPENDING ON maxlen.
            05 T PIC 9(6).

    01 INP2    PIC X(10).
    01 M       PIC 9(3).
    01 P       PIC 9(3).
    01 X       PIC 9(6).

    01 sm      PIC 9(8).
    01 tmp     PIC 9(8).

    01 ZS      PIC Z(8)9.
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT maxlen.
    ACCEPT INP.

    MOVE ZERO TO sm.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO T(i)

        ADD T(i) TO sm

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    ACCEPT M.

    PERFORM VARYING i FROM 1 BY 1 UNTIL M < i
        ACCEPT INP2

        UNSTRING INP2
        DELIMITED BY SPACE
        INTO P X

        SUBTRACT T(P) FROM sm GIVING tmp

        ADD X TO tmp

        MOVE tmp TO ZS
        PERFORM UNANS

        DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans))

    END-PERFORM.

    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
