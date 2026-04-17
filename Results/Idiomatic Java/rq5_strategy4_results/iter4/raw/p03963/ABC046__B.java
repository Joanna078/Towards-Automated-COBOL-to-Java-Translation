```java
import java.util.Scanner;

public class ABC046_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values for N and K separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        if (parts.length != 2) {
            System.err.println("Please provide exactly two values.");
            return;
        }

        try {
            int N = Integer.parseInt(parts[0]);
            int K = Integer.parseInt(parts[1]);

            long ans = calculate(N, K);
            System.out.printf("%09d%n", ans);
        } catch (NumberFormatException e) {
            System.err.println("Invalid input. Please enter numeric values.");
        }
    }

    private static long calculate(int N, int K) {
        if (N <= 0 || K <= 0) {
            throw new IllegalArgumentException("N and K must be positive integers.");
        }
        return (long) K * (long) Math.pow(K - 1, N - 1);
    }
}
```