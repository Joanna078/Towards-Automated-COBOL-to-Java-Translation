import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");
    private int returnCode = 0;
    private String x = "0000000000";
    private String s1 = "00000000";
    private String s2 = "000";
    private String a = "000";
    private String out = "0000000000";

    public static void main(String[] args) {
        Main main = new Main();
        main.run();
    }

    public void run() {
        if (!initialized) {
            initialize();
        }

        // Accept input
        System.out.print("Enter a number: ");
        x = String.format("%10s", System.console().readLine()).replace(' ', '0');

        // Divide
        s1 = divide(x, "500", 4);
        a = x.substring(x.length() - 3);

        // Further division
        d0 = new BigDecimal(a).divide(new BigDecimal("5"), 4, RoundingMode.HALF_UP);
        s2 = d0.toPlainString().substring(0, Math.min(3, d0.toPlainString().length()));

        // Compute
        d0 = new BigDecimal(s1).multiply(new BigDecimal("1000"));
        d1 = new BigDecimal(s2).multiply(new BigDecimal("5"));
        d0 = d0.add(d1);
        out = d0.toPlainString().substring(0, Math.min(10, d0.toPlainString().length()));

        // Display output
        System.out.println("Output: " + out);

        // Stop
        System.exit(returnCode);
    }

    private void initialize() {
        initialized = true;
    }

    private String divide(String dividend, String divisor, int scale) {
        BigDecimal result = new BigDecimal(dividend).divide(new BigDecimal(divisor), scale, RoundingMode.HALF_UP);
        return result.toPlainString().substring(0, Math.min(scale, result.toPlainString().length()));
    }
}