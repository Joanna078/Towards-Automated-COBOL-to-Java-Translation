```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String line = br.readLine().trim();
        br.close();

        int p1 = 1;
        int p2 = 0;
        int[] a = new int[n]; // Adjusted size to match COBOL array size
        long[] sa = new long[n]; // Adjusted size to match COBOL array size

        for (int i = 1; i <= n; i++) {
            p2 = line.indexOf(' ', p1);
            if (p2 == -1) {
                p2 = line.length();
            }
            a[i - 1] = Integer.parseInt(line.substring(p1 - 1, p2).trim());
            sa[i - 1] = a[i - 1] - i;
            p1 = p2 + 1;
        }

        Arrays.sort(sa);
        int mid = n / 2;
        long w = (n % 2 == 1) ? sa[mid] : (sa[mid - 1] + sa[mid]) / 2;

        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] - (w + i + 1);
        }

        System.out.println(sum);
    }
}
```