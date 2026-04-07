IDENTIFICATION DIVISION.
PROGRAM-ID. 160D.
DATA DIVISION.
WORKING-STORAGE SECTION.
01 INP        PIC  X(15).
01 N          PIC  9(4) COMP.
01 X          PIC  9(4) COMP.
01 Y          PIC  9(4) COMP.
01 I          PIC  9(4) COMP.
01 J          PIC S9(4) COMP.
01 K          PIC  9(4) COMP.
01 I1         PIC  9(4) COMP.
01 J1         PIC  9(4) COMP.
01 J2         PIC  9(4) COMP.
01 SA         PIC  9(4) COMP.
01 CNT        PIC  9(4) COMP.
01 OUT        PIC  ZZZ9.
*>
PROCEDURE DIVISION.
  ACCEPT INP.
  UNSTRING INP DELIMITED BY ' '
      INTO N X Y. 
*>
  COMPUTE SA = Y - X.
  PERFORM VARYING I FROM 1 BY 1 UNTIL I >= N
    EVALUATE TRUE
    WHEN I = 1
      MOVE N TO CNT
    WHEN I = N - 1
      MOVE 0 TO CNT
    WHEN OTHER
      COMPUTE CNT = N - I
*>
      COMPUTE J = X - I + 1
      COMPUTE K = X + I - 1
      IF (J < 1)
        MOVE 1 TO J
      END-IF
      IF (K >= Y)
        COMPUTE K = Y - 1
      END-IF
*>
      PERFORM VARYING J FROM J BY 1 UNTIL J > K
        PERFORM VARYING I1 FROM 0 BY 1 UNTIL I1 >= I
          EVALUATE TRUE
            WHEN (J + I1 = X) 
            WHEN (J - I1 = X) 
              MOVE     Y TO   J1 J2
            WHEN (J + I1 < X) 
            WHEN (J - I1 > X) 
              CONTINUE
            WHEN OTHER
              ADD      1 TO   J1
              SUBTRACT 1 FROM J2
          END-EVALUATE
        END-PERFORM
*>
        IF (J1 = J2)
          IF (J + I < J1)
            ADD 1 TO CNT
          END-IF
        ELSE
          IF (J + I < J1) AND (J + I <= Y)  AND (J1 <= N)
            ADD 1 TO CNT
          ELSE
            IF (J + I < J1) AND (J + I > Y) AND (J + I <= N) AND (J1 > N)
              SUBTRACT 1 FROM CNT
            END-IF  
          END-IF
*>
          IF (J + I < J2)
              ADD 1 TO CNT
          ELSE
            IF (J + I > J2) AND (J + I <= Y)
              SUBTRACT 1 FROM CNT
            END-IF 
          END-IF
        END-IF
      END-PERFORM
    END-EVALUATE
*>
    MOVE CNT TO OUT
    DISPLAY FUNCTION TRIM(OUT)
  END-PERFORM.
*>
  STOP RUN.
