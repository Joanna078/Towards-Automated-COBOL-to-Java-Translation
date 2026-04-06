import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to store the input string
        String r;

        // Prompt the user to enter a value
        System.out.println("Enter a value:");
        r = scanner.nextLine();

        // Check if the first character is equal to the third character
        if (r.length() > 2 && r.charAt(0) == r.charAt(2)) {
            // Display "Yes" if they are equal
            System.out.println("Yes");
        } else {
            // Display "No" if they are not equal
            System.out.println("No");
        }

        // Close the scanner object
        scanner.close();
    }
}