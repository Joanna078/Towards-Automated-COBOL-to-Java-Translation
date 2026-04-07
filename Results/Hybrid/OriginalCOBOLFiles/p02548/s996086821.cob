*> DENTIFICATION DIVISIONでは、プログラムの名前を記述するところ。
IDENTIFICATION DIVISION.
PROGRAM-ID. SORTNUM.

*> DATA DIVISION では、プログラム上で扱う全ての変数を定義している。
DATA DIVISION.
    WORKING-STORAGE SECTION.
      	01 N PIC 9(6).
      
      	01 POIN PIC X(4) VALUES 'FALS'.
      
      	01 A PIC 9(6) VALUES 1.
      	01 B PIC 9(6) VALUES 1.
      	01 C PIC 9(6) VALUES 1.
      
      	01 RES PIC 9(6).
      	
      	01 CNT PIC 9(6).
      
      	01 OUT PIC Z(5)9.

*> PROCEDURE DIVISIONでは、プログラムが行う処理を書いていく。
PROCEDURE DIVISION.
    MAIN SECTION.
      
      	ACCEPT N.
    	
      	PERFORM VARYING A FROM 1 BY 1
      		UNTIL A = N
      		
      		PERFORM VARYING B FROM 1 BY 1
      			UNTIL B = N
      		
      			PERFORM VARYING C FROM 1 BY 1
      				UNTIL C = N
      
      				COMPUTE RES = A * B + C
      				
      				IF RES > N THEN
      				    EXIT PERFORM
      				END-IF
      				
      				IF RES = N THEN
      				
      					ADD 1 TO CNT
      					EXIT PERFORM
      				END-IF
      			END-PERFORM
      		END-PERFORM
      	END-PERFORM.
        
        MOVE CNT TO OUT.
        DISPLAY FUNCTION TRIM(OUT).

*> プログラム終了！！お疲れ様でした。
    STOP RUN.
