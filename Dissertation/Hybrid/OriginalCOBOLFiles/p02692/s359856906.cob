IDENTIFICATION DIVISION.
PROGRAM-ID. 166F.
DATA DIVISION.
WORKING-STORAGE SECTION.
01 INP        PIC  X(40).
01 S1         PIC  X(02).
01 S2         PIC  X(02).
01 N          PIC  9(06) COMP.
01 TBL.
   03 ABC     PIC  9(10) COMP OCCURS 3.
01 TBL1.
   03 O       PIC  X(01) OCCURS 100000.
01 I          PIC  9(6) COMP.
01 J1         PIC  9.
01 J2         PIC  9.
01 J3         PIC  9.
01 J4         PIC  9.
01 C-ABC      PIC  X(3) VALUE 'ABC'.
01 OUT        PIC  X(3).
*> 
PROCEDURE DIVISION.
  ACCEPT INP.
  UNSTRING INP DELIMITED BY ' '
       INTO N ABC(1) ABC(2) ABC(3).
*>
  MOVE 'Yes' TO OUT.
  ACCEPT S1.
  PERFORM VARYING I FROM 1 BY 1 UNTIL I > N OR OUT = 'No '
    IF (I = N) 
       MOVE '  ' TO S2
    ELSE
      ACCEPT S2
    END-IF
*>
    EVALUATE S1
      WHEN 'AB'
        MOVE 1 TO J1
        MOVE 2 TO J2
      WHEN 'AC'
        MOVE 1 TO J1
        MOVE 3 TO J2
      WHEN 'BC'
        MOVE 2 TO J1
        MOVE 3 TO J2
    END-EVALUATE
*>
    EVALUATE TRUE
      WHEN (ABC(J1) = 0) AND (ABC(J2) = 0)
        MOVE 'No ' TO OUT
      WHEN (ABC(J1) < ABC(J2))
        CONTINUE
      WHEN (ABC(J1) > ABC(J2))
        MOVE J2    TO J3
        MOVE J1    TO J2
        MOVE J3    TO J1
      WHEN (ABC(J1) = 1) AND (ABC(J2) = 1)
        EVALUATE S2
          WHEN 'AB'
            MOVE 1 TO J3
            MOVE 2 TO J4
          WHEN 'AC'
            MOVE 1 TO J3
            MOVE 3 TO J4
          WHEN 'BC'
            MOVE 2 TO J3
            MOVE 3 TO J4
        END-EVALUATE
*>
        EVALUATE TRUE            
          WHEN (J1 = J3)
            CONTINUE
          WHEN (J2 = J4)
            MOVE J1 TO J2
            MOVE J4 TO J1
          WHEN OTHER
            MOVE J1 TO J2
            MOVE J3 TO J1
        END-EVALUATE
      WHEN OTHER
        CONTINUE
    END-EVALUATE
*>
    ADD      1 TO   ABC(J1)
    SUBTRACT 1 FROM ABC(J2)
    MOVE C-ABC(J1:1) TO O(I)
    MOVE S2 TO S1
  END-PERFORM.
*>
  DISPLAY FUNCTION TRIM(OUT).
  IF (OUT = 'Yes')
    PERFORM VARYING I FROM 1 BY 1 UNTIL I > N
      DISPLAY O(I)
    END-PERFORM
  END-IF.
*>
  STOP RUN.
