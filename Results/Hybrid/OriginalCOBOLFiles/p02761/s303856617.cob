IDENTIFICATION DIVISION.
PROGRAM-ID. GUESSNUM.
 
DATA DIVISION.
WORKING-STORAGE SECTION.

01 INP1.
    03 N      PIC 9.
    03 FILLER PIC X.
    03 M      PIC 9.
01 INP2.
    03 S      PIC 9.
    03 FILLER PIC X.
    03 C      PIC 9.
01  I         PIC 9.
01  TBL.
    03 T-N    PIC 9 OCCURS 3.
01  OUT-N     PIC ZZ9.
01  SW-ERR    PIC X.

PROCEDURE DIVISION.
MAIN-010.
  MOVE SPACE TO TBL.
  MOVE '0'   TO SW-ERR.

  ACCEPT INP1.
  PERFORM VARYING I FROM 1 BY 1 UNTIL I > M
    ACCEPT INP2
    IF (T-N(S) = ' ')
      IF (C = '0') AND (S = 1) AND (N > 1)
        MOVE '1' TO SW-ERR
      ELSE
        MOVE C   TO T-N(S)
      END-IF
    ELSE 
      IF (T-N(S) NOT = C)
        MOVE '1' TO SW-ERR
      END-IF
    END-IF
  END-PERFORM.

  IF (SW-ERR = '1')
    DISPLAY '-1'
  ELSE
    IF (N > 1) AND (T-N(1) = ' ') 
      MOVE '1' TO T-N(1)
    END-IF
      
    PERFORM VARYING I FROM 1 BY 1 UNTIL I > N
      IF (T-N(I) = ' ')
        MOVE '0' TO T-N(I)
      END-IF
    END-PERFORM

    MOVE TBL(1:N) TO OUT-N
    DISPLAY OUT-N
  END-IF. 
  
MAIN-EXIT.
  STOP RUN.
