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
        long[][] a = new long[n][m];
        int i = 0;
        while (i < n) {
            line = reader.readLine();
            int j = 0;
            for (String s : line.split(" ")) {
                if (j < m) { // Ensure we do not exceed the array bounds
                    a[i][j] = Long.parseLong(s);
                    j++;
                }
            }
            c[i] = Long.parseLong(line.split(" ")[0]);
            i++;
        }
        System.out.println(solve(n, m, x, c, a));
    }

    private static long solve(int n, int m, int x, long[] c, long[][] a) {
        long[] aw = new long[m];
        long[] cx = new long[4096];
        int l = 0;
        for (long mask = 1; mask < (1L << n); mask++) {
            Arrays.fill(aw, 0);
            long cw = 0;
            for (int i = 0; i < n; i++) {
                if (((mask >> i) & 1) == 1) {
                    cw += c[i];
                    for (int j = 0; j < m; j++) {
                        aw[j] += a[i][j];
                    }
                }
            }
            boolean ok = true;
            for (int i = 0; i < m; i++) {
                if (aw[i] < x) {
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