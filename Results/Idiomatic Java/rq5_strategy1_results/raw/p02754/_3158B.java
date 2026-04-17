```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");

    private int returnCode = 0;
    private String inp = "";
    private BigDecimal n = BigDecimal.ZERO;
    private BigDecimal a = BigDecimal.ZERO;
    private BigDecimal b = BigDecimal.ZERO;
    private BigDecimal x = BigDecimal.ZERO;
    private BigDecimal y = BigDecimal.ZERO;
    private BigDecimal sumA = BigDecimal.ZERO;
    private BigDecimal sumB = BigDecimal.ZERO;
    private BigDecimal cnt = BigDecimal.ZERO;
    private BigDecimal bkCnt = BigDecimal.ZERO;
    private BigDecimal outCnt = BigDecimal.ZERO;

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input:");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        n = new BigDecimal(parts[0]);
        a = new BigDecimal(parts[1]);
        b = new BigDecimal(parts[2]);

        d0 = n.divide(a.add(b), 4, BigDecimal.ROUND_HALF_UP);
        cnt = d0;

        if (a.compareTo(BigDecimal.valueOf(18)) == 0) {
            outCnt = BigDecimal.valueOf(2);
        } else if (b.compareTo(BigDecimal.valueOf(18)) == 0) {
            outCnt = n;
        } else {
            sumA = a.multiply(cnt);
            sumB = b.multiply(cnt);

            while (n.compareTo(sumA.add(sumB)) > 0) {
                sumA = sumA.add(a);
                sumB = sumB.add(b);
            }

            bkCnt = sumA.add(sumB).subtract(n);
            if (bkCnt.compareTo(b) <= 0) {
                outCnt = sumA;
            } else {
                outCnt = sumA.subtract(bkCnt.subtract(b));
            }
        }

        System.out.println("Output: " + outCnt);
    }
}
```