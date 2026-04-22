```java
import java.util.Scanner;

public class TestA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Working storage variables
        int n;
        int k;
        int x;
        int y;
        long ans;
        String ansStr;

        // Accept input values
        n = scanner.nextInt();
        k = scanner.nextInt();
        x = scanner.nextInt();
        y = scanner.nextInt();

        // Compute the answer based on the condition
        if (k < n) {
            ans = (long) k * x + (n - k) * y;
        } else {
            ans = (long) n * x;
        }

        // Convert the result to string with leading zeros
        ansStr = String.format("%09d", ans);

        // Display the result
        System.out.println(ansStr);
    }
}
```