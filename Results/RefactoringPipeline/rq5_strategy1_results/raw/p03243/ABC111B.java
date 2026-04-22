```java
import java.math.BigDecimal;
import java.math.RoundingMode;

public class ABC111B {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private int returnCode = 0;
    private String n = "000";

    public static void main(String[] args) {
        new ABC111B().execute();
    }

    public void execute() {
        if (!initialized) {
            initialize();
        }

        // Main logic
        acceptInput();
        computeAndDisplay();
    }

    private void initialize() {
        initialized = true;
    }

    private void acceptInput() {
        // Simulate ACCEPT statement
        System.out.print("Enter a number (3 digits): ");
        n = String.format("%03d", Integer.parseInt(System.console().readLine()));
    }

    private void computeAndDisplay() {
        BigDecimal num = new BigDecimal(n);

        // First computation
        d0 = num.add(new BigDecimal(110)).divide(new BigDecimal(111), 4, RoundingMode.HALF_UP);
        n = d0.toPlainString().substring(0, 4);

        // Second computation
        d0 = num.multiply(new BigDecimal(111));
        n = d0.toPlainString().substring(0, 4);

        // Display result
        System.out.println("Result: " + n);

        // Stop execution
        System.exit(returnCode);
    }
}
```