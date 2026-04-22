```java
import java.math.BigInteger;
import java.util.Scanner;

public class ABC_097_B {

    private boolean initialized = false;
    private BigInteger a;
    private BigInteger b;
    private BigInteger p;
    private BigInteger tmp;
    private BigInteger ans;

    public static void main(String[] args) {
        new ABC_097_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = scanner.nextBigInteger();

        ans = BigInteger.ZERO;
        for (b = BigInteger.ONE; b.compareTo(a) <= 0; b = b.add(BigInteger.ONE)) {
            for (p = BigInteger.ONE; p.compareTo(a) <= 0; p = p.add(BigInteger.ONE)) {
                tmp = b.pow(p.intValue());
                if (tmp.compareTo(a) < 0) {
                    break;
                }
                ans = ans.max(tmp);
            }
        }

        System.out.println("Result: " + ans);
    }
}
```