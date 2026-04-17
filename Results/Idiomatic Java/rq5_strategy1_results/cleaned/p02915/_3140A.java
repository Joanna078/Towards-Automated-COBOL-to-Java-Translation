import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");
    private int returnCode = 0;
    private char n = '0';
    private String ans = "000";
    private String anss = "000";

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.next().charAt(0);
        scanner.close();

        if (!initialized) {
            initialize();
        }

        compute();
        displayResult();
    }

    private void initialize() {
        initialized = true;
    }

    private void compute() {
        d0 = BigDecimal.valueOf(n - '0');
        d2 = BigDecimal.valueOf(n - '0');
        d0 = d0.multiply(d2);
        d1 = BigDecimal.valueOf(n - '0');
        d0 = d0.multiply(d1);
        ans = d0.toString().substring(0, Math.min(3, d0.toString().length()));
    }

    private void displayResult() {
        anss = ans;
        System.out.println("Result: " + anss);
    }
}