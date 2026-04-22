```java
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Abc169c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter two numbers.");
            return;
        }

        try {
            BigDecimal a = new BigDecimal(parts[0]);
            BigDecimal b = new BigDecimal(parts[1]);
            BigDecimal ans = a.multiply(b).setScale(0, RoundingMode.HALF_UP);
            System.out.println(ans);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}
```