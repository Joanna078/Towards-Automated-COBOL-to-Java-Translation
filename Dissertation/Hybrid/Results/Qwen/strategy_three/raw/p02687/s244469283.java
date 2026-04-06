```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to store the input string
        String s;

        // Prompt the user to enter a value
        s = scanner.nextLine();

        // Check if the input is "ABC"
        if ("ABC".equals(s)) {
            // Display "ARC" if the input is "ABC"
            System.out.println("ARC");
        } else {
            // Display "ABC" otherwise
            System.out.println("ABC");
        }

        // Close the scanner object
        scanner.close();
    }
}
```