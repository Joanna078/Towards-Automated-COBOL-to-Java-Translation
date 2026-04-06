import java.util.Scanner;

public class ABC043A {
    public static void main(String[] args) {
        // Initialize scanner to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int n;
        int ans;
        String anss;

        // Read input from the user
        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        // Calculate the sum of the first n natural numbers
        ans = n * (n + 1) / 2;

        // Convert the result to a string with leading zeros if necessary
        anss = String.format("%04d", ans);

        // Display the result
        System.out.println(anss);

        // Close the scanner
        scanner.close();
    }
}