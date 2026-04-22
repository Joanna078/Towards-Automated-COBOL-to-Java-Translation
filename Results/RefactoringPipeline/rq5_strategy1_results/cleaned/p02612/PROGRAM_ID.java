import java.math.BigDecimal;
import java.math.BigInteger;

public class PROGRAM_ID {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);

    private int b_RETURN_CODE = 0;
    private BigInteger b_N = BigInteger.ZERO;
    private BigInteger b_num = BigInteger.ZERO;
    private BigInteger b_qt = BigInteger.ZERO;
    private BigInteger b_rm = BigInteger.ZERO;
    private BigInteger b_ans = BigInteger.ZERO;
    private BigInteger b_zs = BigInteger.ZERO;

    public static void main(String[] args) {
        new PROGRAM_ID().run();
    }

    public void run() {
        if (!initialized) {
            initialize();
        }

        // Accept input
        System.out.print("Enter a number: ");
        b_N = new BigInteger(System.console().readLine());

        // Divide and compute
        b_qt = b_N.divide(BigInteger.valueOf(1000));
        b_rm = b_N.remainder(BigInteger.valueOf(1000));

        d0 = new BigDecimal(1000);
        d1 = new BigDecimal(b_rm);
        d0 = d0.subtract(d1);
        b_num = d0.toBigInteger();

        b_qt = b_num.divide(BigInteger.valueOf(1000));
        b_ans = b_num.remainder(BigInteger.valueOf(1000));

        b_zs = b_ans;

        // Display result
        System.out.println("Result: " + b_zs.toString().trim());

        // Stop program
        System.exit(b_RETURN_CODE);
    }

    private void initialize() {
        initialized = true;
    }
}