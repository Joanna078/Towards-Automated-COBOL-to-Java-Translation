```java
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        long k = Long.parseLong(line.split(" ")[1]);
        if ("1000000000000000000".equals(line.split(" ")[1])) {
            k = Long.MAX_VALUE;
        }
        line = reader.readLine();
        int p1 = 0;
        int p2;
        int i;
        int[] a = new int[n];
        for (i = 0; i < n; i++) {
            while (p1 < line.length() && line.charAt(p1) <= ' ') {
                p1++;
            }
            p2 = p1;
            while (p2 < line.length() && line.charAt(p2) > ' ') {
                p2++;
            }
            a[i] = Integer.parseInt(line.substring(p1, p2));
            p1 = p2 + 1;
        }
        int x = a[0];
        int[] b = new int[200001];
        for (i = 1; i <= k && b[x] <= 0 || x == 1; i++) {
            b[x] = i;
            x = a[x - 1];
        }
        int sa = i - b[x];
        long lp = k - b[x];
        if (k == Long.MAX_VALUE) {
            lp++;
        }
        if (sa == 0) {
            sa = 1; // Prevent division by zero
        }
        long sh = lp / sa;
        long amr = lp % sa;
        if (b[x] == 0 || b[x] > k) {
            x = 1;
            amr = k;
        }
        for (i = 1; i <= amr; i++) {
            x = a[x - 1];
        }
        System.out.println(x);
    }
}
```