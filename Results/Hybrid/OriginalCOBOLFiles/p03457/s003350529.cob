       IDENTIFICATION DIVISION.
       PROGRAM-ID. test1.
       ENVIRONMENT DIVISION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 INP PIC X(100).
       01 A PIC 99999999.
       01 B PIC 99999999.
       01 C PIC 99999999.
       01 temp1 PIC 999999.
       01 temp2 PIC 999999.
       01 temp3 PIC 999999.
       01 temp4 PIC 999999.
       01 N PIC 999999.
       01 S PIC 999999.
       01 T PIC 999999.
       01 NOW1 PIC 999999.
       01 NOW2 PIC 999999.
       01 NOW3 PIC 999999.
       PROCEDURE DIVISION.
       MAIN.
      	ACCEPT S.
      	PERFORM VARYING T FROM 1 BY 1 UNTIL T > S
       		ACCEPT INP
      		PERFORM VARYING temp1 FROM 1 BY 1 UNTIL INP(temp1:1)=SPACE
      		END-PERFORM
      		SUBTRACT 1 FROM temp1
      		MOVE INP(1:temp1) TO A
      		ADD 2 TO temp1
      		PERFORM VARYING temp2 FROM temp1 
      			BY 1 UNTIL INP(temp2:1)=SPACE
      		END-PERFORM
      		COMPUTE N=temp2 - temp1
      		MOVE INP(temp1:N) TO B
      		ADD 1 TO temp2
      		PERFORM VARYING temp1 FROM temp2 
      			BY 1 UNTIL INP(temp1:1)=SPACE
      		END-PERFORM
      		COMPUTE N=temp1 - temp2
      		MOVE INP(temp2:N) TO C
      		COMPUTE temp1 = A - NOW1
      		COMPUTE temp2 = B - NOW2
      		COMPUTE temp3 = C - NOW3
      		COMPUTE temp2 = temp2 + temp3
      		IF temp1 < temp2 THEN
      			DISPLAY "No"
      			STOP RUN
      		END-IF
      		COMPUTE temp2 = temp1 / 2
      		COMPUTE temp1 = temp1 - temp2 * 2
      		COMPUTE temp2 = B - NOW2
      		COMPUTE temp3 = temp2 / 2 
      		COMPUTE temp2 = temp2 - temp3 * 2
      		COMPUTE temp3 = C - NOW3
      		COMPUTE temp4 = temp3 / 2
      		COMPUTE temp3 = temp3 - temp4 * 2
      		COMPUTE temp2 = temp2 + temp3
      		COMPUTE temp2 = temp2 - 2
      		IF temp2 = 2 THEN
      			MOVE 0 TO temp2
      		END-if
      		IF temp1 NOT = temp2 THEN
      			DISPLAY "No"
      			STOP RUN
      		END-IF
      		MOVE A TO NOW1
      		MOVE B TO NOW2
      		MOVE C TO NOW3
      	END-PERFORM.
      	DISPLAY "Yes"
        STOP RUN.


