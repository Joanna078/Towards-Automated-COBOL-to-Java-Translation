```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values for A, B, N separated by spaces: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        if (parts.length != 3) {
            System.out.println("Invalid input. Please enter three values.");
            return;
        }

        try {
            int A = Integer.parseInt(parts[0]);
            long B = Long.parseLong(parts[1]);
            long N = Long.parseLong(parts[2]);

            long X = (N >= B) ? B - 1 : N;
            long FA = (A * X) / B;
            long FB = A * (X / B);
            long OUT = FA - FB;

            System.out.printf("%017d%n", OUT);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid integers.");
        }
    }
}
```