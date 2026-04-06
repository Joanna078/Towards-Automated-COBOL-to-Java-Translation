import java.util.Scanner;

public class CombinationCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();

        if (K > N || K < 0) {
            System.out.println("Invalid input");
        } else {
            long result = calculateCombinations(N, K);
            System.out.println(result);
        }
    }

    private static long calculateCombinations(int N, int K) {
        if (K == 0 || K == N) {
            return 1;
        }
        K = Math.min(K, N - K); // Take advantage of symmetry
        long result = 1;
        for (int i = 0; i < K; ++i) {
            result *= (N - i);
            result /= (i + 1);
        }
        return result;
    }
}