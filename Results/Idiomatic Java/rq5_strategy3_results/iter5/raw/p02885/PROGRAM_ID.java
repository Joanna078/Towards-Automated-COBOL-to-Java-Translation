```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");

        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter two numbers.");
            return;
        }

        try {
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);

            if (2 * B < A) {
                int ans = A - 2 * B;
                System.out.printf("%d%n", ans);
            } else {
                System.out.println(0);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers.");
        }
    }
}
```