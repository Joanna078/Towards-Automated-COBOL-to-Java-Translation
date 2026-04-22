```java
import java.util.Scanner;

public class GCDCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for K: ");
        int k = scanner.nextInt();
        scanner.close();

        int[][] gcdTable = new int[k + 1][k + 1];
        long sumOfGCDs = 0;

        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                int gcd = gcd(a, b);
                gcdTable[a][b] = gcd;
                gcdTable[b][a] = gcd;
            }
        }

        for (int a = 1; a <= k; a++) {
            for (int b = 1; b <= k; b++) {
                int gcd = gcdTable[a][b];
                for (int c = 1; c <= k; c++) {
                    int gcdZ = gcd(gcd, c);
                    sumOfGCDs += gcdZ;
                }
            }
        }

        System.out.printf("%08d%n", sumOfGCDs);
    }

    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}
```