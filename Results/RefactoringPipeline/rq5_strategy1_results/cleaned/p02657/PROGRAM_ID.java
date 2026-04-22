import java.math.BigDecimal;
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private int returnCode = 0;
    private String ln = "";
    private String A = "";
    private String B = "";
    private String ans = "";
    private String zs = "";

    public static void main(String[] args) {
        new PROGRAM_ID().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two numbers separated by space: ");
        ln = scanner.nextLine();
        scanner.close();

        String[] parts = ln.split("\\s+");
        if (parts.length == 2) {
            A = parts[0];
            B = parts[1];
        } else {
            System.out.println("Invalid input. Please enter two numbers.");
            return;
        }

        multiplyAndDisplay();
    }

    private void multiplyAndDisplay() {
        try {
            BigDecimal numA = new BigDecimal(A);
            BigDecimal numB = new BigDecimal(B);
            ans = numA.multiply(numB).toString();
            zs = ans;
            System.out.println("Result: " + zs);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format.");
        }
    }
}