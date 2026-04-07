		IDENTIFICATION DIVISION.
        PROGRAM-ID. AtCoder.
      
        ENVIRONMENT DIVISION.
      
        DATA DIVISION.
        WORKING-STORAGE SECTION.
        01 INP PIC X(100).
        01 A PIC S9(15).
        01 B PIC S9(15).
        01 C PIC S9(15).
      	01 D PIC S9(15).
      	01 E PIC S9(15).
      	01 F PIC -ZZZZZZZZZZZZ9.
	    01 temp1 PIC 9(15).
        01 temp2 PIC 9(15).
        01 N PIC 9(15).
      
        PROCEDURE DIVISION.
      	MAIN.
			ACCEPT INP.
        	PERFORM VARYING temp1 FROM 1 BY 1
            UNTIL INP(temp1:1) = SPACE
        	END-PERFORM.
        	SUBTRACT 1 FROM temp1.
        	MOVE INP(1:temp1) TO A.
        	ADD 2 TO temp1.
        	PERFORM VARYING temp2 FROM temp1 BY 1
            UNTIL INP(temp2:1) = SPACE
        	END-PERFORM.
        	COMPUTE N = temp2 - temp1.
        	MOVE INP(temp1:N) TO B.
      		ACCEPT INP.
      		IF INP(B:1) = 'A' THEN
      			MOVE 'a' TO INP(B:1) 
      		END-IF.
      		IF INP(B:1) = 'B' THEN
      			MOVE 'b' TO INP(B:1) 
      		END-IF.
      		IF INP(B:1) = 'C' THEN
      			MOVE 'c' TO INP(B:1) 
      		END-IF.
      		DISPLAY INP.
		STOP RUN.