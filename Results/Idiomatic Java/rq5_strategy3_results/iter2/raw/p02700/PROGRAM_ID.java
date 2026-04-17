```java
import java.util.Scanner;

public class ProgramID {

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
            long A = Long.parseLong(parts[0]);
            long B = Long.parseLong(parts[1]);
            long C = Long.parseLong(parts[2]);
            long D = Long.parseLong(parts[3]);

            long TK = (C + B - 1) / B;
            long AO = (A + D - 1) / D;

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