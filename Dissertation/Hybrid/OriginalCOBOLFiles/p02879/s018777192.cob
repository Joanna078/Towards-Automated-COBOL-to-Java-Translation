		IDENTIFICATION DIVISION.
        PROGRAM-ID. AtCoder.
      
        ENVIRONMENT DIVISION.
      
        DATA DIVISION.
        WORKING-STORAGE SECTION.
        01 INP PIC X(100).
        01 A PIC 9(11).
        01 B PIC 9(11).
        01 C PIC 9(11).
	    01 temp1 PIC 9(11).
        01 temp2 PIC 9(11).
        01 N PIC 9(11).
      
        PROCEDURE DIVISION.
      	MAIN.
			ACCEPT INP.
        	PERFORM VARYING temp1 FROM 1 BY 1
            UNTIL INP(temp1:1)=SPACE
        	END-PERFORM.
        	SUBTRACT 1 FROM temp1.
        	MOVE INP(1:temp1) TO A.
        	ADD 2 TO temp1.
        	PERFORM VARYING temp2 FROM temp1 BY 1
            UNTIL INP(temp2:1)=SPACE
        	END-PERFORM.
        	COMPUTE N=temp2 - temp1.
        	MOVE INP(temp1:N) TO B.
      		COMPUTE C = A * B.
			IF A <= 9 AND B <= 9 THEN
				DISPLAY C
			ELSE 
				DISPLAY "-1"
			END-IF.
		STOP RUN.