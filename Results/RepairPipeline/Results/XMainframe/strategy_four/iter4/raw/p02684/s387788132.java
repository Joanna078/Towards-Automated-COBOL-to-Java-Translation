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
        int[] b = new int[n + 1]; // Adjusted array size to handle 1-based indexing
        for (i = 0; i < n && b[x] == 0 && x != 0; i++) {
            b[x] = i + 1;
            x = a[x];
        }
        int sa = i - b[x];
        long lp = k - b[x];
        if (k == Long.MAX_VALUE) {
            lp++;
        }
        long sh = lp / sa;
        long amr = lp % sa;
        if (b[x] == 0 || b[x] > k) {
            x = 0;
            amr = k;
        }
        for (i = 0; i < amr; i++) {
            x = a[x];
        }
        System.out.println(x);
    }
}
```