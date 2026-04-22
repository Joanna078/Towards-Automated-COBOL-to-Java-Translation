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

        // Extract values from INP
        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            if (j > cur) { // Ensure there is a number to parse
                nk[i] = Integer.parseInt(inp.substring(cur, j));
            }
            cur = j + 1;
        }

        // Calculate X and ZS
        int x = nk[0] - nk[1] - 1;
        x /= nk[1];
        if ((nk[0] - nk[1]) % nk[1] != 0) {
            x++;
        }
        x++;

        // Convert X to string and extract last 6 characters
        String zs = String.format("%06d", x);
        String ans = zs.substring(zs.length() - 6);

        // Display result
        System.out.println(ans);
    }
}
```