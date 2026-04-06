import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize scanner for input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int n;
        int ans;
        String anss;

        // Accept input
        System.out.print("Enter a number: ");
        n = scanner.nextInt();

        // Compute the cube of the number
        ans = n * n * n;

        // Format the output with leading zeros if necessary
        anss = String.format("%03d", ans);

        // Display the result
        System.out.println(anss);
    }
}