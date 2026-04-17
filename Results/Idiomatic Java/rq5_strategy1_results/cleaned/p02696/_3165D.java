import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");

    private int returnCode = 0;
    private String inp = "";
    private BigDecimal a = BigDecimal.ZERO;
    private BigDecimal b = BigDecimal.ZERO;
    private BigDecimal n = BigDecimal.ZERO;
    private BigDecimal x = BigDecimal.ZERO;
    private BigDecimal fa = BigDecimal.ZERO;
    private BigDecimal fb = BigDecimal.ZERO;
    private BigDecimal out = BigDecimal.ZERO;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        String[] parts = inp.split("\\s+");
        if (parts.length >= 3) {
            a = new BigDecimal(parts[0]);
            b = new BigDecimal(parts[1]);
            n = new BigDecimal(parts[2]);
        } else {
            System.out.println("Invalid input format.");
            return;
        }

        if (n.compareTo(b) >= 0) {
            x = b.subtract(BigDecimal.ONE);
        } else {
            x = n;
        }

        fa = a.multiply(x).divide(b, 4, BigDecimal.ROUND_HALF_UP);
        fb = x.divide(b, 4, BigDecimal.ROUND_HALF_UP);
        fb = a.multiply(fb).setScale(4, BigDecimal.ROUND_HALF_UP);
        out = fa.subtract(fb);

        System.out.println("Output: " + out.toPlainString());
    }
}