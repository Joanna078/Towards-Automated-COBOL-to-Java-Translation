import java.math.BigInteger;
import java.util.Scanner;

public class ABC_079_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        BigInteger lucasNumber = calculateLucasNumber(n);
        System.out.println(lucasNumber);
    }

    private static BigInteger calculateLucasNumber(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        }

        BigInteger ppr = BigInteger.valueOf(2);
        BigInteger pr = BigInteger.ONE;

        for (int i = 2; i <= n; i++) {
            BigInteger lucas = ppr.add(pr);
            ppr = pr;
            pr = lucas;
        }

        return pr;
    }
}