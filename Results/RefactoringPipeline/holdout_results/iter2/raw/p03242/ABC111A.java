```java
import java.util.Scanner;

public class ABC111A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        String input = scanner.nextLine();
        scanner.close();

        // Ensure the input is exactly three characters long
        if (input.length() != 3) {
            System.out.println("Input must be exactly three digits.");
            return;
        }

        // Convert "19" to "91"
        String result = input.replace("19", "91");

        // Convert the string back to an integer for display
        int convertedNumber = Integer.parseInt(result);

        System.out.println("Converted number: " + convertedNumber);
    }
}
```