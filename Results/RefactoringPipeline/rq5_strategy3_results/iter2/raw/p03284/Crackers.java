```java
import java.util.Scanner;

public class Crackers {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter two numbers separated by space: ");
            String input = scanner.nextLine();

            String[] parts = input.split("\\s+");
            int inN = Integer.parseInt(parts[0]);
            int inK = Integer.parseInt(parts[1]);

            int amari = inN % inK;

            System.out.println(amari == 0 ? "0" : "1");
        }
    }
}
```