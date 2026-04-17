import java.math.BigDecimal;
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private BigDecimal d3 = new BigDecimal(0);
    private int returnCode = 0;
    private String ln = "";
    private String A = "0";
    private String B = "0";
    private String C = "0";
    private String D = "0";
    private String TK = "0";
    private String AO = "0";

    public static void main(String[] args) {
        new PROGRAM_ID().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter values: ");
        ln = scanner.nextLine();

        String[] parts = ln.split("\\s+");
        if (parts.length >= 4) {
            A = parts[0];
            B = parts[1];
            C = parts[2];
            D = parts[3];
        }

        computeAndDisplay();
    }

    private void computeAndDisplay() {
        d0 = new BigDecimal(C).add(new BigDecimal(B)).subtract(BigDecimal.ONE);
        d1 = new BigDecimal(B);
        d0 = d0.divide(d1, 4, BigDecimal.ROUND_HALF_UP);
        TK = d0.toPlainString();

        d0 = new BigDecimal(A).add(new BigDecimal(D)).subtract(BigDecimal.ONE);
        d1 = new BigDecimal(D);
        d0 = d0.divide(d1, 4, BigDecimal.ROUND_HALF_UP);
        AO = d0.toPlainString();

        if (TK.compareTo(AO) <= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}