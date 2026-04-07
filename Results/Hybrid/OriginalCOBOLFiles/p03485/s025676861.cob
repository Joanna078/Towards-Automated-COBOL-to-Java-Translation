      IDENTIFICATION DIVISION.
      PROGRAM-ID. 082A.
      DATA DIVISION.
      WORKING-STORAGE SECTION.
      01 INP PIC X(100).
      01 A PIC 9(3).
      01 B PIC 9(3).
      01 WA PIC 9(3).
      01 X  PIC 9(3).
      01 XX PIC ZZ9.
      01 AMA PIC 9(1).
      
      PROCEDURE DIVISION.
      ACCEPT INP.
      UNSTRING INP DELIMITED BY " "
      INTO A B.
      COMPUTE WA = A + B 
      DIVIDE WA BY 2 GIVING X REMAINDER AMA
      IF AMA = 0
      THEN
         CONTINUE
      ELSE
         COMPUTE X = X + 1
      END-IF.
      MOVE X TO XX.
      DISPLAY XX.
      STOP RUN.
      