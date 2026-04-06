```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize scanner for input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int n;
        int ans;

        // Accept input
        n = scanner.nextInt();

        // Compute the cube of the number
        ans = n * n * n;

        // Display the result without leading zeros
        System.out.printf("%03d%n", ans);
    }
}
```