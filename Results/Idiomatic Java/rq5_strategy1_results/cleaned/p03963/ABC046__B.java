import java.math.BigDecimal;
import java.util.Scanner;

public class ABC046_B {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private BigDecimal d3 = new BigDecimal(0);

    private int returnCode = 0;
    private String str = "           ";
    private int n = 0;
    private int k = 0;
    private String ans = "0000000000";
    private String anss = "0000000000";

    public static void main(String[] args) {
        new ABC046_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string: ");
        str = scanner.nextLine().trim();

        unstring(str);
        compute();
        displayResult();
    }

    private void unstring(String input) {
        String[] parts = input.split(" ");
        if (parts.length >= 2) {
            n = Integer.parseInt(parts[0]);
            k = Integer.parseInt(parts[1]);
        }
    }

    private void compute() {
        d0 = BigDecimal.valueOf(k);
        d1 = BigDecimal.valueOf(k - 1);
        d2 = BigDecimal.valueOf(n - 1);
        d3 = d1.pow(d2.intValue());
        d0 = d0.multiply(d3);
        ans = d0.toString();
        anss = ans;
    }

    private void displayResult() {
        System.out.println("Result: " + anss);
    }
}