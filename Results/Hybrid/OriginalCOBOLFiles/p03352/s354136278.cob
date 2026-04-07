IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_097_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 A      PIC 9(18).

    01 b      PIC 9(4).
    01 p      PIC 9(4).

    01 tmp    PIC 9(18).
    01 ans    PIC Z(18).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT A.

    MOVE 1 TO ans.

    PERFORM VARYING b FROM 2 BY 1 UNTIL A < b
        PERFORM VARYING p FROM 2 BY 1 UNTIL A < p
            COMPUTE tmp = b ** p

            IF A < tmp THEN
                EXIT PERFORM
            END-IF

            COMPUTE ans = FUNCTION MAX(ans, tmp)
        END-PERFORM
    END-PERFORM.

    DISPLAY ans.
    STOP RUN.
