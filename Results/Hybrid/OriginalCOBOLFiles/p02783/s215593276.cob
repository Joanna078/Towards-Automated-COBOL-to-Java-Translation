       IDENTIFICATION DIVISION.
       PROGRAM-ID. ATCODER.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  indata PIC X(100).
       01  n PIC 9(08).
       01  m PIC 9(08).
       01  r PIC 9(08).
       01  d PIC 9(08).
       01  g PIC 9(08).
       01 RES PIC 9(08) VALUE 0.
       01 disp   PIC Z(4)9.
       PROCEDURE DIVISION.
        ACCEPT indata

        move 0 to RES.

        UNSTRING indata DELIMITED BY SPACE INTO n m.

        DIVIDE n BY m GIVING g REMAINDER d.

        add g to RES.
        
         IF d > 0 THEN
                 ADD 1 TO g GIVING RES
         END-IF

         MOVE FUNCTION TRIM(RES) to disp.
         DISPLAY disp.

       STOP RUN.
