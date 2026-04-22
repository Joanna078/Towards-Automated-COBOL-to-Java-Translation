```java
import java.util.Scanner;

public class ABC_074_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input values
        System.out.print("Enter N: ");
        int N = scanner.nextInt();
        System.out.print("Enter A: ");
        int A = scanner.nextInt();

        // Compute N = N^2 - A
        N = N * N - A;

        // Convert result to string and remove leading spaces
        String ZS = String.format("%06d", N);
        String ans = ZS.trim();

        // Display the result
        System.out.println(ans);

        scanner.close();
    }
}
```