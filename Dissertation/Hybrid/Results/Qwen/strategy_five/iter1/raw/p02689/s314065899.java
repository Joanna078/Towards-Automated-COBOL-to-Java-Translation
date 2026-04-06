```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input from user
        String inw = scanner.nextLine();
        String[] parts = inw.split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        // Read data from standard input
        int[] h = new int[100000];
        String inp = scanner.nextLine(); // Read the entire line of input at once
        int p1 = 0;
        for (int i = 0; i < n; i++) {
            int p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            h[i] = Integer.parseInt(inp.substring(p1, p2));
            p1 = p2 + 1;
        }

        // Initialize table 2
        int[] hm = new int[100000];

        // Process table 2
        for (int i = 0; i < m; i++) {
            inw = scanner.nextLine();
            parts = inw.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            if (hm[a] < h[b]) {
                hm[a] = h[b];
            }
            if (hm[b] < h[a]) {
                hm[b] = h[a];
            }
        }

        // Count differences
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (h[i] > hm[i]) {
                cnt++;
            }
        }

        // Output result
        System.out.println(cnt);
    }
}
```