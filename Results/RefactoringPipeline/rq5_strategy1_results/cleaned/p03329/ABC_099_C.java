import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_099_C {

    private boolean initialized = false;
    private int returnCode = 0;
    private String n = "";
    private String ans = "";
    private String zs = "";
    private String dummy = "";
    private int i = 0;
    private int r = 0;
    private int sumr = 0;
    private int t = 0;
    private int res = 0;

    public static void main(String[] args) {
        new ABC_099_C().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextLine();
        scanner.close();

        process();
        displayResult();
    }

    private void process() {
        BigDecimal bdN = new BigDecimal(n);
        BigDecimal bdRes = new BigDecimal(0);

        for (i = 1; i <= Integer.parseInt(n); i++) {
            t = i;
            sumr = 0;

            for (; t > 0; t /= 6) {
                r = t % 6;
                sumr += r;
            }

            t = i;
            for (; t > 0; t /= 9) {
                r = t % 9;
                sumr += r;
            }

            bdRes = bdRes.max(new BigDecimal(sumr));
        }

        zs = bdRes.toString();
        unstring(zs);
    }

    private void unstring(String input) {
        String[] parts = input.split(" ");
        dummy = parts[0];
        ans = parts[1];
    }

    private void displayResult() {
        System.out.println("Result: " + ans);
    }
}