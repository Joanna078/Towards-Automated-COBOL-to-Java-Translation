IDENTIFICATION DIVISION.
PROGRAM-ID. D-Friend.
 
DATA DIVISION.
WORKING-STORAGE SECTION.
01 INP      PIC X(100).
01 IN-DATA.
   03 DT-X1  PIC X(10).
   03 DT-X2  PIC X(10).
01 IN-LEN.
   03 DT-L1  PIC 9(2).
   03 DT-L2  PIC 9(2).
01 IN-N      PIC 9(6).
01 IN-M      PIC 9(6).
01 IN-K      PIC 9(6).
01 IN-X      PIC 9(6).
01 IN-Y      PIC 9(6).
01 C-FR2     PIC 9(6).
01 TBL-FRIEND.
   03 T-FRI  OCCURS 100000 DEPENDING ON IN-M.
     05  T-F1 PIC 9(6).
     05  T-F2 PIC 9(6).
01 TBL-FRIEND2.
   03 T-FRI2 OCCURS 200001 DEPENDING ON C-FR2.
     05  T-F3 PIC 9(6).
     05  T-F4 PIC 9(6).
01 FLG-SEARCH PIC X(100000).
01 TBL-BLOCK.
   03 T-BLK OCCURS 100000 DEPENDING ON IN-K.
     05  T-B1 PIC 9(6).
     05  T-B2 PIC 9(6).
01 S-KEY      PIC 9(6).
01 TBL-SEARCH.
   03 S-FRI   PIC 9(6) OCCURS 100000.
   03 S-POS   PIC 9(6) OCCURS 100000.
01 TBL-KOHO.
   03 T-KH    PIC 9(5) OCCURS 100000.
01 IDX-IJ.
   03 I       PIC 9(6).
   03 J       PIC 9(6).
01 INDEX-AREA.
   03 K       PIC 9(6).
   03 K-CUR   PIC 9(6).
   03 K-MIN   PIC 9(6).
   03 K-MAX   PIC 9(6).
01 P-F        PIC 9(6).
01 P-B        PIC 9(6).
01 LVL        PIC 9(6).
*>
01 LEN        PIC 9(6).
01 FLAG-AREA.
   03 FL-NXT  PIC X(1).
   03 FL-HIT  PIC X(1).
   03 FL-FRI  PIC X(1).
   03 FL-BLK  PIC X(1).
01 EDIT-AREA.
   03 ED-FRI  PIC Z(5)9.
01 OUT-K      PIC X(600001).
 
PROCEDURE DIVISION.
MAIN      SECTION.
  ACCEPT INP.
  UNSTRING INP DELIMITED BY ALL ' '
      INTO IN-N IN-M IN-K.
  COMPUTE C-FR2 = IN-M * 2.
 
  PERFORM VARYING I FROM 1 BY 1 UNTIL I > IN-N
    MOVE 0 TO T-KH(I)
  END-PERFORM.

  PERFORM VARYING I FROM 1 BY 1 UNTIL I > IN-M
    ACCEPT INP
    UNSTRING INP DELIMITED BY ALL ' '
        INTO IN-X IN-Y 
    IF (IN-X < IN-Y)
      MOVE IN-X TO T-F1(I)
      MOVE IN-Y TO T-F2(I)
ELSE
      MOVE IN-Y TO T-F1(I)
      MOVE IN-X TO T-F2(I)
    END-IF
    MOVE IN-X   TO T-F3(I) T-F4(I + IN-M)
    MOVE IN-Y   TO T-F4(I) T-F3(I + IN-M)
  END-PERFORM.
  PERFORM VARYING I FROM 1 BY 1 UNTIL I > IN-K
    ACCEPT INP
    UNSTRING INP DELIMITED BY ALL ' '
        INTO IN-X IN-Y
    IF (IN-X < IN-Y)
      MOVE IN-X TO T-B1(I)
      MOVE IN-Y TO T-B2(I)
ELSE
      MOVE IN-Y TO T-B1(I)
      MOVE IN-X TO T-B2(I)
    END-IF
  END-PERFORM.

*> ------------------------------------- テーブルソート -*
  SORT T-FRI  ASCENDING KEY T-F1 T-F2.
  SORT T-BLK  ASCENDING KEY T-B1 T-B2.
  SORT T-FRI2 ASCENDING KEY T-F3 T-F4.
*>
  MOVE 1 TO P-F P-B.
  PERFORM VARYING I FROM 1 BY 1 UNTIL I >= IN-N
    COMPUTE K = I + 1
    PERFORM VARYING J FROM K BY 1 UNTIL J > IN-N
*> IとJの友達チェック              
      PERFORM FRIEND-CHECK
*> IとJのブロックチェック  
      PERFORM BLOCK-CHECK
*>
      IF (FL-FRI = '0' AND FL-BLK = '0') *> - 友達候補チェック -*
        MOVE SPACE TO FLG-SEARCH(1:IN-N)
        MOVE '0'   TO FL-HIT
        MOVE 1     TO LVL
        MOVE I     TO S-FRI(LVL)
*>
      PERFORM FRIEND-SEARCH            *> - 友達の友達検索 -*
*>
        IF (FL-HIT = '1')
          ADD 1    TO T-KH(I)
          ADD 1    TO T-KH(J)
        END-IF
      END-IF
    END-PERFORM
  END-PERFORM.

*> ------------------------------------------- 結果出力 -*              
  MOVE 0 TO LEN.
  PERFORM VARYING I FROM 1 BY 1 UNTIL I > IN-N
    MOVE T-KH(I) TO ED-FRI
    PERFORM VARYING J FROM 5 BY -1 
      UNTIL (J < 1) OR (EDIT-AREA(J:1) = ' ') 
    END-PERFORM
    MOVE EDIT-AREA(J + 1:6 - J) TO OUT-K(LEN + 1:6 - J)
    MOVE ' '                    TO OUT-K(LEN + 7 - J :1)
    COMPUTE LEN = LEN + 7 - J
  END-PERFORM.
  DISPLAY OUT-K(1:LEN - 1).

MAIN-EXIT.
  STOP RUN.

*> --------------------------------------- 友達チェック -*              
FRIEND-CHECK SECTION.
FRIEND-CHECK-001.
  PERFORM UNTIL (P-F > IN-M) 
             OR (IDX-IJ <= T-FRI(P-F))
    ADD 1 TO P-F 
  END-PERFORM.
  IF (IDX-IJ = T-FRI(P-F))
    MOVE '1' TO FL-FRI
  ELSE
    MOVE '0' TO FL-FRI
  END-IF. 
FRIEND-CHECK-EXIT.
  EXIT.

*> ----------------------------------- ブロックチェック -*              
BLOCK-CHECK  SECTION.
BLOCK-CHECK-001.
  PERFORM UNTIL (P-B > IN-K) 
             OR (IDX-IJ <= T-BLK(P-B))
    ADD 1 TO P-B 
  END-PERFORM.
  IF (IDX-IJ = T-BLK(P-B))
    MOVE '1' TO FL-BLK
  ELSE
    MOVE '0' TO FL-BLK
  END-IF. 
BLOCK-CHECK-EXIT.
  EXIT.

*> ----------------------------------*-- 友達の友達検索 -*              
FRIEND-SEARCH SECTION.
FRIEND-SEARCH-001.
*>
  PERFORM SEARCH-FRI.
*>
  PERFORM UNTIL (S-POS(LVL) < 1) OR (FL-HIT = '1') 
             OR (T-F3(S-POS(LVL)) NOT = S-FRI(LVL)) 
    IF (J = T-F4(S-POS(LVL)))
      MOVE '1' TO FL-HIT
    ELSE
      IF (FLG-SEARCH(T-F4(S-POS(LVL)):1) = ' ')
        MOVE '1' TO FLG-SEARCH(T-F4(S-POS(LVL)):1)
        MOVE T-F4(S-POS(LVL)) TO S-FRI(LVL + 1)
        ADD 1    TO LVL
        PERFORM FRIEND-SEARCH          *> - 再帰呼び出し -* 
        COMPUTE LVL = LVL - 1
      END-IF 
    END-IF
    ADD 1 TO S-POS(LVL)
  END-PERFORM.
FRIEND-SEARCH-EXIT.
  EXIT.
*> -------------------------------- 友達検索（２分検索） -*              
SEARCH-FRI SECTION.
SEARCH-FRI-001.
  MOVE S-FRI(LVL) TO S-KEY.
  MOVE 1          TO K-MIN.
  MOVE C-FR2      TO K-MAX.
  MOVE 0          TO S-POS(LVL).
  COMPUTE K-CUR = (K-MIN + K-MAX) / 2.
  PERFORM UNTIL (K-MIN > K-MAX) OR (S-POS(LVL) > 0) 
    EVALUATE TRUE
      WHEN (S-KEY = T-F3(K-CUR)) 
        MOVE K-CUR TO S-POS(LVL)
      WHEN  (S-KEY < T-F3(K-CUR)) 
        COMPUTE K-MAX = K-CUR - 1
      WHEN OTHER
        COMPUTE K-MIN = K-CUR + 1
    END-EVALUATE
    COMPUTE K-CUR = (K-MIN + K-MAX) / 2
  END-PERFORM.
*>
  PERFORM UNTIL (S-POS(LVL) < 2) 
             OR (S-KEY NOT = T-F3(S-POS(LVL) - 1))
    COMPUTE S-POS(LVL) = S-POS(LVL) - 1
  END-PERFORM.
*>
SEARCH-FRI-EXIT.
  EXIT.
