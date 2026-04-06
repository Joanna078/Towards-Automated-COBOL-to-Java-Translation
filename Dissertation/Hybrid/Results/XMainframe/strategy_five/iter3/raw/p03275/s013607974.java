```java
import java.util.Scanner;

public class ABC_107_D {
    static int INF = 1000000001;
    static int BNY = 2;
    static int Z = 0;
    static int N;
    static int M;
    static String INP;
    static int cur = 1;
    static long i = 1;
    static long j;
    static int len;
    static String ans = new String(new char[10]);
    static int d_ret;
    static int[] x = new int[100000];
    static String ZS = new String(new char[11]);
    static char DUMMY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        INP = scanner.nextLine().trim(); // Trim to remove leading/trailing whitespace

        M = N * 2 + 1;
        initializeX1();

        for (int XX1 = 1; XX1 <= N; XX1++) {
            for (j = cur; j <= INP.length() && !INP.substring((int) j - 1, (int) j).equals(" "); j++) ;
            len = (int) (j - cur);
            if (len > 0) { // Check to avoid parsing empty string
                x[XX1 - 1] = Integer.parseInt(INP.substring(cur - 1, cur + len - 1));
            }
            cur = (int) (j + 1);
        }

        SET_EXTERNAL();
        BISECTION_METHOD(0, INF);

        UNANS();
        System.out.println(ans.trim());
    }

    private static void initializeX1() {
        for (int i = 0; i < x.length; i++) {
            x[i] = 0;
        }
    }

    private static void SET_EXTERNAL() {
        INF = 1000000001;
        BNY = 2;
        Z = 0;
    }

    private static void BISECTION_METHOD(int d_l, int d_r) {
        int l = d_l;
        int r = d_r;
        int tmp = INF;
        int p = N * (N + 1) + 3;
        p /= 4;

        while (tmp >= 0) {
            int mid = (l + r) / 2;
            d_ret = F(mid);
            if (p <= d_ret) {
                d_ret = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            tmp = r - l;
        }
        ZS = String.valueOf(d_ret);
    }

    private static int F(int d_mid) {
        int prev = 0;
        int[] s = new int[N];
        for (int SX1 = 1; SX1 <= N; SX1++) {
            if (d_mid <= x[SX1 - 1]) {
                prev++;
            } else {
                prev--;
            }
            s[SX1 - 1] = prev;
        }

        int[] BT = new int[M];
        for (int BX1 = 1; BX1 <= M; BX1++) {
            BT[BX1 - 1] = 0;
        }

        BIT_ADD(BT, Z, N, M);
        int ret = 0;
        for (int SX1 = 1; SX1 <= N; SX1++) {
            int q_ret = BIT_QUERY(BT, s[SX1 - 1], N, M);
            ret += q_ret;
            BIT_ADD(BT, s[SX1 - 1], N, M);
        }
        return ret;
    }

    private static void BIT_ADD(int[] BT, int d_x, int N, int M) {
        int tmp = 0;
        int x = d_x;
        int BX1 = x + N + 1;

        while (BX1 <= M) {
            BT[BX1 - 1]++;
            LOWEST_BIT_VAL(x, BNY, tmp);
            BX1 += tmp;
        }
    }

    private static int BIT_QUERY(int[] BT, int d_x, int N, int M) {
        int d_ret = 0;
        int tmp = 0;
        int x = d_x;
        int BX1 = x + N + 1;

        while (BX1 > 0) {
            d_ret += BT[BX1 - 1];
            LOWEST_BIT_VAL(x, BNY, tmp);
            BX1 -= tmp;
            tmp *= -1;
        }
        return d_ret;
    }

    private static void LOWEST_BIT_VAL(int d_x, int BNY, int tmp) {
        tmp = -1;
        int r = 0;
        int x = d_x;

        while (r != 1) {
            x /= BNY;
            r = x % BNY;
            tmp++;
        }
    }

    private static void UNANS() {
        String[] parts = ZS.split("\\s+");
        if (parts.length > 1) {
            DUMMY = parts[0].charAt(0);
            ans = parts[1];
        }
    }
}
```