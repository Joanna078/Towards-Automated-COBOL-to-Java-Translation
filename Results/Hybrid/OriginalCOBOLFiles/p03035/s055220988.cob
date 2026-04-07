		IDENTIFICATION DIVISION.
        PROGRAM-ID. AtCoder.
      
        ENVIRONMENT DIVISION.
      
        DATA DIVISION.
        WORKING-STORAGE SECTION.
        01 INP PIC X(100).
        01 A PIC 9(15).
        01 B PIC 9(15).
        01 C PIC 9(15).
      	01 D PIC 9(15).
      	01 F PIC 9(15).
      	01 E PIC ZZZZZZZZZZZZ9.
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
      		IF A >= 13 THEN
      			MOVE B to E
      		ELSE
      			IF A >= 6 THEN
      				COMPUTE E = B / 2
      			ELSE
      				MOVE 0 TO E
      			END-IF
      		END-IF.
      		DISPLAY E.
		STOP RUN.