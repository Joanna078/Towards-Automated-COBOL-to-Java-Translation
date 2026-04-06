import java.util.Scanner;

public class ABC_107_D {
    static int INF = 1000000001;
    static int BNY = 2;
    static int Z = 0;
    static int N;
    static int M;
    static String INP;
    static int cur = 1;
    static long i = 1;
    static long j;
    static int len;
    static String ans = new String(new char[10]);
    static int d_ret;
    static int[] x = new int[100000];
    static String ZS = new String(new char[11]);
    static char DUMMY;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        INP = scanner.nextLine().trim(); // Trim to remove leading/trailing whitespace

        M = N * 2 + 1;
        initializeX1();

        for (int XX1 = 1; XX1 <= N; XX1++) {
            for (j = cur; j <= INP.length() && !INP.substring((int) j - 1, (int) j).equals(" "); j++) ;
            len = (int) (j - cur);
            if (len > 0) { // Check to avoid parsing empty string
                x[XX1 - 1] = Integer.parseInt(INP.substring(cur - 1, cur + len - 1));
            }
            cur = (int) (j + 1);
        }

        SET_EXTERNAL();
        BISECTION_METHOD(0, INF);

        UNANS();
        System.out.println(ans.substring(0, ans.length()));
    }

    private static void initializeX1() {
        for (int i = 0; i < x.length; i++) {
            x[i] = 0;
        }
    }

    private static void SET_EXTERNAL() {
        INF = 1000000001;
        BNY = 2;
        Z = 0;
    }

    private static void BISECTION_METHOD(int d_l, int d_r) {
        int l = d_l;
        int r = d_r;
        int tmp = INF;
        int p = N * (N + 1) + 3;
        p /= 4;

        while (tmp >= 0) {
            int mid = (l + r) / 2;
            d_ret = F(mid);
            if (p <= d_ret) {
                d_ret = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
            tmp = r - l;
        }
    }

    private static int F(int d_mid) {
        int prev = 0;
        for (int SX1 = 1; SX1 <= N; SX1++) {
            if (d_mid <= x[SX1 - 1]) {
                prev++;
            } else {
                prev--;
            }
            // Assuming s array is defined similarly to x
            // s[SX1 - 1] = prev;
        }

        // Assuming BT array is defined similarly to x
        // Initialize BT array
        // for (int BX1 = 1; BX1 <= M; BX1++) {
        //     BT[BX1 - 1] = 0;
        // }

        // Assuming BIT_ADD and BIT_QUERY methods are implemented
        // BIT_ADD(Z);
        int ret = 0;
        for (int SX1 = 1; SX1 <= N; SX1++) {
            // int q_ret = BIT_QUERY(s[SX1 - 1]);
            // ret += q_ret;
            // BIT_ADD(s[SX1 - 1]);
        }
        return ret;
    }

    private static void UNANS() {
        String[] parts = ZS.split("\\s+");
        if (parts.length > 1) {
            DUMMY = parts[0].charAt(0);
            ans = parts[1];
        }
    }
}