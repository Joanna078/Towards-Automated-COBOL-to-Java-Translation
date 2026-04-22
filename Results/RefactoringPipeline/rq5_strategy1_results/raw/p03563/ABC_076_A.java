```java
import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_076_A {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private int returnCode = 0;
    private String ans = "     ";
    private char dummy = ' ';

    public static void main(String[] args) {
        ABC_076_A program = new ABC_076_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        if (!initialized) {
            initialized = true;
        }

        // Accept input
        System.out.print("Enter R: ");
        int r = scanner.nextInt();
        System.out.print("Enter G: ");
        int g = scanner.nextInt();

        // Perform calculations
        d0 = BigDecimal.valueOf(g);
        d1 = BigDecimal.valueOf(r);
        d0 = d0.subtract(d1);
        r = r + g;
        String zs = String.format("%06d", r);

        // Unstring operation
        String[] parts = zs.split("\\s+");
        dummy = parts[0].charAt(0);
        ans = parts[1];

        // Display result
        System.out.println("Result: " + ans);

        // Stop run
        System.exit(returnCode);
    }
}
```