```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input values
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();

        // Working storage
        int[] a = new int[100];
        int p1 = 1;
        double wa = 0.0;
        StringBuilder out = new StringBuilder("         ");

        // Process input string
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 <= inp.length() && inp.charAt(p2 - 1) != ' ') {
                p2++;
            }
            a[i - 1] = Integer.parseInt(inp.substring(p1 - 1, p2 - 1));
            p1 = p2 + 1;
        }

        // Calculate average
        for (int value : Arrays.copyOf(a, n)) {
            wa += 1.0 / value;
        }

        // Compute result
        double result = 1.0 / wa;
        int i;
        for (i = 9; i >= 0; i--) {
            if (result == 0 || result % 10 != 0) {
                break;
            }
            result /= 10;
            out.setCharAt(i, ' ');
        }
        if (i == 4) {
            out.setCharAt(i, ' ');
        }

        // Output result
        System.out.println(out.toString().trim());
    }
}
```