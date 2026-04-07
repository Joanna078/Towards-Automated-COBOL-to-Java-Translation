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
        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        // Compute the cube of the number
        ans = n * n * n;

        // Display the result
        System.out.println(ans);
    }
}
```