import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for N and D
        String[] input = scanner.nextLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int D = Integer.parseInt(input[1]);

        int count = 0;

        // Read N lines of input
        for (int i = 0; i < N; i++) {
            input = scanner.nextLine().split(" ");
            int X = Integer.parseInt(input[0]);
            int Y = Integer.parseInt(input[1]);

            // Calculate distance
            double distance = Math.sqrt(X * X + Y * Y);

            // Check if distance is within D
            if (distance <= D) {
                count++;
            }
        }

        // Output the count
        System.out.printf("%05d%n", count);
    }
}