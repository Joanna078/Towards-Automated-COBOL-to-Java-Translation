```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input handling
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        // Parsing input
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);

        // Calculation
        int out = (n - 1) / (k - 1) + 1;

        // Output
        System.out.printf("%d%n", out);
    }
}
```