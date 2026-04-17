import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_095_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private String inp2 = "";
    private int maxlen = 50;
    private int cur = 1;
    private long i = 1;
    private long j = 0;
    private long k = 0;
    private int len = 0;
    private String ans = "";
    private String nx1 = "";
    private String tmp = "";
    private String mn = "001001";
    private String sm = "";
    private String x = "";

    public static void main(String[] args) {
        new ABC_095_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter input: ");
        inp = scanner.nextLine();

        // Process input
        for (int n0 = maxlen; n0 > 0; n0--) {
            j = cur;
            while (inp.charAt((int) j - 1) != ' ') {
                j++;
            }
            len = (int) (j - cur);
            nx1 += inp.substring(cur - 1, cur + len - 1);
            cur++;
        }

        // Initialize sm and mn
        sm = "000000";
        mn = "001001";

        // Process further input
        k = 1;
        while (Long.parseLong(nx1.substring(0, 8)) >= k) {
            System.out.print("Enter further input: ");
            inp2 = scanner.nextLine();
            sm = String.valueOf(Long.parseLong(sm) + Long.parseLong(inp2));
            mn = String.valueOf(Math.min(Long.parseLong(mn), Long.parseLong(inp2)));
            k++;
        }

        // Calculate tmp and x
        tmp = String.valueOf(Long.parseLong(nx1.substring(8, 16)) - Long.parseLong(sm));
        x = String.valueOf(Long.parseLong(tmp) / Long.parseLong(mn));

        // Update nx1
        nx1 = String.valueOf(Long.parseLong(nx1.substring(0, 8)) + Long.parseLong(x));

        // Unstring and display result
        String[] parts = nx1.split("\\s+");
        ans = parts[1];
        System.out.println("Result: " + ans);

        scanner.close();
    }
}