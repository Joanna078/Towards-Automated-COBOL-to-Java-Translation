```java
import java.util.Scanner;

public class Birthday {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter two numbers separated by space:");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        
        if (parts.length != 2) {
            System.out.println(":(");
            return;
        }

        try {
            int num1 = Integer.parseInt(parts[0].trim());
            int num2 = Integer.parseInt(parts[1].trim());

            if (num1 <= 8 && num2 <= 8) {
                System.out.println("Yay!");
            } else {
                System.out.println(":(");
            }
        } catch (NumberFormatException e) {
            System.out.println(":(");
        }
    }
}
```