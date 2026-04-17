import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private BigDecimal d3 = new BigDecimal(0);
    private BigInteger b_RETURN_CODE = BigInteger.ZERO;
    private String b_INP = "";
    private int b_N = 0;
    private int b_D = 0;
    private int b_I = 0;
    private int b_X = 0;
    private int b_Y = 0;
    private long b_K = 0;
    private int b_CNT = 0;
    private int b_OUT = 0;

    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        if (!initialized) {
            initialized = true;
        }

        // Accept input
        System.out.print("Enter input: ");
        b_INP = scanner.nextLine();

        // Unstring input
        String[] parts = b_INP.split(" ");
        b_N = Integer.parseInt(parts[0]);
        b_D = Integer.parseInt(parts[1]);

        b_CNT = 0;
        b_I = 1;

        while (b_I <= b_N) {
            System.out.print("Enter input: ");
            b_INP = scanner.nextLine();

            parts = b_INP.split(" ");
            b_X = Integer.parseInt(parts[0]);
            b_Y = Integer.parseInt(parts[1]);

            d0 = BigDecimal.valueOf(b_X);
            d3 = BigDecimal.valueOf(b_X);
            d0 = d0.multiply(d3);
            d2 = BigDecimal.valueOf(b_Y);
            d3 = BigDecimal.valueOf(b_Y);
            d2 = d2.multiply(d3);
            d0 = d0.add(d2);
            d1 = new BigDecimal("2.05");
            d0 = d0.pow(d1.intValue());

            if (d0.longValue() <= b_D) {
                b_CNT++;
            }

            b_I++;
        }

        b_OUT = b_CNT;
        System.out.println("Output: " + b_OUT);
    }
}