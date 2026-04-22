import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private BigDecimal x, y, z, a, b;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        if (!initialized) {
            initialize();
        }

        acceptInput();
        performCalculations();
        displayResults();
    }

    private void initialize() {
        x = BigDecimal.ZERO;
        y = BigDecimal.ZERO;
        z = BigDecimal.ZERO;
        a = BigDecimal.ZERO;
        b = BigDecimal.ZERO;
        initialized = true;
    }

    private void acceptInput() {
        System.out.print("Enter value for X: ");
        x = scanner.nextBigDecimal();
    }

    private void performCalculations() {
        for (a = BigDecimal.ONE; a.compareTo(BigDecimal.valueOf(3980)) <= 0 && y.compareTo(BigDecimal.ZERO) == 0; a = a.add(BigDecimal.ONE)) {
            for (b = BigDecimal.valueOf(-2500); b.compareTo(BigDecimal.valueOf(3980)) <= 0 && y.compareTo(BigDecimal.ZERO) == 0; b = b.add(BigDecimal.ONE)) {
                if (x.compareTo(a.pow(5).subtract(b.pow(5))) == 0) {
                    y = a;
                    z = b;
                }
            }
        }
    }

    private void displayResults() {
        System.out.printf("Y: %s, Z: %s%n", y, z);
    }
}