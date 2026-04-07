       IDENTIFICATION DIVISION.
       PROGRAM-ID. test1.
       ENVIRONMENT DIVISION.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01 INP PIC X(2000).
       01 A-REC.
      	02 A-DATA OCCURS 200 .
      		03 A PIC 999999999 .
       01 temp1 PIC 9999.
       01 temp2 PIC 9999.
       01 temp3 PIC 99999.
       01 N PIC 999.
       01 REN PIC ZZZZ9.
       01 RE PIC 99999.
       01 MOD PIC 9.
       01 R PIC 999999999.
       01 S PIC 999.
       01 NOW PIC 9999.
       PROCEDURE DIVISION.
       MAIN.
      	MOVE 10000 TO RE.
      	ACCEPT N.
      	MOVE 1 TO NOW.
      	ADD 1 TO N.
      	ACCEPT INP.
      	PERFORM VARYING S FROM 1 BY 1 UNTIL S = N
      		PERFORM VARYING temp1 FROM NOW BY 1 UNTIL INP(temp1:1)=SPACE
      		END-PERFORM
      		COMPUTE temp2 = temp1 - NOW
      		MOVE INP(NOW:temp2) TO A(S)
      		COMPUTE NOW = temp1 + 1
      	END-PERFORM.
      	PERFORM VARYING S FROM 1 BY 1 UNTIL S = N
      		COMPUTE R = A(S) / 2
      		COMPUTE MOD = A(S) - R*2
      		PERFORM VARYING temp3 FROM 0 BY 1 UNTIL MOD = 1
      			COMPUTE R = A(S) / 2
      			COMPUTE MOD = A(S) - R*2
      			COMPUTE A(S) = R
      		END-PERFORM
      		IF temp3 > 0 THEN
      			SUBTRACT 1 FROM temp3
      		END-IF
      		IF temp3 < RE THEN
      			MOVE temp3 TO RE
      		END-IF
      	END-PERFORM.
      	MOVE RE TO REN.
      	DISPLAY REN.
        STOP RUN.


