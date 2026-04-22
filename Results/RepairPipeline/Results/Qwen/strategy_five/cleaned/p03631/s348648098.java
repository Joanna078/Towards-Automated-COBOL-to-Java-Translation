import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare a variable to store the input string
        String r;

        // Read the input string without prompting
        r = scanner.nextLine();

        // Check if the first character is equal to the third character
        if (r.charAt(0) == r.charAt(2)) {
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