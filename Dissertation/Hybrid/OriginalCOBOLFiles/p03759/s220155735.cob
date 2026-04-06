      IDENTIFICATION DIVISION.
      PROGRAM-ID. 058A.
      DATA DIVISION.
      WORKING-STORAGE SECTION.
      01 INP PIC X(100).
      
      01 A   PIC 9(2).
      01 B   PIC 9(2).
      01 C   PIC 9(2).
      
      01 ANS1  PIC 9(3).
      01 ANS2  PIC 9(3).
      
      PROCEDURE DIVISION.
      ACCEPT INP.
      UNSTRING INP DELIMITED BY " "
      INTO A
           B
           C.
      
      COMPUTE ANS1 = B - A.
      COMPUTE ANS2 = C - B.
      
      IF ANS1 = ANS2
      	 DISPLAY "YES"
      ELSE
      	 DISPLAY "NO"
      END-IF.
      
      STOP RUN.