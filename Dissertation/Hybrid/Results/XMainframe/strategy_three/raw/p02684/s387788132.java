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
        int bx = 0;
        for (i = 1; i <= k && bx <= 0 || x == 1; i++) {
            bx = bx + ((i - bx) == x ? -1 : 1);
            x = a[x - 1];
        }
        int sa = i - bx - 1;
        long lp = k - bx;
        if (k == Long.MAX_VALUE) {
            lp++;
        }
        long sh = lp / sa;
        long amr = lp % sa;
        if (bx == 0 || bx > k) {
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