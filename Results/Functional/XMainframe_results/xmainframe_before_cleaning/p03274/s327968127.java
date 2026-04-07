Here's a possible translation into Java code that meets your requirements of preserving the original logic and using modern Java 17 features with brief comments where needed:

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
        long[][] x = new long[n][2];
        Arrays.fill(x, (long) 1e15);
        for (int i = 0; i < n; i++) {
            if (i < k || n - i <= k) {
                x[i][0] = Long.parseLong(String.valueOf(inp[i]));
                x[i][1] = i + 1;
            }
        }
        long inf = 150000000L;
        long sm = inf;
        for (int i = 0; i < n; i++) {
            if (x[i][0] <= 0) {
                sm = Math.min(sm, x[i + k - 1][0]);
            } else if (x[i + k - 1][0] <= 0) {
                sm = Math.min(sm, x[i][0] * 2 + x[i + k - 1][0]);
            } else {
                sm = Math.min(sm, x[i][0] + x[i + k][0] * 2);
            }
        }
        System.out.println(sm == inf ? -1 : sm);
    }
}