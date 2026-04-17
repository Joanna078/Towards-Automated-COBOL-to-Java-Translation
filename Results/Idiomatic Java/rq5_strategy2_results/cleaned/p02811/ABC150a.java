import java.util.Scanner;

public class ABC150a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input values
        System.out.print("Enter value for K: ");
        int K = scanner.nextInt();

        System.out.print("Enter value for X: ");
        int X = scanner.nextInt();

        // Compute K = K * 500
        K *= 500;

        // Compare K and X and display result
        if (K >= X) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}