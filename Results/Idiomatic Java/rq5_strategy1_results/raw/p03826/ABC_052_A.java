```java
import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_052_A {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);

    private int returnCode = 0;
    private String inp = "";
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private int d = 0;
    private String ans = "";
    private String zs = "";
    private char dummy = ' ';

    public static void main(String[] args) {
        new ABC_052_A().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        if (parts.length >= 4) {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[1]);
            c = Integer.parseInt(parts[2]);
            d = Integer.parseInt(parts[3]);
        }

        b = a * b;
        d = c * d;
        int max = Math.max(b, d);
        zs = String.valueOf(max);

        String[] unstrungParts = zs.split("\\s+", 2);
        if (unstrungParts.length > 1) {
            ans = unstrungParts[1];
        }

        System.out.println("Result: " + ans);
    }
}
```