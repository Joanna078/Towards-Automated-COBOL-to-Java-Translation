IDENTIFICATION DIVISION.
PROGRAM-ID. 175C.
*>
DATA DIVISION.
WORKING-STORAGE SECTION.
01 INP        PIC  X(51).
01 X          PIC S9(16) COMP.
01 WX         PIC  9(16) COMP.
01 K          PIC  9(16) COMP.
01 D          PIC  9(16) COMP.
01 S          PIC  9(16) COMP.
01 R          PIC  9(16) COMP.
01 ZA         PIC S9(16).
01 OUT        PIC  Z(16)9.
*> 
PROCEDURE DIVISION.
  ACCEPT INP.
  UNSTRING INP DELIMITED BY ' '
      INTO X K D.
*>
  MOVE X TO WX.
  DIVIDE WX BY D GIVING S REMAINDER R.
  IF (S > 0)
    IF (X > 0)
      IF (S > K)
        COMPUTE ZA = X - K * D
        MOVE 0 TO K
      ELSE
        COMPUTE ZA = X - S * D
        COMPUTE K  = K - S
      END-IF
    ELSE
      IF (S > K)
        COMPUTE ZA = X + K * D
        MOVE 0 TO K
      ELSE
        COMPUTE ZA = X + S * D
        COMPUTE K  = K - S
      END-IF
    END-IF
  ELSE
    MOVE X TO ZA
  END-IF.
*>
  IF (K > 0)
    DIVIDE K BY 2 GIVING S REMAINDER R
    IF (R = 0)
      MOVE ZA TO OUT
    ELSE
      IF (ZA > 0)
        COMPUTE OUT = ZA - D
      ELSE
        COMPUTE OUT = ZA + D
    END-IF
  ELSE
    MOVE ZA TO OUT
  END-IF.
*>
  DISPLAY FUNCTION TRIM(OUT).
  STOP RUN.
