       IDENTIFICATION DIVISION.
       PROGRAM-ID. test1.
       ENVIRONMENT DIVISION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 INP PIC X(100).
       01 A PIC 99999999.
       01 B PIC 99999999.
       01 C PIC 9999999999.
       01 REN PIC 9999999999.
       01 RE PIC ZZZZZZZZZZ9.
       01 temp1 PIC 9999999.
       01 temp2 PIC 9999999.
       01 temp3 PIC 9999999.
       01 N PIC 9999999.
       PROCEDURE DIVISION.
       MAIN.
       	ACCEPT INP.
      	PERFORM VARYING temp1 FROM 1 BY 1 UNTIL INP(temp1:1)=SPACE
      	END-PERFORM.
      	SUBTRACT 1 FROM temp1.
      	MOVE INP(1:temp1) TO A.
      	ADD 2 TO temp1.
      	PERFORM VARYING temp2 FROM temp1 BY 1 UNTIL INP(temp2:1)=SPACE
      	END-PERFORM.
      	COMPUTE N=temp2 - temp1.
      	MOVE INP(temp1:N) TO B.
      	ADD 1 TO temp2.
      	PERFORM VARYING temp1 FROM temp2 BY 1 UNTIL INP(temp1:1)=SPACE
      	END-PERFORM.
      	COMPUTE N=temp1 - temp2.
      	MOVE INP(temp2:N) TO C.
      	ADD 1 TO A.
      	MOVE 0 TO REN.
      	PERFORM VARYING N FROM 1 BY 1 UNTIL N = A
      		MOVE 0 TO temp1
      		MOVE N TO temp2
      		PERFORM MOD
      		IF temp1 >= B AND temp1 <= C THEN
      			ADD N TO REN
      		END-IF
      	END-PERFORM.
      	MOVE REN TO RE.
      	DISPLAY RE.
        STOP RUN.

      	MOD SECTION.
      	PERFORM 5 TIMES
      		COMPUTE temp3 = temp2 / 10
      		COMPUTE temp1 = temp1 + temp2 - temp3 * 10
      		COMPUTE temp2 = temp3
      	END-PERFORM.
   	   EXIT.

