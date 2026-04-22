```java
import java.math.BigDecimal;
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");
    private int returnCode = 0;
    private String ln = "";
    private String A = "0";
    private String B = "0";
    private String C = "0";
    private String ans = "0";
    private String zs = "0";

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers separated by spaces: ");
        ln = scanner.nextLine();
        String[] parts = ln.split("\\s+");
        if (parts.length == 3) {
            A = parts[0];
            B = parts[1];
            C = parts[2];
        }
        scanner.close();

        d0 = new BigDecimal(A);
        d1 = new BigDecimal(B);
        d2 = new BigDecimal(C);

        if (d0.compareTo(d1.add(d2)) < 0) {
            ans = d1.add(d2).subtract(d0).toString();
            zs = String.format("%10s", ans).replace(' ', '0');
            System.out.println(zs.trim());
        } else {
            System.out.println("0");
        }
    }
}
```