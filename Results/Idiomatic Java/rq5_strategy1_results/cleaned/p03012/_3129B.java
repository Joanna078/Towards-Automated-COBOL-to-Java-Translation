import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private int n = 0;
    private int w = 0;
    private int wa = 0;
    private BigDecimal hf = BigDecimal.ZERO;
    private int[] tbl = new int[100];
    private int i = 0;
    private int s1 = 0;
    private int s2 = 0;
    private int p1 = 0;
    private int p2 = 0;
    private int out = 0;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        System.out.print("Enter N: ");
        n = scanner.nextInt();

        // Accept INP
        System.out.print("Enter INP: ");
        scanner.nextLine(); // Consume newline
        inp = scanner.nextLine();

        wa = 0;
        p1 = 0;

        for (i = 1; i <= n; i++) {
            p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            w = Integer.parseInt(inp.substring(p1, p2));
            wa += w;
            tbl[i - 1] = w;
            p1 = p2 + 1;
        }

        hf = BigDecimal.valueOf(wa).divide(BigDecimal.valueOf(2), 0, BigDecimal.ROUND_HALF_UP);

        for (i = 1; i <= n; i++) {
            if (tbl[i - 1] == hf.intValue()) {
                System.out.println("0");
                return;
            }
        }

        s1 = wa - tbl[i - 2] * 2;
        s2 = wa - tbl[i - 1] * 2;

        if (s1 < s2) {
            out = s1;
        } else {
            out = s2;
        }

        System.out.println(out);
    }
}