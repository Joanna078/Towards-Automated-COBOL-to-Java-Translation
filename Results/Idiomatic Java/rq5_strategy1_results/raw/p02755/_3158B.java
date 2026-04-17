```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");

    private int returnCode = 0;
    private String inp = "";
    private int a = 0;
    private int b = 0;
    private int t1 = 0;
    private int t2 = 0;
    private int p1 = 0;
    private int p2 = 0;
    private int pri = 0;
    private String outPri = "";

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        String[] parts = inp.split("\\s+");
        if (parts.length >= 2) {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
        }

        computeAndDisplay();
    }

    private void computeAndDisplay() {
        d0 = BigDecimal.valueOf(a);
        d1 = new BigDecimal("125");
        p1 = d0.multiply(d1).intValue();

        d0 = BigDecimal.valueOf(b);
        d1 = new BigDecimal("10");
        p2 = d0.multiply(d1).intValue();

        pri = p1 > p2 ? p1 : p2;

        d0 = BigDecimal.valueOf(pri);
        d1 = new BigDecimal("8");
        t1 = d0.multiply(d1).intValue();

        d0 = BigDecimal.valueOf(pri);
        d1 = new BigDecimal("1");
        t2 = d0.multiply(d1).intValue();

        if (t1 != a || t2 != b) {
            outPri = "1-";
        } else {
            outPri = String.valueOf(pri);
        }

        System.out.println("Output: " + outPri);
    }
}
```