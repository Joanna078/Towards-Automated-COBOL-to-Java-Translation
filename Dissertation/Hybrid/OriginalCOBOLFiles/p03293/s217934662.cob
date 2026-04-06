      IDENTIFICATION DIVISION.
      PROGRAM-ID. 103B.
      DATA DIVISION.
      WORKING-STORAGE SECTION.
      01 INP PIC X(100).
      01 S.
      	03 S1 PIC X(1).
        03 S9.
      		05 S99 PIC X(1) OCCURS 99 TIMES.

      01 WK-S.
      	03 WK-S100 PIC X(1) OCCURS 100 TIMES.
      
      01 T    PIC X(100).
      
      01 IDX  PIC 9(3).
      01 CNT  PIC 9(3).
      
      PROCEDURE DIVISION.
      ACCEPT INP.
      MOVE INP TO S.
      
      ACCEPT INP.
      MOVE INP TO T.
      
      PERFORM UNTIL S99(IDX) = SPACE
      ADD 1 TO IDX
      END-PERFORM.
      
      PERFORM UNTIL ( T = S ) OR ( IDX = CNT ) 
      MOVE S9 TO WK-S
      MOVE S1  TO WK-S100(IDX)
      MOVE WK-S TO S
      ADD 1 TO CNT
      END-PERFORM.
      
      IF T = S 
      	DISPLAY "Yes"
      ELSE
      	DISPLAY "No"
      END-IF.
      
      STOP RUN.
