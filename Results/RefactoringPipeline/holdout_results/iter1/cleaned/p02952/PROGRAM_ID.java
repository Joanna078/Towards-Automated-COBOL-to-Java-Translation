import java.math.BigInteger;
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigInteger n = scanner.nextBigInteger();
        scanner.close();

        BigInteger ans = BigInteger.ZERO;

        for (BigInteger i = BigInteger.ONE; i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            BigInteger num = BigInteger.valueOf(i.toString().length());
            num = num.add(BigInteger.ONE);
            BigInteger qt = num.divide(BigInteger.TWO);
            BigInteger rm = num.remainder(BigInteger.TWO);

            if (rm.equals(BigInteger.ONE)) {
                ans = ans.add(BigInteger.ONE);
            }
        }

        System.out.println(ans.toString().trim());
    }
}