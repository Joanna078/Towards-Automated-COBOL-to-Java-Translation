```java
import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        // Input variable
        int A;

        // Read input from user
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        scanner.close();

        // Compute A = 3 * A * A
        A = 3 * A * A;

        // Output the result
        System.out.println(A);
    }
}
```