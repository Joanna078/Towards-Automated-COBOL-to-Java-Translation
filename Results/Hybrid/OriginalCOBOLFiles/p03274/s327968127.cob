PROGRAM-ID.                      ABC_107_C.
ENVIRONMENT                      DIVISION.
INPUT-OUTPUT                     SECTION.
FILE-CONTROL.
    SELECT SYSIN ASSIGN TO KEYBOARD ORGANIZATION LINE SEQUENTIAL.

DATA                             DIVISION.
FILE                             SECTION.
    FD  SYSIN.
        01 INDATA PIC X(1100000).

WORKING-STORAGE                  SECTION.
    01 INF     PIC 9(10) VALUE 150000000.
    01 INP2    PIC X(13).
    01 N       PIC 9(6).
    01 K       PIC 9(6).

    01 INP     PIC X(1100000).
    01 maxlen  PIC 9(7).
    01 cur     PIC 9(7) VALUE 1.
    01 i       PIC 9(18) VALUE 1.
    01 j       PIC 9(18).
    01 len     PIC 9(7).

    01 tmp     PIC 9(10).

    01 x1.
        03 x11 OCCURS 100000 DEPENDING ON maxlen INDEXED XX1 XX2.
            05 x PIC S9(10).
            05 y PIC 9(10).

    01 t       PIC 9(15).
    01 sm      PIC 9(15).

    01 flg     PIC 9(1).

    01 ans     PIC X(15).

    01 ZS      PIC Z(15)9.
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT INP2.

    UNSTRING INP2
    DELIMITED BY SPACE
    INTO N K.

    OPEN INPUT SYSIN.

    READ SYSIN INTO INP.

    CLOSE SYSIN.

    MOVE N TO maxlen.

    PERFORM maxlen TIMES

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        SET XX1 TO i

        MOVE INP(cur:len) TO x(XX1)
        MOVE x(XX1) TO y(XX1)

        COMPUTE cur = j + 1

        ADD 1 TO i

    END-PERFORM.

    MOVE ZERO TO flg.

    SET XX1 TO 1.
    SET XX2 TO K.

    IF ZERO <= x(XX1)
        MOVE y(XX2) TO sm
        MOVE 1 TO flg
    END-IF.

    COMPUTE tmp = N - K + 1.

    SET XX1 TO N.
    SET XX2 TO tmp.

    IF x(XX1) <= ZERO
        MOVE y(XX2) TO sm
        MOVE 1 TO flg
    END-IF.

    IF ZERO = flg
        MOVE INF TO sm
        PERFORM VARYING i FROM 1 BY 1 UNTIL N < i
            COMPUTE tmp = i + K - 1

            IF N < tmp
                EXIT PERFORM
            END-IF

            SET XX1 TO i
            SET XX2 TO tmp

            IF x(XX1) <= ZERO
                IF ZERO <= x(XX2)
                    IF y(XX1) <= y(XX2)
                        COMPUTE t = y(XX1) * 2 + y(XX2)
                    ELSE
                        COMPUTE t = y(XX1) + y(XX2) * 2
                    END-IF

                    IF t < sm
                        MOVE t TO sm
                    END-IF
                ELSE
                    COMPUTE tmp = i + K

                    SET XX2 TO tmp

                    IF tmp <= N AND ZERO < x(XX2)
                        MOVE y(XX1) TO t
                        IF t < sm
                            MOVE t TO sm
                        END-IF
                    END-IF
                END-IF
            ELSE
                COMPUTE tmp = i - 1

                SET XX1 TO tmp

                IF x(XX1) < ZERO
                    MOVE y(XX2) TO t
                    IF t < sm
                        MOVE t TO sm
                    END-IF
                END-IF
            END-IF
        END-PERFORM
    END-IF

    MOVE sm TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
