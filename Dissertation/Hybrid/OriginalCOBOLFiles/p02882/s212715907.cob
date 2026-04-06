		IDENTIFICATION DIVISION.
        PROGRAM-ID. AtCoder.
      
        ENVIRONMENT DIVISION.
      
        DATA DIVISION.
        WORKING-STORAGE SECTION.
        01 INP PIC X(100).
        01 A PIC 9(05)V9(10).
        01 B PIC 9(05)V9(10).
      	01 C PIC 9(05)V9(10).
      	01 D PIC ZZZZ9.9999999999.
      	01 X PIC 9(15).
      	01 Y PIC 9(15).
      	01 W PIC 9(15).
      	01 E PIC 9(10).
      	01 F PIC 9(10).
      	01 t PIC 9(15).
	    01 temp1 PIC 9(15).
        01 temp2 PIC 9(15).
      	01 temp3 PIC 9(15).
        01 N PIC 9(15).
        PROCEDURE DIVISION.
      	MAIN.
      		ACCEPT INP.
			PERFORM VARYING temp1 FROM 1 BY 1
            UNTIL INP(temp1:1) = SPACE
        	END-PERFORM.
        	SUBTRACT 1 FROM temp1.
        	MOVE INP(1:temp1) TO X.
        	ADD 2 TO temp1.
        	PERFORM VARYING temp2 FROM temp1 BY 1
            UNTIL INP(temp2:1) = SPACE
        	END-PERFORM.
        	COMPUTE N = temp2 - temp1.
        	MOVE INP(temp1:N) TO Y.
      		ADD 1 TO temp2.
      		PERFORM VARYING temp3 FROM temp2 BY 1
            UNTIL INP(temp3:1) = SPACE
        	END-PERFORM.
        	COMPUTE N = temp3 - temp2.
        	MOVE INP(temp2:N) TO W.
      		MOVE X to A.
      		MOVE Y to B.
      		MOVE W to C.
       		COMPUTE C = C / A.
      		IF C >= A * B / 2.0 THEN
      			COMPUTE C = C - A * B / 2.0
      			COMPUTE C = 2.0 * C / A
      			COMPUTE C = B - C
      			COMPUTE C = FUNCTION ATAN(C/A)
      		ELSE
      			COMPUTE C = 2.0 * C / B
      			COMPUTE C = FUNCTION ATAN(B/C)
      		END-IF.
      		COMPUTE C = C * 180.0 / 3.1415926535898.
      		MOVE C to D.
      		DISPLAY D.
		STOP RUN.