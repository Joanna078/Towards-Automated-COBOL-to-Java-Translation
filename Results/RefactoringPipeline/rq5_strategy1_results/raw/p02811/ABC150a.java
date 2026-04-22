```java
import java.math.BigDecimal;
import java.util.Scanner;

public class ABC150a {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private int returnCode = 0;
    private String k = "000000";
    private String x = "000000";

    public static void main(String[] args) {
        new ABC150a().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        if (!initialized) {
            initialized = true;
        }

        System.out.print("Enter value for K: ");
        k = scanner.nextLine().padStart(6, '0').substring(0, 6);

        System.out.print("Enter value for X: ");
        x = scanner.nextLine().padStart(6, '0').substring(0, 6);

        d0 = new BigDecimal(k);
        d1 = new BigDecimal(500);
        d0 = d0.multiply(d1);

        if (d0.compareTo(new BigDecimal(x)) >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```