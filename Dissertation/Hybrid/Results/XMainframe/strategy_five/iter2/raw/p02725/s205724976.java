```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        String[] parts = line.split(" ");
        int k = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);
        line = reader.readLine();
        int[] a = new int[n];
        String[] inputParts = line.split(" ");
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(inputParts[i]);
        }
        int z = 0;
        int gk = 0;
        int[] sa = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            sa[i] = a[i - 1] - z;
            z = a[i - 1];
            gk += a[i - 1];
        }
        sa[n + 1] = k - a[n - 1];
        Arrays.sort(sa);
        int out = k - sa[1]; // Corrected index to access the largest element
        System.out.println(out);
    }
}
```