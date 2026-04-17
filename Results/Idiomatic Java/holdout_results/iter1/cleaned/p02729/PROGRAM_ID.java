import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        String[] parts = input.split("\\s+");
        long N = Long.parseLong(parts[0]);
        long M = Long.parseLong(parts[1]);
        
        long ans = computeSumOfSquares(N, M);
        System.out.printf("%09d%n", ans);
    }

    private static long computeSumOfSquares(long N, long M) {
        return (N * (N - 1) / 2) + (M * (M - 1) / 2);
    }
}