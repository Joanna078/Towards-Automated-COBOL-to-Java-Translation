import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private int returnCode = 0;
    private String inp = "";
    private String r = "";
    private String ans = "";

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inp = scanner.nextLine().trim();
        r = inp;
        compute();
        displayResult();
    }

    private void compute() {
        d0 = new BigDecimal(r);
        d1 = new BigDecimal(r);
        ans = d0.multiply(d1).toString();
    }

    private void displayResult() {
        System.out.println("Result: " + ans);
    }
}