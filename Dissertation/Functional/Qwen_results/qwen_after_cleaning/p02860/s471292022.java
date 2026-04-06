import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input values
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();

        // Calculate half of n and remainder
        int h = n / 2;
        int a = n % 2;

        // Check if the first half is equal to the second half
        boolean result = a == 0 && s.substring(0, h).equals(s.substring(h));

        // Display the result
        System.out.println(result ? "Yes" : "No");

        scanner.close();
    }
}