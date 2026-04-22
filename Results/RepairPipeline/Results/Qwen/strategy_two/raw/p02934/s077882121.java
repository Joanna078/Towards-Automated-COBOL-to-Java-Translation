```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input values
        int n = Integer.parseInt(System.console().readLine());
        String inp = System.console().readLine();

        // Working storage
        int[] a = new int[100];
        int p1 = 1;
        int wa = 0;
        StringBuilder out = new StringBuilder("         ");

        // Process input string
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 <= n && inp.charAt(p2 - 1) != ' ') {
                p2++;
            }
            a[i - 1] = Integer.parseInt(inp.substring(p1 - 1, p2 - 1));
            p1 = p2 + 1;
        }

        // Calculate average
        for (int value : a) {
            wa += 1.0 / value;
        }

        // Compute result
        double result = 1.0 / wa;
        for (int i = 9; i >= 0; i--) {
            if (result == 0 || result % 10 != 0) {
                break;
            }
            result /= 10;
            out.setCharAt(i, ' ');
        }
        if (result == 0 || result % 10 != 0) {
            out.setCharAt(4, ' ');
        }

        // Output result
        System.out.println(out.toString().trim());
    }
}
```