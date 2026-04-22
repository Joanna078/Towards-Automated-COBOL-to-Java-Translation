```java
import java.math.BigInteger;
import java.util.Scanner;

public class ABC_079_B {

    private boolean initialized = false;
    private BigInteger n;
    private BigInteger i;
    private BigInteger ppr;
    private BigInteger pr;
    private BigInteger lucas;
    private String ans;
    private int returnCode;

    public static void main(String[] args) {
        ABC_079_B program = new ABC_079_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextBigInteger();
        scanner.close();

        if (!initialized) {
            initialize();
        }

        calculateLucasNumber();
        unstringAndDisplay();
    }

    private void initialize() {
        ppr = BigInteger.ZERO;
        pr = BigInteger.ONE;
        lucas = BigInteger.ZERO;
        ans = "";
        returnCode = 0;
        initialized = true;
    }

    private void calculateLucasNumber() {
        if (n.equals(BigInteger.ZERO)) {
            lucas = BigInteger.ONE;
            return;
        }

        for (i = BigInteger.ZERO; i.compareTo(n) < 0; i = i.add(BigInteger.ONE)) {
            lucas = ppr.add(pr);
            ppr = pr;
            pr = lucas;
        }
    }

    private void unstringAndDisplay() {
        String lucasStr = lucas.toString();
        ans = lucasStr.substring(0, Math.min(18, lucasStr.length()));
        System.out.println(ans);
    }
}
```