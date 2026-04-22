import java.util.Scanner;

public class Kyopuro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by spaces: ");
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter exactly two numbers.");
            return;
        }

        try {
            long n = Long.parseLong(parts[0].trim());
            long m = Long.parseLong(parts[1].trim());
            long result = calculateResult(n, m);
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid numbers.");
        }
    }

    private static long calculateResult(long n, long m) {
        if (n == 1 && m == 1) {
            return 1;
        } else if (n == 1 || m == 1) {
            return Math.max(n, m) - 2;
        } else {
            return (n - 2) * (m - 2);
        }
    }
}