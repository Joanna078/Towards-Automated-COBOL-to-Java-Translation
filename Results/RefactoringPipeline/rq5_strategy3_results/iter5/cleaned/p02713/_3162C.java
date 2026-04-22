import java.util.Scanner;

public class GCDCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for K: ");
        int k = scanner.nextInt();
        scanner.close();

        int[][] gcdTable = new int[k + 1][k + 1];
        long sum = 0;

        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                int gcd = gcd(a, b);
                gcdTable[a][b] = gcd;
                sum += gcd;
            }
        }

        System.out.println("Sum of all GCDs: " + sum);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}