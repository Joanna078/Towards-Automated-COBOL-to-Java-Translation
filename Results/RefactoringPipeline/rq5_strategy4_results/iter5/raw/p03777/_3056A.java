```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two characters separated by space: ");
        String input = scanner.nextLine().trim();

        if (input.length() != 2) {
            System.out.println("Invalid input. Please enter exactly two characters.");
            return;
        }

        char a = input.charAt(0);
        char b = input.charAt(1);

        if (a == 'H' && b == 'H') {
            System.out.println("H");
        } else if (a == 'H' || b == 'H') {
            System.out.println("D");
        } else {
            System.out.println("H");
        }
    }
}
```