import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize scanner for input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int r;
        double out;

        // Accept input
        System.out.print("Enter a value for R: ");
        r = scanner.nextInt();

        // Compute output
        out = r * 2 * Math.PI;

        // Display output
        System.out.printf("%d%n", (int) out);

        // Close scanner
        scanner.close();
    }
}