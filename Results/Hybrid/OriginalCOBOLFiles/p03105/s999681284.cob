       IDENTIFICATION DIVISION.
       PROGRAM-ID. ATCODER.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  indata PIC X(100).
       01  a1 PIC 9(08).
       01  a2 PIC 9(08).
       01  a3 PIC 9(08).
       01  r pic 9(08).
       01  r2 pic 9(08).
       01 disp pic Z(20)9.
       PROCEDURE DIVISION.
        ACCEPT indata.
        
        UNSTRING indata DELIMITED BY SPACE INTO a1 a2 a3.
        divide a2 by a1 giving r
         IF r >= a3 THEN
          MOVE FUNCTION TRIM(a3) to disp
          DISPLAY disp
         ELSE
          MOVE FUNCTION TRIM(r) to disp
          DISPLAY disp
         END-IF


       STOP RUN.
