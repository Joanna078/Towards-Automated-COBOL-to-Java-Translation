```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-character string: ");
        String input = scanner.nextLine();

        if (input.length() != 3) {
            System.out.println("Invalid input. Please enter exactly three characters.");
            return;
        }

        char firstChar = input.charAt(0);
        char thirdChar = input.charAt(2);

        if (firstChar == thirdChar) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```