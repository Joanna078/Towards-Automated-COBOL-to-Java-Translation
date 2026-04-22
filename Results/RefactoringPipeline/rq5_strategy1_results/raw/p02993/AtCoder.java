```java
import java.math.BigDecimal;
import java.util.Scanner;

public class AtCoder {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);

    private int returnCode = 0;
    private String inp = "";
    private BigDecimal a = BigDecimal.ZERO;
    private BigDecimal b = BigDecimal.ZERO;
    private BigDecimal c = BigDecimal.ZERO;
    private BigDecimal d = BigDecimal.ZERO;
    private BigDecimal e = BigDecimal.ZERO;
    private BigDecimal t = BigDecimal.ZERO;
    private BigDecimal temp1 = BigDecimal.ZERO;
    private BigDecimal temp2 = BigDecimal.ZERO;
    private BigDecimal n = BigDecimal.ZERO;

    private static final String GOOD = "Good";
    private static final String BAD = "Bad";

    public static void main(String[] args) {
        new AtCoder().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        inp = scanner.nextLine();
        a = new BigDecimal(inp);

        computeValues();
        displayResult();
    }

    private void computeValues() {
        b = a.divide(BigDecimal.TEN, 4, BigDecimal.ROUND_HALF_UP);
        c = a.subtract(b.multiply(BigDecimal.TEN)).divide(BigDecimal.TEN, 4, BigDecimal.ROUND_HALF_UP);
        d = a.subtract(c.multiply(BigDecimal.TEN)).divide(BigDecimal.TEN, 4, BigDecimal.ROUND_HALF_UP);
        e = a;
    }

    private void displayResult() {
        if (b.equals(c) || c.equals(d) || e.equals(d)) {
            System.out.println(BAD);
        } else {
            System.out.println(GOOD);
        }
    }
}
```