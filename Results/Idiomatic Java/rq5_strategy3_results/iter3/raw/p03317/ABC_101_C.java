```java
import java.util.Scanner;

public class ABC_101_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        String inp = scanner.nextLine();
        scanner.nextLine(); // Consume the second line which is not used

        // Initialize variables
        int maxlen = 2;
        int cur = 0;
        int[] nk = new int[maxlen];

        // Process input
        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            if (j > cur) { // Check to avoid parsing empty string
                nk[i] = Integer.parseInt(inp.substring(cur, j));
            }
            cur = j + 1;
        }

        // Calculate result
        int x = nk[0] - nk[1] - 1;
        int r = x % (nk[1] - 1);
        if (r != 0) {
            x /= (nk[1] - 1) + 1;
        } else {
            x /= (nk[1] - 1);
        }
        x++;

        // Convert to string
        String zs = String.format("%06d", x);

        // Extract answer
        String ans = zs.substring(1);

        // Display result
        System.out.println(ans.trim());

        scanner.close();
    }
}
```