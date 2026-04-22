```java
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private short n = 0;
    private short x = 0;
    private short y = 0;
    private short i = 0;
    private short j = 0;
    private short k = 0;
    private short i1 = 0;
    private short j1 = 0;
    private short j2 = 0;
    private short sa = 0;
    private short cnt = 0;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        if (inp.length() != 15) {
            System.out.println("Input must be exactly 15 characters long.");
            return;
        }

        unstring(inp);
        compute();
        displayResult();
    }

    private void unstring(String input) {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            System.out.println("Input must contain exactly three parts separated by spaces.");
            return;
        }

        n = Short.parseShort(parts[0]);
        x = Short.parseShort(parts[1]);
        y = Short.parseShort(parts[2]);
    }

    private void compute() {
        sa = (short) (y - x);

        for (i = 1; i <= n; i++) {
            if (i == 1) {
                cnt = n;
            } else if (i == n) {
                cnt = 0;
            } else {
                cnt = (short) (n - i);
                j = (short) (x + i);
                k = (short) (x - i);

                if (j < 1) {
                    j = 1;
                }

                if (k >= y) {
                    k = (short) (y - 1);
                }

                for (j1 = 1; j1 <= j; j1++) {
                    if (j1 == j || j1 == y) {
                        continue;
                    } else if (j1 < j) {
                        cnt++;
                    } else if (j1 > y) {
                        cnt--;
                    }
                }
            }
        }
    }

    private void displayResult() {
        System.out.println("Result: " + cnt);
    }
}
```