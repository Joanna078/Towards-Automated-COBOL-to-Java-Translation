```java
import java.util.Scanner;

public class ABC_094_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        String inp = scanner.nextLine().trim();
        String inp2 = scanner.nextLine().trim();

        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int j = 0;
        int len = 0;
        int[] NMX = new int[3];
        int[] A = new int[100];
        int x = 0;
        int tmp = 0;
        int sm = 101;
        String ans = "";

        // Process INP
        for (int k = 0; k < maxlen; k++) {
            j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            NMX[i - 1] = Integer.parseInt(inp.substring(cur - 1, cur - 1 + len));
            cur = j + 1;
            i++;
        }

        cur = 1;
        maxlen = NMX[1];
        i = 1;

        // Process INP2
        for (int k = 0; k < maxlen; k++) {
            j = cur;
            while (j <= inp2.length() && inp2.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            x = Integer.parseInt(inp2.substring(cur - 1, cur - 1 + len));
            A[x - 1] = 1;
            cur = j + 1;
        }

        tmp = 0;
        for (int m = NMX[2]; m >= NMX[0]; m--) {
            tmp += A[m - 1];
        }
        sm = Math.min(sm, tmp);

        tmp = 0;
        for (int n = NMX[2]; n > 0; n--) {
            tmp += A[n - 1];
        }
        sm = Math.min(sm, tmp);

        ans = String.format("%03d", sm);

        // Output the result
        System.out.println(ans.trim());
    }
}
```