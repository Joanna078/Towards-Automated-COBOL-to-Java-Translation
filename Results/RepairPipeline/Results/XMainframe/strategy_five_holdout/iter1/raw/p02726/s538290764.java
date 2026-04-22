```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] parts = line.split(" ");
        int n = Integer.parseInt(parts[0]);
        int x = Integer.parseInt(parts[1]);
        int y = Integer.parseInt(parts[2]);
        int sa = y - x;
        int out = 0;
        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            if (i == 1) {
                cnt = n;
            } else if (i == n - 1) {
                cnt = 0;
            } else {
                cnt = n - i;
            }
            int j = x - i + 1;
            int k = x + i - 1;
            if (j < 1) {
                j = 1;
            }
            if (k >= y) {
                k = y - 1;
            }
            for (int l = j; l <= k; l++) {
                int m = l + i;
                if (m == x) {
                    cnt++;
                } else if (Math.abs(l - i) == Math.abs(m - x)) {
                    cnt++;
                }
            }
            out += cnt;
        }
        System.out.println(out);
    }
}
```