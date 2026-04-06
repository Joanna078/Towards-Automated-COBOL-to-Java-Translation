```java
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        // Input values
        int n = Integer.parseInt(System.console().readLine());
        String inp = System.console().readLine();

        // Working storage
        int[] tbl1 = new int[101];
        int p1 = 0;
        int p2;
        int i, j, k, lC = 0;
        int cnt = 0;
        int out;

        // Process input string
        for (i = 0; i < n; i++) {
            p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            tbl1[lC] = Integer.parseInt(inp.substring(p1, p2));
            p1 = p2 + 1;
            lC++;
        }

        // Sort table in descending order
        Arrays.sort(tbl1, 0, lC, Comparator.reverseOrder());

        // Count valid triangles
        for (i = 0; i < lC - 2; i++) {
            for (j = i + 1; j < lC - 1; j++) {
                for (k = j + 1; k < lC; k++) {
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
```