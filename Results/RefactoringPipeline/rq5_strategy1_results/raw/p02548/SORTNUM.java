```java
import java.math.BigInteger;
import java.util.Scanner;

public class SortNum {

    private boolean initialized = false;
    private BigInteger a = BigInteger.ZERO;
    private BigInteger b = BigInteger.ZERO;
    private BigInteger c = BigInteger.ZERO;
    private BigInteger n = BigInteger.ZERO;
    private BigInteger res = BigInteger.ZERO;
    private BigInteger cnt = BigInteger.ZERO;
    private BigInteger out = BigInteger.ZERO;

    public static void main(String[] args) {
        SortNum sortNum = new SortNum();
        sortNum.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextBigInteger();

        for (a = BigInteger.ONE; a.compareTo(n) <= 0; a = a.add(BigInteger.ONE)) {
            for (b = BigInteger.ONE; b.compareTo(n) <= 0; b = b.add(BigInteger.ONE)) {
                for (c = BigInteger.ONE; c.compareTo(n) <= 0; c = c.add(BigInteger.ONE)) {
                    res = a.multiply(b).add(c);
                    if (res.compareTo(n) > 0) {
                        break;
                    }
                    if (res.equals(n)) {
                        cnt = cnt.add(BigInteger.ONE);
                        break;
                    }
                }
            }
        }

        out = cnt;
        System.out.println("Result: " + out);
    }
}
```