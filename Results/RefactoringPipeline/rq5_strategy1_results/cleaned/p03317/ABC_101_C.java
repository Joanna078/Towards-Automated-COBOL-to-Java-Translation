import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_101_C {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private String inp2 = "";
    private int maxlen = 50;
    private int cur = 1;
    private long i = 1;
    private long j = 0;
    private int len = 0;
    private BigDecimal X = BigDecimal.ZERO;
    private BigDecimal R = BigDecimal.ZERO;
    private String NK1 = "000000000000000000";
    private String ans = "      ";
    private BigDecimal ZS = BigDecimal.ZERO;
    private char DUMMY = ' ';

    public static void main(String[] args) {
        ABC_101_C program = new ABC_101_C();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT
        System.out.print("Enter INP: ");
        inp = scanner.nextLine().trim();
        System.out.print("Enter INP2: ");
        inp2 = scanner.nextLine().trim();

        // MAIN SECTION
        for (int n0 = maxlen; n0 > 0; n0--) {
            j = cur;
            while (j <= inp.length() && inp.charAt((int) j - 1) != ' ') {
                j++;
            }
            len = (int) (j - cur);
            NK1 = NK1.substring(0, 6 * (int) i - 6) + inp.substring((int) cur - 1, (int) cur - 1 + len) + NK1.substring(6 * (int) i);
            cur++;
            i++;
        }

        // Perform calculations
        BigDecimal nk1First = new BigDecimal(NK1.substring(0, 6));
        BigDecimal nk1Second = new BigDecimal(NK1.substring(6, 12));
        nk1First = nk1First.subtract(nk1Second);
        nk1Second = nk1Second.subtract(BigDecimal.ONE);
        X = nk1First.divide(nk1Second, 4, BigDecimal.ROUND_HALF_UP);
        if (R.compareTo(BigDecimal.ZERO) != 0) {
            X = X.add(BigDecimal.ONE);
        }
        X = X.add(BigDecimal.ONE);
        ZS = X;

        // UNANS SECTION
        String[] parts = ZS.toString().split("\\s+");
        ans = parts[0];

        // DISPLAY
        System.out.println("Result: " + ans);

        // STOP
        System.exit(returnCode);
    }
}