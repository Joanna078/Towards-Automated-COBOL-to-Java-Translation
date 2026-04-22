```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        if (parts.length != 4) {
            System.out.println("Invalid input. Please enter exactly four numbers.");
            return;
        }

        try {
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            int C = Integer.parseInt(parts[2]);
            int D = Integer.parseInt(parts[3]);

            int TK = (C + B - 1) / B;
            int AO = (A + D - 1) / D;

            if (TK <= AO) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        }
    }
}
```