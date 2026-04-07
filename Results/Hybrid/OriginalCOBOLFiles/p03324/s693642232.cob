IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_100_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(10).
    01 maxlen PIC 9(1)  VALUE 2.
    01 cur    PIC 9(2)  VALUE 1.
    01 i      PIC 9(18) VALUE 1.
    01 j      PIC 9(18).
    01 len    PIC 9(2).
    01 ans    PIC Z(7)9.
    01 DN1.
        03 DN11 OCCURS 2.
            05 DN PIC 9(8).
    01 tmp    PIC 9(8).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO DN(i)

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    COMPUTE tmp = 100 ** DN(1) * DN(2);
    MOVE tmp TO ans.

    DISPLAY ans.
    STOP RUN.
