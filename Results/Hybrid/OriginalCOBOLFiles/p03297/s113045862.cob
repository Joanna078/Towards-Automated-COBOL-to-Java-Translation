PROGRAM-ID.                      AGC_026_B.
*> 入荷すると (個数 mod B) は (mod B の世界で) D mod B 個増える

*> 0 から B - 1 までの 円
*> a = A mod B
*> d = D mod B
*> スタート地点に戻る lcm(B, d) / d
*> スタート地点に戻る まで 他の地点 を 2 度 訪れることはない

*> lcm(B, d) = B * d / gcd(B, d)

*> d 移動 lcm(B, d)を1回ループ B / gcd(B, d) 回
*> gcm(B, d) 移動 Bを1回ループ 最大 B - g

*> 個数 mod B の最大は g = gcd(B, D) としてB - g + (A mod g)
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 T       PIC 9(3).

    01 INP     PIC X(79).
    01 A       PIC 9(19).
    01 B       PIC 9(19).
    01 C       PIC 9(19).
    01 D       PIC 9(19).

    01 g       PIC 9(19).
    01 ad      PIC 9(19).
    01 ar      PIC 9(19).

    01 x       PIC 9(19).

    01 str     PIC X(3).

PROCEDURE                        DIVISION.
    ACCEPT T.

    PERFORM T TIMES
        ACCEPT INP

        UNSTRING INP
        DELIMITED BY SPACE
        INTO A B C D

        MOVE "No" TO str

        IF B <= A AND B <=D
            IF B <= C
                MOVE "Yes" TO str
            ELSE
*> 個数 mod B の最大は g = gcd(B, D) としてB - g + (A mod g)
                CALL "GCD"      USING BY CONTENT B
                                      BY CONTENT D
                                      BY REFERENCE g

                DIVIDE g INTO A GIVING ad REMAINDER ar

                SUBTRACT g FROM B GIVING x

                ADD ar TO x

                IF x <= C
                    MOVE "Yes" TO str
                END-IF
            END-IF
        END-IF

        DISPLAY str(1:FUNCTION STORED-CHAR-LENGTH(str))
    END-PERFORM.

    STOP RUN.
END PROGRAM AGC_026_B.

PROGRAM-ID.                      GCD.
*> すべての整数 は 0 の約数
*> 0 と 7 の 最大公約数 は 7
*> X と Y の 最大公約数 は X と (X MOD Y) の 最大公約数 と同じ
*> gcd 1 ならば 互いに素
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N       EXTERNAL PIC 9(10).

    01 d       PIC 9(19).
    01 r       PIC 9(19).

    01 x       PIC 9(19).

LINKAGE                          SECTION.
*> (IN)  d_a
*>       d_b
*> (OUT) d_ret
    01 d_a     PIC 9(19).
    01 d_b     PIC 9(19).
    01 d_ret   PIC 9(19).

PROCEDURE                        DIVISION USING d_a d_b d_ret.
    MOVE d_a TO d_ret
    MOVE ZERO TO r
    MOVE d_b TO x

*> do while
    PERFORM WITH TEST AFTER UNTIL ZERO = r
        DIVIDE x INTO d_ret GIVING d REMAINDER r
        MOVE x TO d_ret
        MOVE r TO x
    END-PERFORM.
END PROGRAM GCD.

PROGRAM-ID.                      LCM.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 N       EXTERNAL PIC 9(10).

    01 g       PIC 9(19).
    01 t       PIC 9(10).

LINKAGE                          SECTION.
*> (IN)  d_a
*>       d_b
*> (OUT) d_ret
    01 d_a     PIC 9(19).
    01 d_b     PIC 9(19).
    01 d_ret   PIC 9(19).

PROCEDURE                        DIVISION USING d_a d_b d_ret.
    CALL "GCD"          USING BY CONTENT   d_a
                              BY CONTENT   d_b
                              BY REFERENCE g

*> a * (b / g)
    DIVIDE g INTO d_b GIVING t
    MULTIPLY d_a BY t

    MOVE t TO d_ret.
END PROGRAM LCM.
