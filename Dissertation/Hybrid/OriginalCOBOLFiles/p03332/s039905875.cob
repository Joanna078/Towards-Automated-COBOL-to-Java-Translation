*> Combination

*> 全体でn個の選択から縦(または横)を
*> r個選ぶ組合せ

*> nCr
*> = nPr / r!
*> = n! / {(n - r)! * r!}

*> (W + H)C(W > H ? W : H)
*> = (W + H)! / {(W + H - biggerWH)! * biggerWH!}

PROGRAM-ID.                      AGC_025_B.
DATA                             DIVISION.
WORKING-STORAGE                  SECTION.
    01 INF     PIC 9(10) VALUE 998244353.
    01 BNY     PIC 9(2) VALUE 2.

*> Factorial
    01 F1.
        03 F PIC 9(10) OCCURS 300000 INDEXED FIX.

    01 V1.
        03 V PIC 9(10) OCCURS 300000 INDEXED VIX.

*> Inverse
    01 IV1.
        03 IV PIC 9(10) OCCURS 300000 INDEXED IIX MIX.

*> Combination
    01 CM1.
        03 CM PIC 9(10) OCCURS 300000 INDEXED CIX.

    01 INP     PIC X(34).

    01 N       PIC 9(6).
    01 AX      PIC 9(6).
    01 BX      PIC 9(6).
    01 K       PIC 9(12).

    01 half    PIC 9(6).

    01 a       PIC 9(6) BINARY.
    01 b       PIC 9(6) BINARY.

    01 tmp     PIC 9(12) BINARY.

    01 rm      PIC 9(12).
    01 dv      PIC 9(12).

    01 dvx     PIC 9(19).

    01 d       PIC 9(19).

    01 i       PIC 9(18) BINARY.
    01 j       PIC 9(18) BINARY.

    01 mi      PIC 9(18) BINARY.

    01 d_num   PIC 9(10).
    01 d_ret   PIC 9(10).

*> combination a
    01 comba   PIC 9(10).

*> combination b
    01 combb   PIC 9(10).

    01 m       PIC 9(10).
    01 sm      PIC 9(18).

    01 md      PIC 9(10) BINARY.

    01 t       PIC 9(19).

    01 ans     PIC X(11).

    01 ZS      PIC Z(18)9.
    01 DUMMY   PIC X(1).

PROCEDURE                        DIVISION.
    ACCEPT INP.

    UNSTRING INP
    DELIMITED BY SPACE
    INTO N AX BX K.

    MOVE N TO d_num.

    DIVIDE BNY INTO d_num GIVING half REMAINDER rm

*> 階乗テーブル
*> 逆元テーブル
*> 組合せテーブル
    PERFORM FACT_CALC.

    MOVE ZERO TO sm.

    PERFORM VARYING i FROM ZERO BY 1 UNTIL N < i

        IF ZERO = K
            ADD 1 TO sm
            EXIT PERFORM
        END-IF

        MOVE i TO a
        MULTIPLY AX BY a GIVING tmp

        IF K < tmp
            EXIT PERFORM
        END-IF

        SUBTRACT tmp FROM K GIVING rm

        DIVIDE BX INTO rm GIVING dv REMAINDER rm

        IF ZERO = rm AND dv <= N
            MOVE dv TO b

*> combination a
*> a
*> N - a
            MOVE 1 TO comba
            IF ZERO NOT = a AND N NOT = a
                IF half < a
                    SUBTRACT a FROM N GIVING a
                END-IF
                SET MIX TO a
                MOVE CM(MIX) TO comba
            END-IF

*> combination b
*> b
*> N - b
            MOVE 1 TO combb
            IF ZERO NOT = b AND N NOT = b
                IF half < b
                    SUBTRACT b FROM N GIVING b
                END-IF
                SET MIX TO b
                MOVE CM(MIX) TO combb
            END-IF

*> combination a * combination b
            MULTIPLY comba BY combb GIVING dvx
            DIVIDE INF INTO dvx GIVING dvx REMAINDER m

            ADD m TO sm
            IF INF < sm
                SUBTRACT INF FROM sm
            END-IF

        END-IF

    END-PERFORM.

    MOVE sm TO ZS.
    PERFORM UNANS.

    DISPLAY ans(1:FUNCTION STORED-CHAR-LENGTH(ans)).

    STOP RUN.

UNANS                            SECTION.
    UNSTRING
        ZS DELIMITED BY ALL SPACE
        INTO DUMMY ans
    END-UNSTRING.

FACT_CALC                        SECTION.
    MOVE 1 TO i

    SET FIX TO i
    MOVE 1 TO F(FIX)

    SET VIX TO i
    MOVE 1 TO V(VIX)

    SET IIX TO i
    MOVE 1 TO IV(IIX)

*> 2
    PERFORM VARYING i FROM BNY BY 1 UNTIL d_num < i

        MULTIPLY i BY F(FIX) GIVING t
        DIVIDE INF INTO t GIVING d REMAINDER md

        SET FIX UP BY 1
        MOVE md TO F(FIX)

*> INF / i
*> INF % i
        DIVIDE i INTO INF GIVING d REMAINDER md

*> V(INF % i) * (INF / i)
        SET VIX TO md
        MULTIPLY V(VIX) BY d

*> V(INF % i) * (INF / i) % INF
        DIVIDE INF INTO d GIVING d REMAINDER md

*> V(i) = INF - V(INF % i) * (INF / i) % INF
        SET VIX TO i
        COMPUTE V(VIX) = INF - md

*> IV(i - 1) * V(i)
        SUBTRACT 1 FROM i GIVING mi

        SET IIX TO mi
        MULTIPLY IV(IIX) BY V(VIX) GIVING d

*> IV(i - 1) * V(i) % INF
        DIVIDE INF INTO d GIVING d REMAINDER md

*> IV(i) = IV(i - 1) * v(i) % INF
        SET IIX UP BY 1
        COMPUTE IV(IIX) = md

    END-PERFORM

    MOVE F(FIX) TO d_ret.

    MOVE 1 TO i

    SET CIX TO i
    MOVE d_num TO CM(CIX)

    SET IIX TO i

*> 2
    PERFORM VARYING i FROM BNY BY 1 UNTIL half < i

        SUBTRACT i FROM N GIVING mi
        SET IIX TO mi

        SET MIX TO i

        MULTIPLY F(FIX) BY IV(IIX) GIVING d
        DIVIDE INF INTO d GIVING d REMAINDER md

        MULTIPLY md BY IV(MIX) GIVING d
        DIVIDE INF INTO d GIVING d REMAINDER md

        SET CIX UP BY 1
        MOVE md TO CM(CIX)

    END-PERFORM.
