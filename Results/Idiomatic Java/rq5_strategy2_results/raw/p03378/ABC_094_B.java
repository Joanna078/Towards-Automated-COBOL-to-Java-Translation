```java
import java.util.Scanner;

public class ABC_094_B {

    private static final int MAXLEN = 3;
    private static final int ARRAY_SIZE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        String inp = scanner.nextLine().trim();
        String inp2 = scanner.nextLine().trim();

        int[] nmx = new int[MAXLEN];
        int cur = 0;
        int i = 0;

        // Process first input
        for (int j = 0; j < inp.length(); j++) {
            if (inp.charAt(j) == ' ') {
                if (j - cur > 0) {
                    nmx[i] = Integer.parseInt(inp.substring(cur, j));
                    i++;
                }
                cur = j + 1;
            }
        }
        if (cur < inp.length()) {
            nmx[i] = Integer.parseInt(inp.substring(cur));
        }

        // Process second input
        int[] a = new int[ARRAY_SIZE];
        cur = 0;
        for (int j = 0; j < inp2.length(); j++) {
            if (inp2.charAt(j) == ' ') {
                if (j - cur > 0) {
                    int x = Integer.parseInt(inp2.substring(cur, j));
                    a[x]++;
                }
                cur = j + 1;
            }
        }
        if (cur < inp2.length()) {
            int x = Integer.parseInt(inp2.substring(cur));
            a[x]++;
        }

        // Calculate minimum sum
        int tmp = 0;
        int sm = 101;
        for (int m = nmx[2]; m < nmx[0]; m++) {
            tmp += a[m];
        }
        sm = Math.min(sm, tmp);

        tmp = 0;
        for (int n = nmx[2]; n >= 0; n--) {
            tmp += a[n];
        }
        sm = Math.min(sm, tmp);

        // Output result
        System.out.printf("%03d%n", sm);
    }
}
```