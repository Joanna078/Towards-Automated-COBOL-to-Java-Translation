import java.math.BigInteger;
import java.util.Scanner;

public class ABC_097_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigInteger A = scanner.nextBigInteger();

        BigInteger ans = BigInteger.ONE;

        for (int b = 2; A.compareTo(BigInteger.valueOf(b)) >= 0; b++) {
            for (int p = 2; A.compareTo(BigInteger.valueOf(p)) >= 0; p++) {
                BigInteger tmp = BigInteger.valueOf(b).pow(p);
                if (A.compareTo(tmp) < 0) {
                    break;
                }
                ans = ans.max(tmp);
            }
        }

        System.out.println("Result: " + ans);
    }
}