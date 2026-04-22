import java.util.Scanner;

public class ABC_102_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private int N;
    private String INP;
    private int maxlen;
    private int cur;
    private long i;
    private long j;
    private int len;
    private String ZS;
    private String ans;
    private int A;
    private int df;
    private int mn;
    private int mx;
    private char DUMMY;

    public static void main(String[] args) {
        ABC_102_B program = new ABC_102_B();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // ACCEPT N
        System.out.print("Enter N: ");
        N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // ACCEPT INP
        System.out.print("Enter INP: ");
        INP = scanner.nextLine();

        // Initialize variables
        maxlen = N;
        cur = 1;
        i = 1;
        j = 1;
        len = 0;
        ZS = "";
        ans = "";
        A = 0;
        df = 0;
        mn = 1000000001;
        mx = 48;
        DUMMY = ' ';

        // Process input
        for (int n = maxlen; n > 0; n--) {
            j = cur;
            while (INP.charAt((int) j - 1) != ' ') {
                j++;
            }
            len = (int) (j - cur);
            A = Integer.parseInt(INP.substring((int) cur - 1, (int) cur + len - 1));
            mn = Math.min(2, A);
            mx = Math.max(2, A);
            cur++;
            i++;
        }

        df = mx - mn;
        ZS = String.valueOf(df);

        // Unstring ZS
        String[] parts = ZS.split(" ");
        DUMMY = parts[0].charAt(0);
        ans = parts[1];

        // Display result
        System.out.println("Result: " + ans);

        // Stop run
        System.exit(returnCode);
    }
}