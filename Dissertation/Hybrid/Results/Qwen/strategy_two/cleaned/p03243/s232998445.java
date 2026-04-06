import java.util.Scanner;

public class ABC111B {
    public static void main(String[] args) {
        // Input: Accept user input for variable N
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Compute N = (N + 110) / 111
        n = (n + 110) / 111;

        // Compute N = N * 111
        n = n * 111;

        // Output: Display the value of N
        System.out.println("Result: " + n);

        scanner.close();
    }
}