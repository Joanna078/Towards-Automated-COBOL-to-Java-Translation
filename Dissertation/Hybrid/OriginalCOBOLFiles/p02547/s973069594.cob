*> DENTIFICATION DIVISIONでは、プログラムの名前を記述するところ。
IDENTIFICATION DIVISION.
PROGRAM-ID. SORTNUM.

DATA DIVISION.
    WORKING-STORAGE SECTION.
      
      01 N PIC 999.
      01 INT PIC X(3).
      01 D1 PIC 9.
      01 D2 PIC 9.
      
      01 CNT PIC 9.

*> PROCEDURE DIVISIONでは、プログラムが行う処理を書いていく。
PROCEDURE DIVISION.
    MAIN SECTION.
    	
      	ACCEPT N.
      
      	PERFORM N TIMES
      		ACCEPT INT
      		
      		UNSTRING INT DELIMITED ' '
      			INTO D1 D2
      		
      		IF D1 = D2 THEN
      			ADD 1 TO CNT
      			
      			IF CNT = 3 THEN
      				DISPLAY 'Yes'
      				EXIT PERFORM
      			END-IF
      		ELSE
      			MOVE 0 TO CNT
      		END-IF
      	END-PERFORM.
      	
      	IF CNT NOT = 3 THEN
      		DISPLAY 'No'
      	END-IF.
      	


*> プログラム終了！！お疲れ様でした。
    STOP RUN.
