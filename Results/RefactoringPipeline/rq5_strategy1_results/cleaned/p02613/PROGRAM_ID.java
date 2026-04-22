import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private int returnCode = 0;
    private int i, k, maxlen, cur, len, ix;
    private String N = "0000000000";
    private String num = "0000000004";
    private String ans = "            ";
    private String idx = "0000000000";
    private String S = "   ";
    private String C1 = "00000000000000000000000000000000";
    private String j1 = "AC WA TLERE ";
    private String mul = " x ";
    private String zs = "0000000000";

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        if (!initialized) {
            initialized = true;
            maxlen = 100;
            cur = 1;
            i = 1;
            k = 1;
            len = 0;
            ix = 1;
            N = "0000000000";
            num = "0000000004";
            ans = "            ";
            idx = "0000000000";
            S = "   ";
            for (int i1 = 1; i1 <= 4; i1++) {
                C1 = C1.substring(0, 8 * (i1 - 1)) + "00000000" + C1.substring(8 * i1);
            }
            j1 = "AC WA TLERE ";
            mul = " x ";
        }

        // Main section
        System.out.print("Enter a number: ");
        N = scanner.nextLine();

        for (i = 1; i <= Integer.parseInt(N); i++) {
            System.out.print("Enter a string: ");
            S = scanner.nextLine();

            ix = 1;
            for (; ix <= 4; ix++) {
                if (S.substring(0, 3).equals(j1.substring(3 * (ix - 1), 3 * ix))) {
                    idx = String.format("%010d", ix);
                    int value = Integer.parseInt(C1.substring(8 * (ix - 1), 8 * ix)) + 1;
                    C1 = C1.substring(0, 8 * (ix - 1)) + String.format("%08d", value) + C1.substring(8 * ix);
                    ix++;
                    break;
                }
            }
        }

        for (i = 1; i <= Integer.parseInt(num); i++) {
            ans = "            ";
            zs = C1.substring(8 * (i - 1), 8 * i);
            ans = j1.substring(3 * (i - 1), 3 * i) + mul + zs;
            System.out.println(ans.trim());
        }

        scanner.close();
    }
}