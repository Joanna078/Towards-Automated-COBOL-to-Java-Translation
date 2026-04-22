```java
import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_074_A {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private int returnCode = 0;
    private String n = "00000";
    private String a = "00000";
    private String ans = "     ";
    private String zs = "0000000";
    private char dummy = ' ';

    public static void main(String[] args) {
        ABC_074_A program = new ABC_074_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        if (!initialized) {
            initialized = true;
        }

        System.out.print("Enter N: ");
        n = scanner.nextLine().trim();

        System.out.print("Enter A: ");
        a = scanner.nextLine().trim();

        // Compute N^2
        d0 = new BigDecimal(n);
        d1 = new BigDecimal(2);
        d0 = d0.pow(d1.intValue());

        // Subtract A
        BigDecimal aValue = new BigDecimal(a);
        d0 = d0.subtract(aValue);

        // Move result to ZS
        zs = d0.toString();

        // Perform UNANS
        unans();

        // Display ans
        System.out.println(ans);

        // Stop
        System.exit(returnCode);
    }

    private void unans() {
        String[] parts = zs.split("\\s+");
        if (parts.length > 0) {
            ans = parts[0];
        }
    }
}
```