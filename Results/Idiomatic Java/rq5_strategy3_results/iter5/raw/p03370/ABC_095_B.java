```java
import java.util.Scanner;

public class ABC_095_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String inp = scanner.nextLine().trim();
        int maxlen = 2;
        int cur = 0;
        int i = 0;
        int len;
        long nx1[] = new long[maxlen];
        long tmp;
        int mn = 1001;
        int sm = 0;
        int x;
        String zs = "";

        // Process input
        for (int m = 0; m < maxlen; m++) {
            for (int j = cur; j < inp.length(); j++) {
                if (inp.charAt(j) == ' ') {
                    len = j - cur;
                    if (len > 0) { // Ensure substring is not empty
                        nx1[i] = Long.parseLong(inp.substring(cur, cur + len));
                    }
                    cur = j + 1;
                    i++;
                    break;
                }
            }
            if (cur < inp.length()) {
                len = inp.length() - cur;
                nx1[i] = Long.parseLong(inp.substring(cur, cur + len));
                i++;
            }
        }

        // Further processing
        for (int k = 1; k <= nx1[0]; k++) {
            int inp2 = scanner.nextInt();
            sm += inp2;
            mn = Math.min(mn, inp2);
        }

        tmp = nx1[1] - sm;
        x = (int) (tmp / mn);

        nx1[0] += x;
        zs = String.format("%09d", nx1[0]);

        // Unstring operation
        String[] parts = zs.split("\\s+");
        String ans = parts.length > 1 ? parts[1] : "";

        // Display result
        System.out.println(ans.trim());

        scanner.close();
    }
}
```