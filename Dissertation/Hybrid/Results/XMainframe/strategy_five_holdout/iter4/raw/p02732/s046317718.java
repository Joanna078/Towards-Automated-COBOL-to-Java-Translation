```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String[] inputArray = line.split(" ");
        int[] a = new int[200000];
        int[] c = new int[200000];
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        int j = 0;
        int x = 0;
        long cnt = 0;
        String out = "";

        for (i = 0; i < n; i++) {
            c[i] = 0;
        }

        p1 = 0;
        for (i = 0; i < n; i++) {
            p2 = p1;
            while (p2 < inputArray.length && !inputArray[p2].isEmpty()) {
                p2++;
            }
            if (p2 > p1) {
                a[i] = Integer.parseInt(inputArray[p1]);
                if (a[i] >= 0 && a[i] < 200000) { // Ensure index is within bounds
                    c[a[i]]++;
                }
            }
            p1 = p2 + 1;
        }

        for (i = 0; i < n; i++) {
            cnt = 0;
            for (j = 0; j < n; j++) { // Change from 200000 to n
                if (c[j] > 1) {
                    if (a[i] == j) {
                        x = c[j] - 1;
                    } else {
                        x = c[j];
                    }
                    if (x > 1) {
                        cnt += (long) x * (x - 1) / 2;
                    }
                }
            }
            out = String.format("%010d", cnt);
            System.out.println(out.trim());
        }
    }
}
```