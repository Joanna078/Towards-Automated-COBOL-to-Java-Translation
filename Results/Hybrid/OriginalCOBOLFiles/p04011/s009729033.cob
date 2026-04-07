       IDENTIFICATION DIVISION.
       PROGRAM-ID. TESTA.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       77 N PIC 9(5).
       77 K PIC 9(5).
       77 X PIC 9(5).
       77 Y PIC 9(5).
       77 ANS PIC 9(9).
       77 ANSS PIC Z(9).

       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
               ACCEPT N.
               ACCEPT K.
               ACCEPT X.
               ACCEPT Y.
               IF K < N THEN
                   COMPUTE ANS = K * X + (N - K) * Y
               ELSE
                   COMPUTE ANS = N * X
               END-IF.
               MOVE ANS TO ANSS.
               DISPLAY ANSS.
               STOP RUN.
       END PROGRAM TESTA.
