      IDENTIFICATION DIVISION.
      PROGRAM-ID. 062A.
      DATA DIVISION.
      WORKING-STORAGE SECTION.
      01 INP PIC X(100).
      01 A   PIC X(2).
      01 B   PIC X(2).
      01 CLASSA PIC X(1).
      01 CLASSB PIC X(1).
      
      PROCEDURE DIVISION.
      
      ACCEPT INP.
      UNSTRING INP DELIMITED BY " "
      INTO A B.
      
      EVALUATE A
      WHEN 1
      WHEN 3
      WHEN 5
      WHEN 7
      WHEN 8
      WHEN 10
      WHEN 12
      	MOVE 1 TO CLASSA
      WHEN 4
      WHEN 6
      WHEN 9
      WHEN 11
      	MOVE 2 TO CLASSA
      WHEN 2
      	MOVE 3 TO CLASSA
      END-EVALUATE.

      EVALUATE B
      WHEN 1
      WHEN 3
      WHEN 5
      WHEN 7
      WHEN 8
      WHEN 10
      WHEN 12
      	MOVE 1 TO CLASSB
      WHEN 4
      WHEN 6
      WHEN 9
      WHEN 11
      	MOVE 2 TO CLASSB
      WHEN 2
      	MOVE 3 TO CLASSB
      END-EVALUATE.
      
      IF CLASSA = CLASSB
      	 DISPLAY "YES"
      ELSE
      	 DISPLAY "NO"
      END-IF.
      
      STOP RUN.
