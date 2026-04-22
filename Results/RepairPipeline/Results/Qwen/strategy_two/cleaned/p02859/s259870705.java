import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize scanner for input
        Scanner scanner = new Scanner(System.in);

        // Accept input from user
        System.out.print("Enter a value: ");
        int r = Integer.parseInt(scanner.nextLine());

        // Compute the square of the input
        int ans = r * r;

        // Display the result without leading zeros
        System.out.println(ans);

        // Close the scanner
        scanner.close();
    }
}