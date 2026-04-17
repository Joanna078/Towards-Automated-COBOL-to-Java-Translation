```java
import java.util.Scanner;

public class Main {

    private int returnCode;
    private int n;
    private char[] inp = new char[500];
    private char[] tbl = new char[400];
    private int i;
    private int p1;
    private int p2;
    private double wa;
    private double out;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT N
        System.out.print("Enter N: ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // ACCEPT INP
        System.out.print("Enter INP: ");
        scanner.next(inp);

        // Initialize variables
        p1 = 1;
        wa = 0;
        out = 0;

        // Perform loop
        for (i = 1; i <= n; i++) {
            p2 = p1;
            while (inp[p2 - 1] != ' ') {
                p2++;
            }
            System.arraycopy(inp, p1 - 1, tbl, (i - 1) * 4, p2 - p1);
            p1 = p2 + 1;
            wa += p2;
        }

        // Compute WA
        wa /= n;

        // Perform loop
        for (i = n; i >= 1; i--) {
            if (tbl[(i - 1) * 4] != '0') {
                break;
            }
            tbl[(i - 1) * 4] = ' ';
        }

        // Display result
        System.out.println("Result: " + new String(tbl).trim());

        // Stop run
        System.exit(returnCode);
    }
}
```