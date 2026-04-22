```java
import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_100_B {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);

    private int RETURN_CODE = 0;
    private String INP = "          ";
    private int maxlen = 50;
    private int cur = 1;
    private long i = 1;
    private long j = 0;
    private int len = 0;
    private BigDecimal ans = new BigDecimal(0);
    private String DN1 = "0000000000000000";
    private String tmp = "00000000";

    public static void main(String[] args) {
        new ABC_100_B().execute();
    }

    public void execute() {
        initialize();
        acceptInput();
        processInput();
        displayResult();
    }

    private void initialize() {
        initialized = true;
    }

    private void acceptInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        INP = scanner.nextLine().substring(0, Math.min(INP.length(), scanner.nextLine().length()));
        scanner.close();
    }

    private void processInput() {
        for (int n0 = maxlen; n0 > 0; n0--) {
            j = cur;
            while (INP.charAt((int) j - 1) != ' ') {
                j++;
            }
            len = (int) (j - cur);
            DN1 = DN1.substring(0, 8 * ((int) i - 1)) + INP.substring((int) cur - 1, (int) cur + len - 1) + DN1.substring(8 * (int) i);
            cur++;
            i++;
        }
        BigDecimal base = new BigDecimal(100);
        BigDecimal exponent = new BigDecimal(DN1.substring(0, 8));
        BigDecimal multiplier = new BigDecimal(DN1.substring(8, 16));
        tmp = base.pow(exponent.intValue()).multiply(multiplier).toString();
        ans = new BigDecimal(tmp);
    }

    private void displayResult() {
        System.out.println("Result: " + ans);
    }
}
```