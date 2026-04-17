```java
import java.math.BigDecimal;
import java.util.Scanner;

public class AisingA {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");

    private int returnCode = 0;
    private String inp = "";
    private int l = 0;
    private int r = 0;
    private int d = 0;
    private int i = 0;
    private int cnt = 0;
    private int out = 0;

    public static void main(String[] args) {
        new AisingA().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        if (inp.length() != 12) {
            System.out.println("Input must be exactly 12 characters long.");
            return;
        }

        l = Integer.parseInt(inp.substring(0, 3).trim());
        r = Integer.parseInt(inp.substring(3, 6).trim());
        d = Integer.parseInt(inp.substring(6, 9).trim());

        if (d == 3) {
            d0 = BigDecimal.valueOf(r);
            d2 = BigDecimal.valueOf(d);
            d0 = d0.subtract(d2).add(BigDecimal.ONE);
            cnt = d0.intValue();
        } else {
            cnt = 0;
            i = 1;
            while (true) {
                d0 = BigDecimal.valueOf(d).multiply(BigDecimal.valueOf(i));
                if (d0.compareTo(BigDecimal.valueOf(r)) > 0) break;
                if (d0.compareTo(BigDecimal.valueOf(l)) >= 0 && d0.compareTo(BigDecimal.valueOf(r)) <= 0) {
                    cnt++;
                }
                i++;
            }
        }

        out = cnt;
        System.out.println("Output: " + out);
    }
}
```