import java.math.BigInteger;
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigInteger n = scanner.nextBigInteger();

        BigInteger c1 = calculate(n, 1);
        BigInteger c3 = calculate(n, 3);
        BigInteger c5 = calculate(n, 5);
        BigInteger c15 = calculate(n, 15);

        BigInteger accum = c1.subtract(c3).subtract(c5).add(c15);
        String result = String.format("%019d", accum);
        System.out.println(result.trim());
    }

    private static BigInteger calculate(BigInteger n, int divisor) {
        BigInteger qt = n.divide(BigInteger.valueOf(divisor));
        return (BigInteger.valueOf(divisor).add(qt.multiply(BigInteger.valueOf(divisor)))).multiply(qt).divide(BigInteger.valueOf(2));
    }
}