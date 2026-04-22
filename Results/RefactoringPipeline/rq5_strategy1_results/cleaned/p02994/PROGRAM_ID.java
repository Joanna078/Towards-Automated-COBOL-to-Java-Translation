import java.math.BigDecimal;
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private BigDecimal d3 = new BigDecimal(0);
    private BigDecimal d4 = new BigDecimal(0);
    private BigDecimal d5 = new BigDecimal(0);

    private int returnCode = 0;
    private String ln = "";
    private String NX = "";
    private String LX = "";
    private String N = "";
    private String L = "";
    private String ans = "";
    private String zs = "";

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        ln = scanner.nextLine();
        scanner.close();

        if (ln.startsWith("-")) {
            NX = ln.substring(1);
        } else {
            NX = ln;
        }

        if (NX.contains(" ")) {
            String[] parts = NX.split(" ");
            NX = parts[0];
            LX = parts[1];
        } else {
            LX = NX;
        }

        if (NX.startsWith("-")) {
            N = NX.substring(1);
            d0 = new BigDecimal(N).subtract(BigDecimal.ONE);
        } else {
            N = NX;
        }

        if (LX.startsWith("-")) {
            L = LX.substring(1);
            d1 = new BigDecimal(L).subtract(BigDecimal.ONE);
        } else {
            L = LX;
        }

        d2 = new BigDecimal(2);
        d5 = new BigDecimal(L);
        d2 = d2.multiply(d5);
        d4 = new BigDecimal(N);
        d2 = d2.add(d4);
        d3 = new BigDecimal(1);
        d2 = d2.subtract(d3);
        d0 = d0.multiply(d2);
        d1 = new BigDecimal(2);
        d0 = d0.divide(d1, 4, BigDecimal.ROUND_HALF_UP);

        if (new BigDecimal(L).compareTo(BigDecimal.ZERO) > 0) {
            d0 = d0.subtract(new BigDecimal(L));
        } else if (new BigDecimal(L).add(new BigDecimal(N)).compareTo(BigDecimal.ZERO) < 0) {
            d0 = d0.subtract(new BigDecimal(L).add(new BigDecimal(N)).subtract(BigDecimal.ONE));
        }

        if (d0.compareTo(BigDecimal.ZERO) == 0) {
            System.out.println("0");
        } else {
            zs = d0.toString();
            System.out.println(zs.trim());
        }
    }
}