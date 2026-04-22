```java
import java.util.Arrays;
import java.util.Scanner;

public class ABC_102_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        scanner.close();

        int[] a = new int[n];
        int cur = 0;
        int i = 0;
        long tmp = 0;

        while (cur < inp.length()) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            long x = Long.parseLong(inp.substring(cur, j));
            tmp += x;
            a[i++] = (int) tmp;
            cur = j + 1;
        }

        int li = 1;
        int ri = 1;
        long sm = Long.MAX_VALUE;

        for (i = 2; i <= n; i++) {
            int st = 1;
            int ed = i;
            int bk = li;

            int ret = f(a, st, ed, bk);

            li = ret;

            if (ri < i + 1) {
                ri = i + 1;
            }

            st = i + 1;
            ed = n;
            bk = ri;

            ret = f(a, st, ed, bk);

            ri = ret;

            long p = a[li - 1];
            long q = a[i] - p;
            long r = a[ri - 1] - a[i];
            long s = a[n - 1] - a[ri - 1];

            long mx = Math.max(p, Math.max(q, Math.max(r, s)));
            long mn = Math.min(p, Math.min(q, Math.min(r, s)));

            if (mx - mn < sm) {
                sm = mx - mn;
            }
        }

        System.out.println(sm);
    }

    private static int f(int[] a, int st, int ed, int bk) {
        long tmp = Long.MAX_VALUE;
        int ret = 1;
        int flg = 0;

        for (int j = bk; j < ed; j++) {
            long lv = a[j];

            if (st != 1) {
                int ms = st - 1;
                lv -= a[ms];
            }

            long rv = a[ed] - a[j];

            long tmp2 = Math.abs(rv - lv);

            if (tmp2 < tmp) {
                tmp = tmp2;
                ret = j + 1; // Adjusted to match 1-based index
                flg = 1;
            } else if (flg == 1) {
                break;
            }
        }

        return ret;
    }
}
```