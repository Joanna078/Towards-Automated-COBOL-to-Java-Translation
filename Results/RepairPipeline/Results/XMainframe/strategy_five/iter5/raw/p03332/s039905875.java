```java
import java.util.Scanner;

public class AGC_025_B {
    static final int INF = 998244353;
    static final int BNY = 2;
    static int[] F = new int[300000];
    static int[] V = new int[300000];
    static int[] IV = new int[300000];
    static int[] CM = new int[300000];
    static String INP;
    static int N, AX, BX, K;
    static int half;
    static int a, b;
    static long tmp;
    static int rm, dv;
    static long dvx;
    static long d;
    static int i, j, mi;
    static int d_num, d_ret;
    static int comba, combb;
    static int m, sm;
    static int md;
    static long t;
    static String ans;
    static String ZS;
    static String DUMMY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        INP = scanner.nextLine();
        scanner.close();

        String[] parts = INP.split(" ");
        N = Integer.parseInt(parts[0]);
        AX = Integer.parseInt(parts[1]);
        BX = Integer.parseInt(parts[2]);
        K = Integer.parseInt(parts[3]);

        d_num = N;
        half = d_num / BNY;
        rm = d_num % BNY;

        FACT_CALC();

        sm = 0;

        for (i = 0; N >= i; i++) {
            if (K == 0) {
                sm++;
                break;
            }

            a = i;
            tmp = AX * a;

            if (K < tmp) {
                break;
            }

            rm = K - (int) tmp;

            dv = rm / BX;
            rm = rm % BX;

            if (rm == 0 && dv <= N) {
                b = dv;

                comba = 1;
                if (a != 0 && N != a) {
                    if (half < a) {
                        a = N - a;
                    }
                    comba = CM[a];
                }

                combb = 1;
                if (b != 0 && N != b) {
                    if (half < b) {
                        b = N - b;
                    }
                    combb = CM[b];
                }

                dvx = (long) comba * combb;
                dvx = dvx % INF;

                sm += (int) dvx;
                if (INF < sm) {
                    sm -= INF;
                }
            }
        }

        ZS = String.format("%018d", sm);
        UNANS();

        System.out.println(ans.substring(0, ans.length() - (DUMMY == null || DUMMY.isEmpty() ? 0 : DUMMY.length())));
    }

    static void UNANS() {
        String[] parts = ZS.split(" ");
        if (parts.length > 1) {
            DUMMY = parts[0];
            ans = parts[1];
        } else {
            DUMMY = "";
            ans = parts[0];
        }
    }

    static void FACT_CALC() {
        i = 1;
        F[i] = 1;
        V[i] = 1;
        IV[i] = 1;

        for (i = BNY; d_num >= i; i++) {
            long t = (long) i * F[i];
            d = t / INF;
            md = (int) (t % INF);
            F[i] = md;

            d = INF / i;
            md = (int) (INF % i);

            md = V[md] * (int) d;
            d = md / INF;
            md = (int) (md % INF);

            V[i] = INF - md;

            mi = i - 1;
            d = (long) IV[mi] * V[i];
            d = d / INF;
            md = (int) (d % INF);

            IV[i] = md;
        }

        d_ret = F[i];

        i = 1;
        CM[i] = d_num;

        for (i = BNY; half >= i; i++) {
            mi = N - i;
            d = (long) F[i] * IV[mi];
            d = d / INF;
            md = (int) (d % INF);

            md = md * IV[i];
            d = md / INF;
            md = (int) (d % INF);

            CM[i] = md;
        }
    }
}
```