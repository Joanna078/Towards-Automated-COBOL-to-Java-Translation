```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private BigDecimal a;
    private BigDecimal b;
    private BigDecimal ans;
    private BigDecimal sho;
    private int ama;
    private String inp;
    private String disp;
    private int returnCode;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        if (inp.length() != 20) {
            System.out.println("IMPOSSIBLE");
            return;
        }

        a = new BigDecimal(inp.substring(0, 10));
        b = new BigDecimal(inp.substring(10, 20));

        ans = a.add(b);
        sho = ans.divide(new BigDecimal("2"), BigDecimal.ROUND_HALF_UP);
        ama = ans.remainder(new BigDecimal("2")).intValue();

        disp = sho.toString();

        if (ama == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.println(disp);
        }
    }
}
```