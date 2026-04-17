import java.util.Scanner;

public class ABC046_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values for N and K separated by space: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter two numbers separated by space.");
            return;
        }

        try {
            int N = Integer.parseInt(parts[0].trim());
            int K = Integer.parseInt(parts[1].trim());

            long ans = calculate(N, K);
            System.out.printf("%09d%n", ans);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter valid integers.");
        }
    }

    private static long calculate(int N, int K) {
        if (N <= 0 || K <= 0) {
            throw new IllegalArgumentException("N and K must be positive integers.");
        }
        return (long) K * Math.pow(K - 1, N - 1);
    }
}