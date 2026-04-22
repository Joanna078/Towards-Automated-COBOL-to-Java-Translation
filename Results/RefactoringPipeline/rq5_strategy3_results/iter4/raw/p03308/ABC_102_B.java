```java
import java.util.Scanner;

public class ABC_102_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Read INP
        String INP = scanner.nextLine();

        // Initialize variables
        int maxlen = N;
        int cur = 0;
        int mn = Integer.MAX_VALUE;
        int mx = Integer.MIN_VALUE;

        // Process each number in INP
        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j < INP.length() && INP.charAt(j) != ' ') {
                j++;
            }
            if (j > cur) {
                int len = j - cur;
                String numStr = INP.substring(cur, cur + len);
                int A = Integer.parseInt(numStr);

                mn = Math.min(mn, A);
                mx = Math.max(mx, A);

                cur = j + 1;
            }
        }

        // Calculate difference
        int df = mx - mn;

        // Convert to string with leading zeros
        String ZS = String.format("%010d", df);

        // Extract the last 10 characters
        String ans = ZS.substring(ZS.length() - 10);

        // Output the result
        System.out.println(ans.trim());

        scanner.close();
    }
}
```