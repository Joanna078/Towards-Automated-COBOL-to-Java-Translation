import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        long x = Long.parseLong(parts[2]);

        long[][] tbl1 = new long[n][m + 1];
        long[] tbl2 = new long[m + 1];
        long[] cx = new long[1 << n];
        int l = 0;

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            for (int j = 0; j <= m; j++) {
                tbl1[i][j] = Long.parseLong(numbers[j]);
            }
        }

        for (int i = 0; i < (1 << n); i++) {
            Arrays.fill(tbl2, 0);
            int idx = 1;
            int sho = i;
            int amr;
            do {
                amr = sho % 2;
                if (amr == 1) {
                    tbl2[idx - 1] += tbl1[i][idx - 1];
                }
                for (int j = 0; j < m && amr != 0; j++) {
                    tbl2[j] += tbl1[i][idx - 1];
                }
                sho /= 2;
                idx++;
            } while (sho != 0 || amr != 0);

            int j = 0;
            while (j < m && tbl2[j] < x) {
                j++;
            }

            if (j >= m) {
                l++;
                cx[l - 1] = tbl2[0]; // Adjusted index to be zero-based
            }
        }

        Arrays.sort(cx, 0, l);

        System.out.println(l == 0 ? -1 : cx[0]);
        scanner.close();
    }
}