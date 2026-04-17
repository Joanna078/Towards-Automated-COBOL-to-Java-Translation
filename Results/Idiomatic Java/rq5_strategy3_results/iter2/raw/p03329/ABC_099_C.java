```java
import java.util.Scanner;

public class ABC_099_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        int result = findMinimumSum(n);
        System.out.println(result);
    }

    private static int findMinimumSum(int n) {
        int res = n;

        for (int i = 1; i <= n; i++) {
            int t = i;
            int sumr = 0;

            while (t > 0) {
                sumr += t % 6;
                t /= 6;
            }

            t = n - i;

            while (t > 0) {
                sumr += t % 9;
                t /= 9;
            }

            res = Math.min(res, sumr);
        }

        return res;
    }
}
```