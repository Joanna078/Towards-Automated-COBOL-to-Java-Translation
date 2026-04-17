```java
import java.math.BigDecimal;
import java.util.Scanner;

public class TESTA {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private BigDecimal d3 = new BigDecimal(0);
    private int returnCode = 0;
    private String n = "00000";
    private String k = "00000";
    private String x = "00000";
    private String y = "00000";
    private String ans = "000000000";

    public static void main(String[] args) {
        new TESTA().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        n = scanner.nextLine().padStart(5, '0').substring(0, 5);

        System.out.print("Enter K: ");
        k = scanner.nextLine().padStart(5, '0').substring(0, 5);

        System.out.print("Enter X: ");
        x = scanner.nextLine().padStart(5, '0').substring(0, 5);

        System.out.print("Enter Y: ");
        y = scanner.nextLine().padStart(5, '0').substring(0, 5);

        if (new BigDecimal(k).compareTo(new BigDecimal(n)) < 0) {
            d0 = new BigDecimal(k).multiply(new BigDecimal(x));
            d1 = new BigDecimal(n).subtract(new BigDecimal(k));
            d2 = new BigDecimal(y).multiply(d1);
            ans = d0.add(d2).toString().padStart(9, '0').substring(0, 9);
        } else {
            ans = new BigDecimal(n).multiply(new BigDecimal(x)).toString().padStart(9, '0').substring(0, 9);
        }

        System.out.println("ANS: " + ans);
    }
}
```