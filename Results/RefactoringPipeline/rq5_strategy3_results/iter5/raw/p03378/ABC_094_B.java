```java
import java.util.Scanner;

public class ABC_094_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        String inp = scanner.nextLine().trim();
        String inp2 = scanner.nextLine().trim();

        int maxlen = 3;
        int cur = 0;
        int i = 0;
        int[] nmx = new int[3];
        int[] a = new int[100];

        // Process first input
        for (int k = 0; k < maxlen; k++) {
            while (cur < inp.length() && inp.charAt(cur) != ' ') {
                cur++;
            }
            int len = cur - (k == 0 ? 0 : nmx[k - 1] + 1);
            if (len > 0) {
                nmx[i] = Integer.parseInt(inp.substring(nmx[k - 1] + 1, cur));
            }
            cur++;
            i++;
        }

        cur = 0;
        maxlen = nmx[1];
        i = 0;

        // Process second input
        for (int k = 0; k < maxlen; k++) {
            while (cur < inp2.length() && inp2.charAt(cur) != ' ') {
                cur++;
            }
            int len = cur - (k == 0 ? 0 : nmx[k - 1] + 1);
            if (len > 0) {
                int x = Integer.parseInt(inp2.substring(nmx[k - 1] + 1, cur));
                a[x - 1]++;
            }
            cur++;
        }

        int tmp = 0;
        int sm = 101;

        // Calculate sum from NMX[2] to NMX[0]
        for (int m = nmx[2]; m >= nmx[0]; m--) {
            tmp += a[m - 1];
        }
        sm = Math.min(sm, tmp);

        tmp = 0;

        // Calculate sum from NMX[2] to 0
        for (int n = nmx[2]; n > 0; n--) {
            tmp += a[n - 1];
        }
        sm = Math.min(sm, tmp);

        String zs = String.format("%03d", sm);

        // Extract the last three characters
        String ans = zs.substring(Math.max(0, zs.length() - 3));

        System.out.println(ans);
    }
}
```