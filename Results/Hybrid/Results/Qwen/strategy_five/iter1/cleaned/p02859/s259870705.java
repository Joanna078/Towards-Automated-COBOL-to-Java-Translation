import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize scanner for input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        String inp;
        int r;
        int ans;

        // Accept input from user
        System.out.print("Enter a value: ");
        inp = scanner.nextLine();

        // Convert input to integer
        r = Integer.parseInt(inp);

        // Compute the square of the input
        ans = r * r;

        // Display the result without leading zeros
        System.out.printf("%06d%n", ans);

        // Close the scanner
        scanner.close();
    }
}