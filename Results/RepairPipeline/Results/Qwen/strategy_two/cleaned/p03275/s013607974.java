import java.util.Arrays;
import java.util.Scanner;

public class ABC_107_D {
    private static final int INF = 1000000001;
    private static final int BNY = 2;
    private static int[] x = new int[100000];
    private static int[] s = new int[100000];
    private static int[] BT = new int[200001];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        String INP = scanner.nextLine();
        scanner.close();

        int M = N * 2 + 1;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        String ans = "";
        int d_ret = 0;

        while (i <= N) {
            j = cur;
            while (j <= INP.length() && INP.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            x[i] = Integer.parseInt(INP.substring(cur - 1, j - 1));
            cur = j + 1;
            i++;
        }

        setExternal();
        bisectMethod(N, INF, d_ret);

        System.out.println(ans);
    }

    private static void setExternal() {
        Arrays.fill(x, 0);
        Arrays.fill(s, 0);
        Arrays.fill(BT, 0);
    }

    private static void bisectMethod(int N, int INF, int d_ret) {
        int l = 0;
        int r = INF;
        int mid;
        int p = (N * (N + 1) + 3) / 4;

        while (r - l >= 0) {
            mid = (l + r) / 2;
            f(mid, d_ret);

            if (d_ret < mid) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
    }

    private static void f(int mid, int d_ret) {
        int prev = 0;
        for (int i = 1; i <= N; i++) {
            if (mid <= x[i]) {
                prev++;
            } else {
                prev--;
            }
            s[i] = prev;
        }

        Arrays.fill(BT, 0);
        bitAdd(0); // Assuming Z is meant to be 0 here
        int ret = 0;

        for (int i = 1; i <= N; i++) {
            int q_ret = bitQuery(s[i]);
            ret += q_ret;
            bitAdd(s[i]);
        }

        d_ret = ret;
    }

    private static void bitAdd(int x) {
        x += N + 1;
        while (x <= M) {
            BT[x]++;
            x += lowestBitVal(x);
        }
    }

    private static int bitQuery(int x) {
        x += N + 1;
        int ret = 0;
        while (x > 0) {
            ret += BT[x];
            x -= lowestBitVal(x);
        }
        return ret;
    }

    private static int lowestBitVal(int x) {
        int tmp = -1;
        int r = 0;
        while (x != 0) {
            x /= BNY;
            r++;
        }
        return (int) Math.pow(BNY, tmp);
    }
}