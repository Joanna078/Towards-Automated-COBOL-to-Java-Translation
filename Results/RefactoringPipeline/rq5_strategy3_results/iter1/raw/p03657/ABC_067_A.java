```java
import java.util.Scanner;

public class ABC_067_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        if (parts.length != 2) {
            System.out.println("Invalid input");
            return;
        }

        try {
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);

            int MODA = A % 3;
            int MODB = B % 3;
            int sum = A + B;
            int MODAB = sum % 3;

            if (MODA == 0 || MODB == 0 || MODAB == 0) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
        }
    }
}
```