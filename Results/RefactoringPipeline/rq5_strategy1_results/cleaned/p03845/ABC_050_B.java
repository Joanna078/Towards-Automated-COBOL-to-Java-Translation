import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_050_B {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");

    private int RETURN_CODE = 0;
    private String INP = "";
    private int maxlen = 0;
    private int cur = 0;
    private int i = 0;
    private int j = 0;
    private int len = 0;
    private String ans = "";
    private char[] T1 = new char[3600];
    private String INP2 = "";
    private int M = 0;
    private int P = 0;
    private int X = 0;
    private int sm = 0;
    private int tmp = 0;
    private int ZS = 0;
    private char DUMMY = ' ';

    public static void main(String[] args) {
        new ABC_050_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept maxlen
        System.out.print("Enter maxlen: ");
        maxlen = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        System.out.print("Enter INP: ");
        INP = scanner.nextLine();

        // Initialize sm
        sm = 48;

        // Perform loop
        for (int n0 = maxlen; n0 > 0; n0--) {
            j = cur;
            while (INP.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            System.arraycopy(INP.toCharArray(), cur, T1, i * 6, len);
            sm += Integer.parseInt(new String(T1, i * 6, len));
            cur = j + 1;
            i++;
        }

        // Accept M
        System.out.print("Enter M: ");
        M = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Perform loop
        i = 1;
        while (i <= M) {
            // Accept INP2
            System.out.print("Enter INP2: ");
            INP2 = scanner.nextLine();

            // Unstring INP2
            String[] parts = INP2.split(" ");
            P = Integer.parseInt(parts[0]);
            X = Integer.parseInt(parts[1]);

            // Subtract and add
            tmp = sm - Integer.parseInt(new String(T1, (P - 1) * 6, 6)) + X;
            ZS = tmp;

            // Perform UNANS
            unans();

            // Display ans
            System.out.println(ans);

            i++;
        }

        // Stop
        System.exit(RETURN_CODE);
    }

    private void unans() {
        // Unstring ZS
        String[] parts = String.valueOf(ZS).split(" ");
        DUMMY = parts[0].charAt(0);
        ans = parts[1];
    }
}