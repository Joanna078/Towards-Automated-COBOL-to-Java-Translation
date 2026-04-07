       IDENTIFICATION DIVISION.
       PROGRAM-ID. test156.
       ENVIRONMENT DIVISION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 AAA.
         03 RATE PIC 9999.
         03 A PIC 99.
         03 B PIC 9.
         03 NAIBU PIC 9999.
         03 X PIC 999.
         03 Y PIC 9.
       PROCEDURE DIVISION.
       MAIN.
       MOVE ZERO TO AAA.    
       ACCEPT A.
       ACCEPT RATE.
       IF A >= 10
         THEN
           DISPLAY RATE
         ELSE
           MOVE A TO B
           COMPUTE Y = (10 - B)
           COMPUTE X = 100 * Y
           COMPUTE NAIBU = RATE + X
      	   DISPLAY NAIBU
         END-IF.
        STOP RUN.