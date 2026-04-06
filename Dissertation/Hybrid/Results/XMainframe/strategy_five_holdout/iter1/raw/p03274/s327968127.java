```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] inp2 = reader.readLine().split(" ");
        int n = Integer.parseInt(inp2[0]);
        int k = Integer.parseInt(inp2[1]);
        char[] inp = reader.readLine().toCharArray();
        long[] x = new long[n];
        Arrays.fill(x, (long) 1e15);
        int cur = 0;
        int len = 0;
        int i = 0;
        for (int j = 0; j < inp.length; j++) {
            if (inp[j] == ' ') {
                len = j - cur;
                x[i] = Long.parseLong(new String(inp, cur, len));
                cur = j + 1;
                i++;
            }
        }
        len = inp.length - cur;
        x[i] = Long.parseLong(new String(inp, cur, len));

        long inf = 150000000L;
        long sm = inf;
        int flg = 0;

        if (x[0] <= 0) {
            sm = x[k - 1];
            flg = 1;
        }

        if (x[n - 1] <= 0) {
            sm = x[n - k];
            flg = 1;
        }

        if (flg == 0) {
            for (i = 1; i <= n - k; i++) {
                long tmp = i + k - 1;
                if (n < tmp) {
                    break;
                }
                if (x[i - 1] <= 0) {
                    if (x[(int) tmp] <= 0) {
                        long t = Math.min(x[i - 1] * 2 + x[(int) tmp], x[i - 1] + x[(int) tmp] * 2);
                        sm = Math.min(sm, t);
                    } else {
                        tmp = i + k;
                        if (tmp <= n && x[(int) tmp - 1] > 0) {
                            sm = Math.min(sm, x[i - 1]);
                        }
                    }
                } else {
                    tmp = i - 1;
                    if (x[(int) tmp] < 0) {
                        sm = Math.min(sm, x[(int) tmp + k - 1]);
                    }
                }
            }
        }

        String zs = String.format("%015d", sm);
        String ans = zs.replaceFirst("^0+(?!$)", "");
        System.out.println(ans);
    }
}
```