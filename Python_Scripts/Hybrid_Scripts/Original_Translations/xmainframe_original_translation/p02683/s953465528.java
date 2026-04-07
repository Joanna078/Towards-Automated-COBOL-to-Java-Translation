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
        int[][] a = new int[n][m];
        int i = 0;
        while (i < n) {
            line = reader.readLine();
            int j = 0;
            for (String s : line.split(" ")) {
                a[i][j] = Integer.parseInt(s);
                j++;
            }
            i++;
        }
        System.out.println(solve(n, m, x, a));
    }

    private static int solve(int n, int m, int x, int[][] a) {
        long[] c = new long[n];
        long[] w = new long[n];
        int l = 0;
        for (long mask = 1; mask < (1L << n); mask++) {
            Arrays.fill(w, 0);
            for (int i = 0; i < n; i++) {
                if (((mask >> i) & 1) == 1) {
                    for (int j = 0; j < m; j++) {
                        w[j] += a[i][j];
                    }
                    c[i] = mask;
                }
            }
            boolean ok = true;
            for (int i = 0; i < m; i++) {
                if (w[i] < x) {
                    ok = false;
                    break;
                }
            }
            if (ok) {
                l++;
                long min = Long.MAX_VALUE;
                for (int i = 0; i < n; i++) {
                    if (((mask >> i) & 1) == 1) {
                        min = Math.min(min, w[i]);
                    }
                }
                for (int i = 0; i < n; i++) {
                    if (((mask >> i) & 1) == 1) {
                        w[i] -= min;
                    }
                }
            }
        }
        return l;
    }
}
