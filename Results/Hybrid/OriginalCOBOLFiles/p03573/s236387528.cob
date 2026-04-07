IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_075_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(14).
    01 A      PIC S9(3).
    01 B      PIC S9(3).
    01 C      PIC S9(3).
    01 ans    PIC X(4).

    01 ZS     PIC -(4)9.
    01 DUMMY  PIC X(1).

PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO A B C.

    IF A = B THEN
        MOVE C TO ZS
    ELSE
        IF B = C THEN
            MOVE A TO ZS
        ELSE
            MOVE B TO ZS
        END-IF
    END-IF.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
