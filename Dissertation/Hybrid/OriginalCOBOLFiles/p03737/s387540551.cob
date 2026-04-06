IDENTIFICATION                   DIVISION.
PROGRAM-ID.                      ABC_059_A.
ENVIRONMENT                      DIVISION.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INP    PIC X(32).
    01 s1     PIC X(10).
    01 s2     PIC X(10).
    01 s3     PIC X(10).
PROCEDURE                        DIVISION.
MAIN.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO s1 s2 s3.

    MOVE FUNCTION UPPER-CASE(s1) TO s1.
    MOVE FUNCTION UPPER-CASE(s2) TO s2.
    MOVE FUNCTION UPPER-CASE(s3) TO s3.

    DISPLAY s1(1:1) s2(1:1) s3(1:1).

    STOP RUN.
