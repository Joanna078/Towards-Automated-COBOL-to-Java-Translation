```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String[] arr = line.split(" ");
        int[] a = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray();

        int[] sa = new int[n];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (i + a[i] < n) {
                sa[i + a[i]]++;
            }
        }

        for (int i = 1; i < n; i++) {
            sa[i] += sa[i - 1];
        }

        for (int i = 0; i < n - 1; i++) {
            if (i + a[i] < n) {
                cnt += sa[i + a[i]];
            }
        }

        System.out.println(cnt);
    }
}
```