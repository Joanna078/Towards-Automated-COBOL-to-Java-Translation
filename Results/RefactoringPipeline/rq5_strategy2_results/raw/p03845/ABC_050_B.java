```java
import java.util.Scanner;

public class ABC_050_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept maxlen
        int maxlen = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String inp = scanner.nextLine();

        int sm = 0;
        int cur = 1;
        int i = 1;
        int[] t = new int[600];

        // Process input string
        for (int n = 0; n < maxlen; n++) {
            int j = cur;
            while (j <= inp.length() && !inp.substring(j - 1, j).equals(" ")) {
                j++;
            }
            int len = j - cur;
            t[i - 1] = Integer.parseInt(inp.substring(cur - 1, cur - 1 + len));
            sm += t[i - 1];
            cur = j + 1;
            i++;
        }

        // Accept M
        int m = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Process further input
        for (int k = 0; k < m; k++) {
            String inp2 = scanner.nextLine();
            String[] parts = inp2.split("\\s+");
            int p = Integer.parseInt(parts[0]);
            int x = Integer.parseInt(parts[1]);

            sm -= t[p - 1];
            sm += x;

            String zs = String.format("%08d", sm);
            String ans = zs.substring(1); // Remove leading zero

            System.out.println(ans);
        }

        scanner.close();
    }
}
```