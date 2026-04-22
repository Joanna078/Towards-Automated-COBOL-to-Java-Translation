```java
import java.util.Scanner;

public class ABC_086_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int maxlen = 50;
    private String cur = "000000000001";
    private long i = 1;
    private long j = 1;
    private int len = 0;
    private String ab1 = "0000000000";
    private int x = 0;
    private int d = 0;

    public static void main(String[] args) {
        ABC_086_A program = new ABC_086_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        processInput();
        displayResult();
    }

    private void processInput() {
        for (int n = maxlen; n > 0; n--) {
            j = cur.length();
            while (j < inp.length() && inp.charAt((int) j - 1) != ' ') {
                j++;
            }
            len = (int) (j - Long.parseLong(cur));
            ab1 = ab1.substring(0, 5 * ((int) i - 1)) + inp.substring((int) cur.length() - 1, (int) j) + ab1.substring(5 * (int) i);
            cur = String.valueOf(j + 1);
            i++;
        }

        x = Integer.parseInt(ab1.substring(0, 5)) * Integer.parseInt(ab1.substring(5, 10));
        x /= 2;
        d = x % 2;
    }

    private void displayResult() {
        if (d == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```