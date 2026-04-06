       IDENTIFICATION DIVISION.
       PROGRAM-ID. test1.
       ENVIRONMENT DIVISION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 INP PIC X(100).
       01 A PIC 9999999999.
       01 B PIC 9999999999.
       01 C PIC X(100).
       01 REN PIC 9999999.
       01 RE PIC ZZZZZZZZ9.
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
      	IF A >= B THEN
      		SUBTRACT B FROM A
      	ELSE
      		MOVE 0 TO A
      	END-IF.
      	MOVE A TO RE.
      	DISPLAY RE.
        STOP RUN.

