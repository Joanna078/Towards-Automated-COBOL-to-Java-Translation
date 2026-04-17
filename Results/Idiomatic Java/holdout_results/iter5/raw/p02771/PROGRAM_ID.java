```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Invalid input. Please enter exactly three numbers.");
            return;
        }

        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);

        boolean flag = (A == B && B != C) || (B == C && C != A) || (C == A && A != B);

        System.out.println(flag ? "Yes" : "No");
    }
}
```