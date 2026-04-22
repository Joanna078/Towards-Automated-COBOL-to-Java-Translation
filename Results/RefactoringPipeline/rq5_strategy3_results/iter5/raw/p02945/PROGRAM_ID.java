```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter exactly two numbers.");
            return;
        }

        try {
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);

            int sum = A + B;
            int difference = A - B;
            int product = A * B;

            int max = Math.max(sum, Math.max(difference, product));
            System.out.printf("%010d%n", max);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
```