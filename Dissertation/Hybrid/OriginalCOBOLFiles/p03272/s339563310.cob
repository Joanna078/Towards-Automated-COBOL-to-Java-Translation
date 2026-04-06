PROGRAM-ID.                      ABC_107_A.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP     PIC X(7).
    01 N       PIC 9(3).
    01 i       PIC 9(3).
    01 ans     PIC X(3).

    01 ZS      PIC Z(3)9.
    01 DUMMY   PIC X(1).


PROCEDURE                        DIVISION.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO N i.

    SUBTRACT i FROM N GIVING i.
    ADD 1 TO i.

    MOVE i TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
