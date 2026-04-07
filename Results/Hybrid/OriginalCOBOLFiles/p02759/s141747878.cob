PROGRAM-ID.                      PROGRAM_ID.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N            PIC 9(3).
    01 ans          PIC Z(2)9.

PROCEDURE                        DIVISION.
    ACCEPT N.
    COMPUTE ans = N / 2 + 0.9.
    DISPLAY ans.
    STOP RUN.
