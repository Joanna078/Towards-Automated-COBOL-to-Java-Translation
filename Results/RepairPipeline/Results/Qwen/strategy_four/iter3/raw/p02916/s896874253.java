```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine().trim());
        String ln = scanner.nextLine();
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int ans = 0;
        int zs = 0;
        n--;
        int[] A = new int[100];
        int[] B = new int[100];
        int[] C = new int[100];

        // First loop
        while (cur <= maxlen && cur <= ln.length()) {
            j = cur;
            while (j <= maxlen && j <= ln.length() && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                A[i] = Integer.parseInt(ln.substring(cur - 1, cur + len - 1).trim());
                cur = j + 1;
                i++;
            } else {
                break;
            }
        }

        // Second loop
        cur = 1;
        i = 1;
        while (cur <= maxlen && cur <= ln.length()) {
            j = cur;
            while (j <= maxlen && j <= ln.length() && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                B[i] = Integer.parseInt(ln.substring(cur - 1, cur + len - 1).trim());
                ans += B[i];
                cur = j + 1;
                i++;
            } else {
                break;
            }
        }

        // Third loop
        cur = 1;
        i = 1;
        while (cur <= maxlen && cur <= ln.length()) {
            j = cur;
            while (j <= maxlen && j <= ln.length() && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                C[i] = Integer.parseInt(ln.substring(cur - 1, cur + len - 1).trim());
                cur = j + 1;
                i++;
            } else {
                break;
            }
        }

        // Fourth loop
        for (i = 2; i <= n; i++) {
            if (A[i - 1] + 1 == A[i]) {
                ans += C[A[i - 1]];
            }
        }

        zs = ans;
        System.out.println(String.format("%d", zs));
        scanner.close();
    }
}
```