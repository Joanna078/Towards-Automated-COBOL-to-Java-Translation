<|assistant|>
```java
import java.io.*;
import java.util.*;

public class Main {
    static final int INF = 999999999999999;
    static String INP;
    static int N;
    static int[] A;
    static int cur = 1;
    static int len;
    static int i = 1;
    static int j;
    static int ret;
    static int li;
    static int ri;
    static long lv;
    static long rv;
    static int st;
    static int ed;
    static int bk;
    static long sm = INF;
    static String ans;
    static int x;
    static long tmp = 0;
    static long tmp2 = 0;
    static long mx = 0;
    static long mn = 0;
    static int flg;
    static int P;
    static int Q;
    static int R;
    static int S;
    static StringBuilder ZS = new StringBuilder();

    public static void main(String[] args) throws IOException {
        FastScanner sc = new FastScanner();
        N = sc.nextInt();
        INP = sc.next();
        A = new int[N + 1];
        for (int idx = 0; idx < N; ++idx) {
            char ch = INP.charAt(idx);
            if (ch == ' ') continue;
            while (idx < N && INP.charAt(idx) != ' ') {
                x = Character.digit(INP.charAt(idx), 10);
                tmp += x;
                idx++;
            }
            A[i] = (int) tmp;
            tmp = 0;
            i++;
        }
        li = 1;
        ri = 1;
        for (int idx = 2; idx < N; idx++) {
            st = 1;
            ed = idx;
            bk = li;
            f();
            li = ret;
            if (ri < idx + 1) ri = idx + 1;
            st = idx + 1;
            ed = N;
            bk = ri;
            f();
            ri = ret;
            int ax1 = li;
            P = A[ax1];
            int ax2 = idx;
            Q = A[ax1] - A[ax2];
            ax1 = ri;
            R = A[ax1] - A[ax2];
            ax2 = N;
            S = A[ax2] - A[ax1];
            mx = Math.max(P, Math.max(Q, Math.max(R, S)));
            mn = Math.min(P, Math.min(Q, Math.min(R, S)));
            if (mx - mn < sm) sm = mx - mn;
        }
        System.out.println(sm);
    }

    static void f() {
        ret = 1;
        tmp = Integer.MAX_VALUE;
        for (int j = bk; j <= ed; j++) {
            long ax1 = j;
            long lv = A[(int) ax1];
            if (st != 1) {
                long ax2 = st - 1;
                lv = A[(int) ax1] - A[(int) ax2];
            }
            long ax2 = ed;
            long rv = A[(int) ax2] - A[(int) ax1];
            if (lv < rv) {
                long tmp2 = rv - lv;
                if (tmp2 < tmp) {
                    tmp = tmp2;
                    ret = j;
                    flg = 1;
                } else if (flg == 1) break;
            } else {
                long tmp2 = lv - rv;
                if (tmp2 < tmp) {
                    tmp = tmp2;
                    ret = j;
                    flg = 1;
                } else if (flg == 1) break;
            }
        }
    }
}

// FastScanner class taken from https://github.com/e81206/LibraryChecker/blob/master/src/main/java/com/e81206/solution/Main.java
class FastScanner {
    private final InputStream in = System