import java.util.Scanner;

public class ABC_107_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String INP = scanner.nextLine().trim();

        int[] x = new int[N];
        int cur = 1;
        int len = 0;
        for (int i = 0; i < N; i++) {
            while (cur <= INP.length() && INP.charAt(cur - 1) != ' ') {
                cur++;
            }
            len = cur - 1;
            x[i] = Integer.parseInt(INP.substring(cur - len, cur));
            cur++;
        }

        int INF = 1000000001;
        int BNY = 2;
        int Z = 0;

        int d_ret = bisectionMethod(N, INF, BNY, Z, x);

        String ZS = String.format("%011d", d_ret);
        String ans = ZS.replaceFirst("^0+(?!$)", "");

        System.out.println(ans);
    }

    private static int bisectionMethod(int N, int INF, int BNY, int Z, int[] x) {
        int l = 0;
        int r = INF;
        int tmp = INF;
        int p = (N * (N + 1) + 3) / 4;
        int ret = 0;

        while (tmp > 0) {
            int mid = (l + r) / 2;
            int d_ret = f(mid, N, BNY, Z, x);

            if (p <= d_ret) {
                ret = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }

            tmp = r - l;
        }

        return ret;
    }

    private static int f(int d_mid, int N, int BNY, int Z, int[] x) {
        int prev = 0;
        int[] s = new int[N];
        for (int i = 0; i < N; i++) {
            if (d_mid <= x[i]) {
                prev++;
            } else {
                prev--;
            }
            s[i] = prev;
        }

        int[] BT = new int[200001];
        for (int i = 0; i < BT.length; i++) {
            BT[i] = 0;
        }

        bitAdd(Z, N, BNY, BT);

        int ret = 0;
        for (int i = 0; i < N; i++) {
            int q_ret = bitQuery(s[i], N, BNY, BT);
            ret += q_ret;
            bitAdd(s[i], N, BNY, BT);
        }

        return ret;
    }

    private static void bitAdd(int d_x, int N, int BNY, int[] BT) {
        int x = d_x + N + 1;
        int tmp = 0;

        while (x > 0) {
            BT[x]++;
            lowestBitVal(x, BNY, tmp);
            x += tmp;
        }
    }

    private static int bitQuery(int d_x, int N, int BNY, int[] BT) {
        int x = d_x + N + 1;
        int tmp = 0;
        int d_ret = 0;

        while (x > 0) {
            d_ret += BT[x];
            lowestBitVal(x, BNY, tmp);
            x -= tmp;
        }

        return d_ret;
    }

    private static void lowestBitVal(int d_x, int BNY, int tmp) {
        tmp = -1;
        int r = 0;
        int x = d_x;

        while (r != 1) {
            x /= BNY;
            r = x % BNY;
            tmp++;
        }

        tmp = (int) Math.pow(BNY, tmp);
    }
}