       *> AtCoder My Practice
       *> author: Leonardone @ NEETSDKASU
       *>
       IDENTIFICATION DIVISION.
       PROGRAM-ID. Answer.
       ENVIRONMENT DIVISION.
       CONFIGURATION SECTION.
       REPOSITORY.
              FUNCTION ALL INTRINSIC.
       DATA DIVISION.
       WORKING-STORAGE SECTION.
              01 Input-Values.
                     05 n      BINARY-SHORT.
                     05 arare  PIC X(200).
              01 Calc-Values.
                     05 ans    PIC X(5).
       PROCEDURE DIVISION.
       AnswerMain SECTION.
       000-Start.
       
              ACCEPT n.
              ACCEPT arare.
              
              MOVE "Three" TO ans.
              MULTIPLY 2 BY n.
              SUBTRACT 1 FROM n.
       001-LoopHead.
              IF arare(n:1) = "Y" THEN
                     MOVE "Four" TO ans
                     GO TO 002-Output
              END-IF.
              SUBTRACT 1 FROM n.
              IF n < 0 THEN
                     GO TO 002-Output
              END-IF.
              GO TO 001-LoopHead.
       002-Output.
              DISPLAY TRIM(ans).
       END PROGRAM Answer.
