import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");
    private BigDecimal d3 = new BigDecimal("0");
    private BigDecimal d4 = new BigDecimal("0");

    private int returnCode = 0;
    private String n = "0000000000";
    private String qt = "0000000000000000000";
    private String dvd = "0000000001";
    private String c = "0000000000000000000";
    private String c1 = "0000000000000000000";
    private String c3 = "0000000000000000000";
    private String c5 = "0000000000000000000";
    private String c15 = "0000000000000000000";
    private String accum = "0000000000000000000";
    private String zs = "0000000000000000000";

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextLine().padStart(10, '0');
        scanner.close();

        performCalculation();
        displayResult();
    }

    private void performCalculation() {
        performCalc(dvd, c1);
        performCalc("0000000003", c3);
        performCalc("0000000005", c5);
        performCalc("0000000015", c15);

        BigDecimal accumValue = new BigDecimal(c1)
                .subtract(new BigDecimal(c3))
                .subtract(new BigDecimal(c5))
                .add(new BigDecimal(c15));

        zs = accumValue.toString().padStart(19, '0');
    }

    private void performCalc(String divisor, String resultField) {
        BigDecimal dividend = new BigDecimal(n);
        BigDecimal divisorValue = new BigDecimal(divisor);
        BigDecimal quotient = dividend.divide(divisorValue, 4, RoundingMode.HALF_UP);
        qt = quotient.toString().padStart(19, '0');

        BigDecimal remainder = dividend.remainder(divisorValue);
        BigDecimal result = divisorValue.multiply(quotient)
                .add(remainder)
                .multiply(BigDecimal.valueOf(2))
                .divide(BigDecimal.valueOf(2), 4, RoundingMode.HALF_UP);

        resultField = result.toString().padStart(19, '0');
    }

    private void displayResult() {
        System.out.println(zs.trim());
    }
}