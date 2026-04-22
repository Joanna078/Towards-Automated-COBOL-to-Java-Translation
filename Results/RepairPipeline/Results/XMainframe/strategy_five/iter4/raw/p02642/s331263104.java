```java
import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String line = reader.readLine();
        String[] arr = line.split(" ");
        int[] a = new int[n];
        int[] b = new int[1000001];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(arr[i]);
            idx++;
            b[a[i]]++;
        }
        int cnt = 0;
        boolean[] isPrime = new boolean[1000001]; // Adjusted size to handle maximum possible value in a
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i < Math.sqrt(isPrime.length); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] == 1 || !isPrime[a[i]]) {
                continue;
            }
            boolean isSquareFree = true;
            for (int j = 2; j <= Math.sqrt(a[i]); j++) {
                while (a[i] % (j * j) == 0) {
                    a[i] /= (j * j);
                }
                if (a[i] % j == 0) {
                    isSquareFree = false;
                    break;
                }
            }
            if (a[i] > 1) {
                isSquareFree = false;
            }
            if (!isSquareFree) {
                continue;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}
```