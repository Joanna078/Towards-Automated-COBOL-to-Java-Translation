PROGRAM-ID.                      ABC_103_D.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP     PIC X(13).
    01 N       PIC 9(6).
    01 M       PIC 9(6).
    01 ab1.
        03 ab OCCURS 100000 DEPENDING M.
            05 a       PIC 9(6).
            05 b       PIC 9(6).

    01 done    PIC 9(6) VALUE ZERO.

    01 ans     PIC X(6).

    01 ZS      PIC Z(7).
    01 DUMMY   PIC X(1).

    01 i       PIC 9(6) BINARY.
    01 cnt     PIC 9(6).

PROCEDURE                        DIVISION.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO N M.

    PERFORM VARYING i FROM 1 BY 1 UNTIL M < i
        ACCEPT INP

        UNSTRING INP
        DELIMITED BY SPACE
        INTO a(i) b(i)
    END-PERFORM.

    SORT ab ASCENDING b.

    MOVE ZERO TO done.

    PERFORM VARYING i FROM 1 BY 1 UNTIL M < i
        IF done < a(i) THEN
            ADD 1 TO cnt
            MOVE b(i) TO done
            SUBTRACT 1 FROM done
        END-IF
    END-PERFORM.

    MOVE cnt TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.
