```java
import java.util.Scanner;

public class AGC_025_B {
    static final int INF = 998244353;
    static final int BNY = 2;

    static int[] F = new int[300000];
    static int[] V = new int[300000];
    static int[] IV = new int[300000];
    static int[] CM = new int[300000];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String INP = scanner.nextLine();

        String[] parts = INP.split(" ");
        int N = Integer.parseInt(parts[0]);
        int AX = Integer.parseInt(parts[1]);
        int BX = Integer.parseInt(parts[2]);
        int K = Integer.parseInt(parts[3]);

        int half = N / BNY;
        int rm = N % BNY;

        factCalc(N);

        int sm = 0;

        for (int i = 0; i <= N; i++) {
            if (K == 0) {
                sm++;
                break;
            }

            int a = i;
            int tmp = AX * a;

            if (K < tmp) {
                break;
            }

            K -= tmp;
            int dv = K / BX;
            rm = K % BX;

            if (rm == 0 && dv <= N) {
                int b = dv;

                int comba = 1;
                if (a != 0 && a != N) {
                    if (half < a) {
                        a = N - a;
                    }
                    comba = CM[a];
                }

                int combb = 1;
                if (b != 0 && b != N) {
                    if (half < b) {
                        b = N - b;
                    }
                    combb = CM[b];
                }

                int dvx = (int) (((long) comba * combb) % INF);
                int m = dvx % INF;
                sm += m;
                if (sm >= INF) {
                    sm -= INF;
                }
            }
        }

        String ZS = String.format("%018d", sm);
        String ans = ZS.replaceAll("^0*", "");

        System.out.println(ans);
    }

    static void factCalc(int d_num) {
        F[0] = 1;
        V[0] = 1;
        IV[0] = 1;
        CM[0] = d_num;

        for (int i = BNY; i <= d_num; i++) {
            int t = (int) ((long) i * F[i - 1] % INF);
            F[i] = t;

            int md = INF % i;
            int d = (int) ((long) V[md] * (INF / i) % INF);
            V[i] = INF - md;

            int mi = i - 1;
            d = (int) ((long) IV[mi] * V[i] % INF);
            IV[i] = d;
        }

        CM[1] = d_num;
        for (int i = BNY; i <= d_num / 2; i++) {
            int mi = N - i;
            int d = (int) ((long) F[d_num] * IV[mi] % INF);
            d = (int) ((long) d * IV[i] % INF);
            CM[i] = d;
        }
    }
}
```