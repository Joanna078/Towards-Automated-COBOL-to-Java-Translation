```java
import java.util.Arrays;
import java.util.Scanner;

public class Refactored175B {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scanner.nextLine().trim());
        String inp = scanner.nextLine().trim();

        long[] tbl1 = new long[101];
        long[] tbl2 = new long[100];
        int[] k2 = new int[100];

        int p1 = 0;
        int p2 = 0;
        int i = 0;

        // Split input string into numbers
        while (i < n) {
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            tbl1[i] = Long.parseLong(inp.substring(p1, p2));
            p1 = p2 + 1;
            i++;
        }

        // Sort tbl1 in descending order
        Arrays.sort(tbl1);
        for (int j = 0; j < n / 2; j++) {
            long temp = tbl1[j];
            tbl1[j] = tbl1[n - 1 - j];
            tbl1[n - 1 - j] = temp;
        }

        int lC = 1;
        tbl2[lC - 1] = tbl1[0];
        k2[lC - 1] = 1;

        // Group identical numbers
        for (i = 0; i < n - 1; i++) {
            if (tbl1[i + 1] < tbl1[i] && tbl1[i + 1] > 0) {
                lC++;
                tbl2[lC - 1] = tbl1[i + 1];
                k2[lC - 1] = 1;
            } else {
                k2[lC - 1]++;
            }
        }

        long cnt = 0;

        // Count valid triangles
        for (i = 0; i < lC; i++) {
            for (int j = i + 1; j < lC; j++) {
                for (int k = j + 1; k < lC; k++) {
                    if (tbl2[i] + tbl2[j] > tbl2[k] &&
                        tbl2[j] + tbl2[k] > tbl2[i] &&
                        tbl2[k] + tbl2[i] > tbl2[j]) {
                        cnt += k2[i] * k2[j] * k2[k];
                    }
                }
            }
        }

        System.out.println(String.format("%05d", cnt));
    }
}
```