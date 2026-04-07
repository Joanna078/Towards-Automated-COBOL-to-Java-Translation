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
      	01 ans PIC ZZZZZZZZZZZZZZ.
      	01 t PIC 9(15).
	    01 temp1 PIC 9(15).
        01 temp2 PIC 9(15).
        01 N PIC 9(15).
        PROCEDURE DIVISION.
      	MAIN.
			ACCEPT A.
      		MOVE 2000000000000 to ans.
      		COMPUTE B = FUNCTION SQRT(A) + 2.
      		PERFORM VARYING t FROM 1 BY 1 UNTIL t = B + 1
      			COMPUTE C = A / t
      			COMPUTE C = C * t
      			IF C = A THEN
      				IF ans > t + A/t - 2 THEN
      					COMPUTE ans = t + A/t - 2
      				END-IF
      			END-IF
      		END-PERFORM.
			DISPLAY ans.
		STOP RUN.