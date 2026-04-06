PROGRAM-ID.                      ABC_062_B.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 i      PIC 9(3).
    01 SHP    PIC X(1) VALUE '#'.
    01 INP    PIC X(7).
    01 H      PIC 9(3).
    01 W      PIC 9(3).
    01 ln     PIC X(102).
    01 a      PIC X(100).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO H W.

*>  初期化不要
    PERFORM VARYING i FROM 1 BY 1 UNTIL W + 2 < i
        STRING
            ln(1:FUNCTION STORED-CHAR-LENGTH(ln))
            SHP
            INTO ln
        END-STRING
    END-PERFORM.

    DISPLAY ln(1:FUNCTION STORED-CHAR-LENGTH(ln)).

    PERFORM VARYING i FROM 1 BY 1 UNTIL H < i
        ACCEPT a

*>      初期化
        MOVE SHP TO ln

        STRING
            ln(1:FUNCTION STORED-CHAR-LENGTH(ln))
            a
            INTO ln
        END-STRING

        STRING
            ln(1:FUNCTION STORED-CHAR-LENGTH(ln))
            SHP
            INTO ln
        END-STRING

        DISPLAY ln(1:FUNCTION STORED-CHAR-LENGTH(ln))
    END-PERFORM.

*>  初期化
    MOVE SPACE TO ln.

    PERFORM VARYING i FROM 1 BY 1 UNTIL W + 2 < i
        STRING
            ln(1:FUNCTION STORED-CHAR-LENGTH(ln))
            SHP
            INTO ln
        END-STRING
    END-PERFORM.

    DISPLAY ln(1:FUNCTION STORED-CHAR-LENGTH(ln)).

    STOP RUN.
