```java
import java.util.Scanner;

public class ABC_095_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        String inp = scanner.nextLine().trim();
        int inp2;
        int len = 0;
        int cur = 1;
        int maxlen = 2;
        int[] nx = new int[2];
        int tmp = 0;
        int mn = 1001;
        int sm = 0;
        int x = 0;
        String ans = "";

        // Process input to extract numbers
        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j <= inp.length() && !inp.substring(j - 1, j).equals(" ")) {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                nx[i] = Integer.parseInt(inp.substring(cur - 1, cur - 1 + len));
                cur = j + 1;
            }
        }

        // Process second input and calculate values
        for (int k = 1; k <= nx[0]; k++) {
            inp2 = scanner.nextInt();
            sm += inp2;
            mn = Math.min(mn, inp2);
        }

        // Calculate final result
        tmp = nx[1] - sm;
        x = tmp / mn;
        nx[0] += x;
        ans = String.valueOf(nx[0]);

        // Display result
        System.out.println(ans);

        scanner.close();
    }
}
```