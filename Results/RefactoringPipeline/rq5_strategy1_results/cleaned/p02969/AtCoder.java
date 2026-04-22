import java.math.BigDecimal;
import java.math.BigInteger;

public class AtCoder {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private BigInteger b_RETURN_CODE = BigInteger.ZERO;
    private byte[] b_INP = new byte[100];
    private byte[] b_A = new byte[15];
    private byte[] b_B = new byte[6];
    private byte[] b_C = new byte[15];
    private byte[] b_t = new byte[15];
    private byte[] b_temp1 = new byte[15];
    private byte[] b_temp2 = new byte[15];
    private byte[] b_N = new byte[15];

    public static void main(String[] args) {
        new AtCoder().run();
    }

    public void run() {
        if (!initialized) {
            initialize();
        }

        // Accept input
        System.arraycopy(System.in.readNBytes(b_A.length), 0, b_A, 0, b_A.length);

        // Compute
        d0 = new BigDecimal(new String(b_A)).multiply(new BigDecimal(3));
        d1 = new BigDecimal(new String(b_A));
        d0 = d0.multiply(d1);
        String result = d0.toString();
        System.arraycopy(result.getBytes(), 0, b_A, 0, Math.min(result.length(), b_A.length));

        // Move and display
        System.arraycopy(b_A, 0, b_B, 0, Math.min(b_A.length, b_B.length));
        System.out.println(new String(b_B));

        // Stop
        System.exit(b_RETURN_CODE.intValue());
    }

    private void initialize() {
        initialized = true;
        b_RETURN_CODE = BigInteger.ZERO;
        for (byte[] array : new byte[][]{b_INP, b_A, b_B, b_C, b_t, b_temp1, b_temp2, b_N}) {
            java.util.Arrays.fill(array, (byte) ' ');
        }
    }
}