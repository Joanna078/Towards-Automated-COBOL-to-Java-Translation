import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class ATCODER {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private int returnCode = 0;
    private String inp = "";
    private BigDecimal a = BigDecimal.ZERO;
    private BigDecimal b = BigDecimal.ZERO;
    private BigDecimal c = BigDecimal.ZERO;
    private BigDecimal lef = BigDecimal.ZERO;
    private BigDecimal rig = BigDecimal.ZERO;
    private static final BigDecimal ONE_FIVE = new BigDecimal("1.5");
    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        new ATCODER().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        if (parts.length != 3) {
            System.out.println("Invalid input");
            return;
        }

        try {
            a = new BigDecimal(parts[0]);
            b = new BigDecimal(parts[1]);
            c = new BigDecimal(parts[2]);

            a = a.pow(15, MathContext.DECIMAL128);
            b = b.pow(15, MathContext.DECIMAL128);
            c = c.pow(15, MathContext.DECIMAL128);

            lef = a.add(b, MathContext.DECIMAL128);
            rig = c;

            if (lef.compareTo(rig) < 0) {
                System.out.println(YES);
            } else {
                System.out.println(NO);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format");
        }
    }
}