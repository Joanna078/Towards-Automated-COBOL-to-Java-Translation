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
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = scanner.nextInt();
        }
        scanner.nextLine(); // Consume newline

        // Initialize table 2
        int[] hm = new int[n];

        // Process table 2
        for (int i = 0; i < m; i++) {
            inw = scanner.nextLine();
            parts = inw.split(" ");
            int a = Integer.parseInt(parts[0]);
            int b = Integer.parseInt(parts[1]);
            if (hm[a - 1] < h[b - 1]) {
                hm[a - 1] = h[b - 1];
            }
            if (hm[b - 1] < h[a - 1]) {
                hm[b - 1] = h[a - 1];
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