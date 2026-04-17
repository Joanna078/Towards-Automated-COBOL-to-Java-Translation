import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_048_B {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");

    private int b_RETURN_CODE;
    private String b_INP = " ".repeat(59);
    private BigDecimal b_a = BigDecimal.ZERO;
    private BigDecimal b_b = BigDecimal.ZERO;
    private BigDecimal b_x = BigDecimal.ZERO;
    private String b_ans = " ".repeat(19);
    private BigDecimal b_q1 = BigDecimal.ZERO;
    private BigDecimal b_q2 = BigDecimal.ZERO;
    private BigDecimal b_r = BigDecimal.ZERO;
    private String b_ZS = " ".repeat(20);
    private char b_DUMMY = ' ';

    public static void main(String[] args) {
        new ABC_048_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        b_INP = scanner.nextLine();

        String[] parts = b_INP.trim().split("\\s+");
        b_a = new BigDecimal(parts[0]);
        b_b = new BigDecimal(parts[1]);
        b_x = new BigDecimal(parts[2]);

        b_q1 = b_a.divide(b_x, 4, BigDecimal.ROUND_HALF_UP);
        b_r = b_a.remainder(b_x);

        d0 = b_b;
        d1 = b_x;
        b_q2 = d0.divide(d1, 4, BigDecimal.ROUND_HALF_UP);

        b_q2 = b_q2.subtract(b_q1);

        if (b_r.compareTo(BigDecimal.ZERO) == 0) {
            b_q2 = b_q2.add(BigDecimal.ONE);
        }

        b_ZS = b_q2.toPlainString();
        b_ans = b_ZS.split("\\s+")[0];

        System.out.println("Result: " + b_ans);
    }
}