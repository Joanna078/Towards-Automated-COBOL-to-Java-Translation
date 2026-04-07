       IDENTIFICATION DIVISION.
       PROGRAM-ID. ABC043-A.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       77 N PIC 9(3).
       77 ANS PIC 9(4).
       77 ANSS PIC ZZZ9.

       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
               ACCEPT N FROM SYSIN.
               COMPUTE ANS = N * (N + 1) / 2.
               MOVE ANS TO ANSS.
               DISPLAY ANSS.
               STOP RUN.
       END PROGRAM ABC043-A.
