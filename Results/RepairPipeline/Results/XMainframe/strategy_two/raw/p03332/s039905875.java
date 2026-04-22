```cobol
       IDENTIFICATION DIVISION.
       PROGRAM-ID. COMBINATION-CALCULATOR.

       DATA DIVISION.
       WORKING-STORAGE SECTION.
       01  N PIC 9(3) VALUE 0.
       01  K PIC 9(3) VALUE 0.
       01  AX PIC 9(3) VALUE 0.
       01  BX PIC 9(3) VALUE 0.
       01  FACTORIAL-TABLE OCCURS 100 TIMES PIC 9(18).
       01  INVERSE-TABLE OCCURS 100 TIMES PIC 9(18).
       01  RESULT PIC 9(18) VALUE 0.

       PROCEDURE DIVISION.
           ACCEPT N FROM KEYBOARD.
           ACCEPT K FROM KEYBOARD.
           ACCEPT AX FROM KEYBOARD.
           ACCEPT BX FROM KEYBOARD.

           PERFORM VARYING N FROM 0 BY 1 UNTIL N > 100
               IF N = 0 OR N = 1
                   MOVE 1 TO FACTORIAL-TABLE(N)
               ELSE
                   MOVE FUNCTION FACTORIAL-TABLE(N - 1) * N TO FACTORIAL-TABLE(N)
               END-IF
           END-PERFORM.

           PERFORM VARYING N FROM 0 BY 1 UNTIL N > 100
               IF N = 0
                   MOVE 1 TO INVERSE-TABLE(N)
               ELSE
                   MOVE FUNCTION INVERSE-TABLE(N - 1) / N TO INVERSE-TABLE(N)
               END-IF
           END-PERFORM.

           IF K > N OR (K * AX + (N - K) * BX) > N
               DISPLAY "Invalid input"
           ELSE
               MOVE FUNCTION FACTORIAL-TABLE(N) TO RESULT
               MULTIPLY INVERSE-TABLE(K) BY RESULT
               MULTIPLY INVERSE-TABLE(N - K) BY RESULT
               DISPLAY "Number of ways: " RESULT
           END-IF.

           STOP RUN.
```