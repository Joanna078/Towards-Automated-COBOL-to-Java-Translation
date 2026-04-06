IDENTIFICATION DIVISION.
PROGRAM-ID. 162C.
DATA DIVISION.
WORKING-STORAGE SECTION.
01 K          PIC  9(3) COMP.
01 A          PIC  9(3) COMP.
01 B          PIC  9(3) COMP.
01 C          PIC  9(3) COMP.
01 X          PIC  9(3) COMP.
01 Y          PIC  9(3) COMP.
01 Z          PIC  9(3) COMP.
01 S          PIC  9(3) COMP.
01 R          PIC  9(3) COMP.
01 GK         PIC  9(9) COMP.
01 OUT        PIC  Z(8)9.
01 GCD-TBL.
   03 G-T1    OCCURS 200.
      05 G    PIC 9(3) OCCURS 200. 
*>
PROCEDURE DIVISION.
  ACCEPT K.
*>
  MOVE ZERO TO GK GCD-TBL.
  PERFORM VARYING A FROM 1 BY 1 UNTIL A > K
    PERFORM VARYING B FROM 1 BY 1 UNTIL B > K
    *>IF (A >= B) AND (G(B, A) > 0)
    *>  MOVE G(B, A) TO Z
    *>ELSE
      EVALUATE TRUE
        WHEN G(A, B) > 0
          MOVE G(A, B) TO Z
        WHEN G(B, A) > 0
          MOVE G(B, A) TO Z
        WHEN OTHER
          MOVE A TO X
          MOVE B TO Y  
          PERFORM GCD
          MOVE X TO Z 
          IF (A <= B)
            MOVE Z TO G(A, B)
          ELSE
            MOVE Z TO G(B, A)
          END-IF
      END-EVALUATE  
    *>END-IF
*>      
      PERFORM VARYING C FROM 1 BY 1 UNTIL C > K
        EVALUATE TRUE 
          WHEN G(Z, C) > 0
            MOVE G(Z, C) TO X
          WHEN G(C, Z) > 0
            MOVE G(C, Z) TO X
          WHEN OTHER
            MOVE Z TO X  
            MOVE C TO Y  
            PERFORM GCD
            IF (Z <= C)
              MOVE X TO G(Z, C)
            ELSE
              MOVE X TO G(C, Z)
            END-IF
        END-EVALUATE
*>         
        ADD X TO GK
      END-PERFORM
    END-PERFORM
  END-PERFORM.
*>
  MOVE GK TO OUT.
  DISPLAY FUNCTION TRIM(OUT).
  STOP RUN.
*>---------------------------------------------<*
GCD SECTION.
  PERFORM UNTIL Y = 0
    DIVIDE X BY Y GIVING S REMAINDER R
    MOVE Y TO X
    MOVE R TO Y  
  END-PERFORM.
*>
  EXIT.