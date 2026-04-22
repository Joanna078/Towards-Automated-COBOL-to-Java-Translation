```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        // Input from user
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // Initialize arrays
        char[] inp = new char[2_200_000];
        Arrays.fill(inp, ' ');
        int[] tbl1 = new int[200_000];
        int[] tbl2 = new int[200_000];
        int p1 = 1;
        int p2 = 1;
        int i = 1;
        long cnt = 0;
        StringBuilder out = new StringBuilder();

        // Read input string
        scanner.nextLine().getChars(0, n, inp, 0);

        // Process input
        while (i <= n) {
            while (p2 <= n && inp[p2 - 1] != ' ') {
                p2++;
            }
            String subStr = new String(Arrays.copyOfRange(inp, p1 - 1, p2 - 1));
            int len = subStr.length();
            if (i > len) {
                tbl2[i - len]++;
            }
            tbl1[i - 1] = len; // Store length in tbl1
            p1 = p2 + 1;
            i++;
        }

        // Calculate result
        i = 1;
        while (i <= n - 2) {
            if (i + tbl1[i - 1] <= n) {
                cnt += tbl2[i + tbl1[i - 1]];
            }
            i++;
        }

        // Output result
        out.append(cnt);
        System.out.println(out.toString());
    }
}
```