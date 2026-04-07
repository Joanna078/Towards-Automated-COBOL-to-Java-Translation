       IDENTIFICATION DIVISION.
       PROGRAM-ID. test1.
       ENVIRONMENT DIVISION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 INP PIC X(100).
       01 A PIC 999999.
       01 B PIC 999999.
       01 C PIC 999999999.
       01 REN PIC 9999999.
       01 RE PIC Z(7).
       01 temp1 PIC 9999.
       01 temp2 PIC 9999.
       01 N PIC 9999.
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
      	IF A = B AND B NOT = C THEN
      		DISPLAY 2
      	ELSE IF A NOT = B AND B = C THEN
      		DISPLAY 2
      	ELSE IF A = C AND B NOT = C THEN
      		DISPLAY 2
      	ELSE IF A = C AND B = C THEN
      		DISPLAY 1
      	ELSE 
      		DISPLAY 3
      	END-IF.
        STOP RUN.