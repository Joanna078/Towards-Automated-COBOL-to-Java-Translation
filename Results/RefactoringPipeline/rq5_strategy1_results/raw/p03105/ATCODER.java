```java
import java.util.Scanner;

public class ATCODER {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        if (parts.length != 3) {
            System.out.println("Invalid input");
            return;
        }

        long a1 = Long.parseLong(parts[0]);
        long a2 = Long.parseLong(parts[1]);
        long a3 = Long.parseLong(parts[2]);

        if (a2 == 0) {
            System.out.println("Division by zero");
            return;
        }

        long result = a2 / a1;

        if (result >= a3) {
            System.out.println(a3);
        } else {
            System.out.println(result);
        }
    }
}
```