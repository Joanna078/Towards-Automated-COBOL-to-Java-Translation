import java.math.BigDecimal;
import java.util.Scanner;

public class Abc169c {

    private boolean initialized = false;
    private int returnCode = 0;
    private String ab = "";
    private BigDecimal a = BigDecimal.ZERO;
    private BigDecimal b = BigDecimal.ZERO;
    private BigDecimal ans = BigDecimal.ZERO;

    public static void main(String[] args) {
        new Abc169c().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for ab: ");
        ab = scanner.nextLine();

        String[] parts = ab.split("\\s+");
        if (parts.length >= 2) {
            try {
                a = new BigDecimal(parts[0]);
                b = new BigDecimal(parts[1]);
                computeAndDisplay();
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values.");
            }
        } else {
            System.out.println("Please provide two values separated by space.");
        }
    }

    private void computeAndDisplay() {
        ans = a.multiply(b);
        System.out.println("Result: " + ans);
    }
}