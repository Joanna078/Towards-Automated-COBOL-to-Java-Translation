PROGRAM-ID.                      ABC_050_A.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP     PIC X(23).
    01 A       PIC 9(10).
    01 op      PIC X(1).
    01 B       PIC S9(10).
    01 ans     PIC X(10).

    01 ZS      PIC -(10)9.
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO A op B.

    IF op = '+' THEN
        ADD A TO B
    ELSE
        SUBTRACT B FROM A GIVING B
    END-IF.

    MOVE B TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
