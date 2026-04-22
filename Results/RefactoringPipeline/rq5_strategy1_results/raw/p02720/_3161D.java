```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private String n = "";
    private BigDecimal[] tbl = new BigDecimal[100000];
    private int i = 0;
    private int l = 0;
    private int s = 0;
    private int a = 0;
    private String out = "";

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextLine();
        scanner.close();

        for (i = 1; i <= 9; i++) {
            tbl[i] = BigDecimal.valueOf(i);
        }

        for (i = 1; i <= Integer.parseInt(n); i++) {
            s = i % 10;
            if (s != 0) {
                l++;
                tbl[l] = tbl[i].multiply(BigDecimal.TEN).add(BigDecimal.valueOf(s)).subtract(BigDecimal.ONE);
            }
            if (s != 9) {
                l++;
                tbl[l] = tbl[i].multiply(BigDecimal.TEN).add(BigDecimal.valueOf(s)).add(BigDecimal.ONE);
            }
        }

        out = tbl[Integer.parseInt(n)].toString();
        System.out.println("Output: " + out);
    }
}
```