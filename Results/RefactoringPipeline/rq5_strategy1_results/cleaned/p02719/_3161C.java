import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");
    private int returnCode = 0;
    private String inp = "";
    private String nx = "";
    private String kx = "";
    private long n = 0;
    private long k = 0;
    private long s = 0;
    private long a = 0;
    private BigDecimal ans = BigDecimal.ZERO;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        nx = inp.substring(0, 19);
        kx = inp.substring(19);

        if (nx.equals("1000000000000000000") && kx.equals("1000000000000000000")) {
            n = 1;
            k = 1;
        } else if (nx.equals("1000000000000000000")) {
            k = Long.parseLong(kx);
            n = k - 999999999999999999 + 1;
        } else if (kx.equals("1000000000000000000")) {
            n = Long.parseLong(nx);
            k = n - 999999999999999999 + 1;
        } else {
            n = Long.parseLong(nx);
            k = Long.parseLong(kx);
        }

        s = n / k;
        a = n % k;

        if (a == 0) {
            ans = BigDecimal.ZERO;
        } else if (a <= k / 2) {
            ans = BigDecimal.valueOf(a);
        } else {
            ans = BigDecimal.valueOf(k - a);
        }

        System.out.println(ans.stripTrailingZeros().toPlainString());
    }
}