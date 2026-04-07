	  IDENTIFICATION DIVISION.
      PROGRAM-ID. 045A.
      DATA DIVISION.
      WORKING-STORAGE SECTION.
      01 A PIC 9(3).
      01 B PIC 9(3).
      01 H PIC 9(3).
      01 ANS PIC 9(9).
      01 ANSS PIC Z(9).
      
      PROCEDURE DIVISION.
      ACCEPT A .
      ACCEPT B .
      ACCEPT H .
            
      COMPUTE ANS = ( A + B ) * H / 2.
      MOVE ANS TO ANSS.
      DISPLAY ANSS.
      
      STOP RUN.