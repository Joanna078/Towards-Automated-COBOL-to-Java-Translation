```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line: ");
        String ln = scanner.nextLine();
        scanner.close();

        String[] parts = ln.split("\\s+");
        if (parts.length != 2) {
            System.out.println("Invalid input");
            return;
        }

        try {
            int S = Integer.parseInt(parts[0]);
            int W = Integer.parseInt(parts[1]);

            if (W < S) {
                System.out.println("unsafe");
            } else {
                System.out.println("safe");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}
```