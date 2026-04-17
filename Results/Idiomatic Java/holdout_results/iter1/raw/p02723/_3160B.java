```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string of length 6: ");
        String input = scanner.nextLine().trim();

        if (input.length() != 6) {
            System.out.println("Invalid input. Please enter a string of exactly 6 characters.");
            return;
        }

        if (input.charAt(2) == input.charAt(3) && input.charAt(4) == input.charAt(5)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```