import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to store the input string
        String s;

        // Prompt the user to enter a value
        System.out.print("Enter a value: ");
        s = scanner.nextLine();

        // Check if the input is "ABC"
        if ("ABC".equals(s)) {
            // Display "ARC" if the input is "ABC"
            System.out.println("ARC");
        } else {
            // Display the input value otherwise
            System.out.println(s);
        }

        // Close the scanner object
        scanner.close();
    }
}