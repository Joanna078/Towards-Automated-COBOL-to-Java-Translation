PROGRAM-ID.                      ABC_107_D.
ENVIRONMENT                      DIVISION.
INPUT-OUTPUT                     SECTION.
FILE-CONTROL.
    SELECT SYSIN ASSIGN TO KEYBOARD ORGANIZATION LINE SEQUENTIAL.

DATA                             DIVISION.
FILE                             SECTION.
    FD  SYSIN.
        01 INDATA PIC X(1100000).

WORKING-STORAGE                  SECTION.
    01 INF     EXTERNAL PIC 9(10).
    01 BNY     EXTERNAL PIC 9(1).
    01 Z       EXTERNAL PIC 9(10).

    01 N       EXTERNAL PIC 9(6).
    01 M       EXTERNAL PIC 9(6).

    01 INP     PIC X(1100000).

    01 cur     PIC 9(7) VALUE 1.
    01 i       PIC 9(18) VALUE 1.
    01 j       PIC 9(18).
    01 len     PIC 9(7).
    01 ans     PIC X(10).

    01 d_ret   PIC 9(10).

    01 x1 EXTERNAL.
        03 x PIC 9(10) OCCURS 100000 DEPENDING N
            INDEXED XX1 XX2.

    01 ZS      PIC Z(11).
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT N.

    OPEN INPUT SYSIN.

    READ SYSIN INTO INP.

    CLOSE SYSIN.

    INITIALIZE x1.
    COMPUTE M = N * 2 + 1.

    PERFORM VARYING XX1 FROM 1 BY 1 UNTIL N < XX1

        PERFORM VARYING j FROM cur BY 1
            UNTIL INP(j:1) = SPACE
        END-PERFORM

        COMPUTE len = j - cur

        MOVE INP(cur:len) TO x(XX1)

        COMPUTE cur = j + 1

    END-PERFORM.

*> 外部データ
*> 実行単位中の複数のプログラムで使用する定数を設定
    CALL "SET_EXTERNAL".

    CALL "BISECTION_METHOD" USING BY CONTENT Z
                                  BY CONTENT INF
                                  BY REFERENCE d_ret.

    MOVE d_ret TO ZS.

    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).
    STOP RUN.

UNANS                            SECTION.
    UNSTRING
    ZS DELIMITED BY ALL SPACE
    INTO DUMMY ans.
END PROGRAM ABC_107_D.

PROGRAM-ID.                      SET_EXTERNAL.
*> 外部データ
*> 実行単位中の複数のプログラムで使用する定数を設定
*> external data
*> Set constants used for multiple programs in running unit
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INF     EXTERNAL PIC 9(10).
    01 BNY     EXTERNAL PIC 9(1).
    01 Z       EXTERNAL PIC 9(10).

    01 N       EXTERNAL PIC 9(6).
    01 M       EXTERNAL PIC 9(6).

PROCEDURE                        DIVISION.
    MOVE 1000000001 TO INF
    MOVE 2 TO BNY.
    MOVE 0 TO Z.
END PROGRAM SET_EXTERNAL.

PROGRAM-ID.                      LOWEST_BIT_VAL.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INF     EXTERNAL PIC 9(10).
    01 BNY     EXTERNAL PIC 9(1).
    01 Z       EXTERNAL PIC 9(10).

    01 N       EXTERNAL PIC 9(6).
    01 M       EXTERNAL PIC 9(6).

    01 x       PIC 9(6).
    01 tmp     PIC S9(6).
    01 r       PIC 9(1).

LINKAGE                          SECTION.
*> (IN)  d_x
*> (OUT) d_tmp
    01 d_x     PIC 9(6).
    01 d_tmp   PIC 9(6).

PROCEDURE                        DIVISION USING d_x d_tmp.
*> BIT index ゼロより大きい
    MOVE -1 TO tmp

    MOVE ZERO TO r
    MOVE d_x TO x

    PERFORM UNTIL 1 = r
        DIVIDE BNY INTO x GIVING x REMAINDER r
        ADD 1 TO tmp
    END-PERFORM

    COMPUTE d_tmp = BNY ** tmp.
END PROGRAM LOWEST_BIT_VAL.

PROGRAM-ID.                      BIT_ADD.
*> v[x] += w
*> 次に更新すべき区間は
*> 番号に区間の長さを足すと求まる
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INF     EXTERNAL PIC 9(10).
    01 BNY     EXTERNAL PIC 9(1).
    01 Z       EXTERNAL PIC 9(10).

    01 N       EXTERNAL PIC 9(6).
    01 M       EXTERNAL PIC 9(6).

    01 BT1 EXTERNAL.
        03 BT PIC 9(6) OCCURS 200001 DEPENDING M
            INDEXED BX1 BX2.

    01 tmp     PIC 9(6).
    01 x       PIC S9(6).

LINKAGE                          SECTION.
*> (IN)  d_x
*> (OUT) none (BT)
    01 d_x     PIC S9(6).

PROCEDURE                        DIVISION USING d_x.
    MOVE d_x TO x

*> BIT は普通は負のインデックスに値を格納できない
*> オフセットを付ける
*> 1-indexed  n + 1
*> 0-indexed  n
    COMPUTE x = x + N + 1

    PERFORM VARYING BX1 FROM x BY tmp UNTIL M < BX1
        ADD 1 TO BT(BX1)

        CALL "LOWEST_BIT_VAL" USING BY CONTENT   x
                                    BY REFERENCE tmp

        ADD tmp TO x
    END-PERFORM.
END PROGRAM BIT_ADD.

PROGRAM-ID.                      BIT_QUERY.
*> v[1] + … + v[x]
*> 次に足すべき区間は
*> 番号から区間の長さを引くと求まる
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INF     EXTERNAL PIC 9(10).
    01 BNY     EXTERNAL PIC 9(1).
    01 Z       EXTERNAL PIC 9(10).

    01 N       EXTERNAL PIC 9(6).
    01 M       EXTERNAL PIC 9(6).

    01 BT1 EXTERNAL.
        03 BT PIC 9(6) OCCURS 200001 DEPENDING M
            INDEXED BX1 BX2.

    01 tmp     PIC S9(6).
    01 x       PIC S9(6).

LINKAGE                          SECTION.
*> (IN)  d_x
*> (OUT) d_ret
    01 d_x     PIC S9(6).
    01 d_ret   PIC 9(10).

PROCEDURE                        DIVISION USING d_x d_ret.
    MOVE ZERO TO d_ret

    MOVE d_x TO x

*> BIT は普通は負のインデックスに値を格納できない
*> オフセットを付ける
*> 1-indexed  n + 1
*> 0-indexed  n
    COMPUTE x = x + N + 1

    PERFORM VARYING BX1 FROM x BY tmp UNTIL ZERO = BX1
        ADD BT(BX1) TO d_ret

        CALL "LOWEST_BIT_VAL" USING BY CONTENT   x
                                    BY REFERENCE tmp

        SUBTRACT tmp FROM x

        MULTIPLY -1 BY tmp
    END-PERFORM.
END PROGRAM BIT_QUERY.

PROGRAM-ID.                      F.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INF     EXTERNAL PIC 9(10).
    01 BNY     EXTERNAL PIC 9(1).
    01 Z       EXTERNAL PIC 9(10).

    01 N       EXTERNAL PIC 9(6).
    01 M       EXTERNAL PIC 9(6).

    01 BT1 EXTERNAL.
        03 BT PIC 9(6) OCCURS 200001 DEPENDING M
            INDEXED BX1 BX2.

    01 x1 EXTERNAL.
        03 x PIC 9(10) OCCURS 100000 DEPENDING N
            INDEXED XX1 XX2.

    01 s1 EXTERNAL.
        03 s PIC S9(6) OCCURS 100000 DEPENDING N
            INDEXED SX1 SX2.

    01 prev    PIC S9(6).

    01 q_ret   PIC 9(10).
    01 ret     PIC 9(10).

LINKAGE                          SECTION.
*> (IN)  d_mid
*> (OUT) d_ret
    01 d_mid   PIC 9(10).
    01 d_ret   PIC 9(10).

PROCEDURE                        DIVISION USING d_mid d_ret.
    MOVE ZERO TO prev

    SET XX1 TO 1
    PERFORM VARYING SX1 FROM 1 BY 1 UNTIL N < SX1
        IF d_mid <= x(XX1)
            ADD 1 TO prev
        ELSE
            SUBTRACT 1 FROM prev
        END-IF

        MOVE prev TO s(SX1)
        SET XX1 UP BY 1
    END-PERFORM

*>初期化
    PERFORM VARYING BX1 FROM 1 BY 1 UNTIL M < BX1
        MOVE ZERO TO BT(BX1)
    END-PERFORM

    CALL "BIT_ADD"      USING BY CONTENT   Z

    MOVE ZERO TO ret

    PERFORM VARYING SX1 FROM 1 BY 1 UNTIL N < SX1
        CALL "BIT_QUERY"    USING BY CONTENT   s(SX1)
                                  BY REFERENCE q_ret

        ADD q_ret TO ret

*> ここで足すのはタイミング遅い気がするが
*> 他の点の始点となるのでこれで良い
*> ここに点があったことを記録する
        CALL "BIT_ADD"      USING BY CONTENT   s(SX1)
    END-PERFORM

    MOVE ret TO d_ret.
END PROGRAM F.

PROGRAM-ID.                      BISECTION_METHOD.
*> Bisection Method
*> [left, right]
*> to narrow the range
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INF     EXTERNAL PIC 9(10).
    01 BNY     EXTERNAL PIC 9(1).
    01 Z       EXTERNAL PIC 9(10).

    01 N       EXTERNAL PIC 9(6).
    01 M       EXTERNAL PIC 9(6).

    01 tmp     PIC S9(10).
    01 l       PIC 9(10).
    01 r       PIC 9(10).
    01 mid     PIC 9(10).
    01 p       PIC 9(11).

    01 BT1 EXTERNAL.
        03 BT PIC 9(6) OCCURS 200001 DEPENDING M
            INDEXED BX1 BX2.

    01 d_ret   PIC 9(10).

LINKAGE                          SECTION.
*> (IN)  d_l
*>       d_r
*> (OUT) d_ret
    01 d_l     PIC 9(10).
    01 d_r     PIC 9(10).
    01 ret     PIC 9(10).

PROCEDURE                        DIVISION USING d_l d_r ret.
    MOVE d_l TO l
    MOVE d_r TO r
    MOVE INF TO tmp

*> パターン数
*> 半数以上
*> 割る2 割る2 ceil
    COMPUTE p = N * (N + 1) + 3
    COMPUTE p = p / 4

    PERFORM WITH TEST AFTER UNTIL tmp < ZERO
        COMPUTE mid = (l + r) / 2

*>        CALL "F"            USING BY CONTENT   mid
*>                                  BY REFERENCE d_ret

*>        IF d_ret < mid
*>            MOVE mid TO r
*>        ELSE
*>            MOVE mid TO l
*>        END-IF

        CALL "F"            USING BY CONTENT   mid
                                  BY REFERENCE d_ret

*> 半数以上 判定
        IF p <= d_ret
            MOVE mid TO ret
            COMPUTE l = mid + 1
        ELSE
            COMPUTE r = mid - 1
        END-IF

        COMPUTE tmp = r - l
    END-PERFORM.
END PROGRAM BISECTION_METHOD.
