```java
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int re = 10000;
        int n = scanner.nextInt();
        int now = 1;
        n++;
        scanner.nextLine(); // Consume newline
        String inp = scanner.nextLine();

        int[] a = new int[200];
        int temp1, temp2, temp3, mod, r, s;

        // First loop to process input
        for (s = 1; s <= n; s++) {
            temp1 = now;
            while (temp1 <= inp.length() && inp.charAt(temp1 - 1) != ' ') {
                temp1++;
            }
            temp2 = temp1 - now;
            a[s - 1] = Integer.parseInt(inp.substring(now - 1, temp1 - 1));
            now = temp1 + 1;
        }

        // Second loop to process array elements
        for (s = 1; s <= n; s++) {
            r = a[s - 1] / 2;
            mod = a[s - 1] - r * 2;
            temp3 = 0;
            while (mod != 1) {
                r = a[s - 1] / 2;
                mod = a[s - 1] - r * 2;
                a[s - 1] = r;
                temp3++;
            }
            if (temp3 > 0) {
                temp3--;
            }
            if (temp3 < re) {
                re = temp3;
            }
        }

        // Output result
        System.out.println(re);
    }
}
```