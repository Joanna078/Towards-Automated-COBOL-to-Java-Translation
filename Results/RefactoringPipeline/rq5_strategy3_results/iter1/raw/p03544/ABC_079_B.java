```java
import java.math.BigInteger;
import java.util.Scanner;

public class ABC_079_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        BigInteger lucasNumber = calculateLucasNumber(n);
        String result = lucasNumber.toString();

        // Remove leading spaces
        result = result.replaceAll("^\\s+", "");

        System.out.println(result);
    }

    private static BigInteger calculateLucasNumber(int n) {
        if (n == 1) {
            return BigInteger.ONE;
        }

        BigInteger ppr = BigInteger.valueOf(2);
        BigInteger pr = BigInteger.ONE;
        BigInteger lucas = BigInteger.ZERO;

        for (int i = 2; i <= n; i++) {
            lucas = ppr.add(pr);
            ppr = pr;
            pr = lucas;
        }

        return lucas;
    }
}
```