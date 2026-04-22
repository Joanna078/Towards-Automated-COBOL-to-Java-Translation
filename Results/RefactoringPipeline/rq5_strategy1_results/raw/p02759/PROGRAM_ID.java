```java
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private int returnCode = 0;
    private String n = "000";
    private String ans = "000";

    public static void main(String[] args) {
        new PROGRAM_ID().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (up to 3 digits): ");
        n = scanner.nextLine().substring(0, Math.min(n.length(), 3)).padStart(3, '0');
        scanner.close();

        if (!initialized) {
            initialized = true;
        }

        compute();
        display();
    }

    private void compute() {
        d0 = new BigDecimal(n);
        d2 = new BigDecimal(2);
        d0 = d0.divide(d2, 0, RoundingMode.HALF_UP);
        d1 = new BigDecimal("09");
        d0 = d0.add(d1);
        ans = d0.toString().substring(0, Math.min(ans.length(), 3)).padStart(3, '0');
    }

    private void display() {
        System.out.println("Result: " + ans);
    }
}
```