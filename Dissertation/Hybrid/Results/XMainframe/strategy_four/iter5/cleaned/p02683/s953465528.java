import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        int m = Integer.parseInt(line.split(" ")[1]);
        int x = Integer.parseInt(line.split(" ")[2]);
        long[] c = new long[n];
        int[][] a = new int[n][m];
        int i = 0;
        while (i < n) {
            line = reader.readLine();
            int j = 0;
            for (String s : line.split(" ")) {
                if (j < m) { // Ensure we do not exceed array bounds
                    if (i == 0) {
                        c[j] = Long.parseLong(s);
                    } else {
                        a[i - 1][j] = Integer.parseInt(s);
                    }
                    j++;
                }
            }
            i++;
        }
        System.out.println(solve(n, m, x, c, a));
    }

    private static long solve(int n, int m, int x, long[] c, int[][] a) {
        long[] cx = new long[1 << n];
        int l = 0;
        for (long mask = 1; mask < (1L << n); mask++) {
            long[] aw = new long[m];
            long cw = 0;
            int idx = 0;
            long sho = mask;
            while (sho != 0 || idx < n) {
                if ((sho & 1) == 1) {
                    cw += c[idx];
                    for (int j = 0; j < m; j++) {
                        aw[j] += a[idx][j];
                    }
                }
                sho >>= 1;
                idx++;
            }
            boolean ok = true;
            for (int j = 0; j < m; j++) {
                if (aw[j] < x) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                cx[l++] = cw;
            }
        }
        Arrays.sort(cx, 0, l);
        return l > 0 ? cx[0] : -1;
    }
}