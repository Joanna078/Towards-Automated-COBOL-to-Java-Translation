       IDENTIFICATION DIVISION.
       PROGRAM-ID. ABC046-B.
       DATA DIVISION.
       FILE SECTION.
       WORKING-STORAGE SECTION.
       77 STR PIC X(11).
       77 N PIC 9(4).
       77 K PIC 9(4).
       77 ANS PIC 9(10).
       77 ANSS PIC Z(9)9.

       PROCEDURE DIVISION.
       MAIN-PROCEDURE.
               ACCEPT STR FROM SYSIN.
               UNSTRING STR DELIMITED " "
                INTO N K.
               COMPUTE ANS = K * (K - 1) ** (N - 1).
               MOVE ANS TO ANSS.
               DISPLAY ANSS.
               STOP RUN.
       END PROGRAM ABC046-B.
