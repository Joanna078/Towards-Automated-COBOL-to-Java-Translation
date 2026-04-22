import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Input values
        int n = Integer.parseInt(System.console().readLine());
        String inp = System.console().readLine();

        // Working storage
        char[] tbl1 = new char[101];
        int p1 = 1;
        int p2;
        int i, j, k, lC = 1;
        int cnt = 0;
        int out;

        // Process input string
        for (i = 1; i <= n; i++) {
            p2 = p1;
            while (p2 <= n && inp.charAt(p2 - 1) != ' ') {
                p2++;
            }
            tbl1[lC] = inp.charAt(p1 - 1);
            p1 = p2 + 1;
            lC++;
        }

        // Sort table in descending order
        Arrays.sort(tbl1, lC, 1, Comparator.reverseOrder());

        // Count valid triangles
        for (i = 1; i <= lC - 2; i++) {
            for (j = i + 1; j <= lC - 1; j++) {
                for (k = j + 1; k <= lC; k++) {
                    if ((tbl1[i] + tbl1[j] > tbl1[k]) &&
                        (tbl1[j] + tbl1[k] > tbl1[i]) &&
                        (tbl1[k] + tbl1[i] > tbl1[j])) {
                        cnt += 1;
                    }
                }
            }
        }

        // Output result
        out = cnt;
        System.out.println(out);
    }
}