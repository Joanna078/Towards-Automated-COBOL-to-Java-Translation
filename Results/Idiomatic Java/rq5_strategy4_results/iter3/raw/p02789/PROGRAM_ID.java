```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String ln = scanner.nextLine();

        String[] parts = ln.trim().split("\\s+");
        if (parts.length != 2) {
            System.out.println("Invalid input");
            return;
        }

        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        if (n == m) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```