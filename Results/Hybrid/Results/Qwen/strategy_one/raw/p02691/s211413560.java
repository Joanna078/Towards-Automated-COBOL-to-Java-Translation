```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Input from user
        int n = Integer.parseInt(System.console().readLine());

        // Initialize arrays
        char[] inp = new char[n];
        Arrays.fill(inp, ' ');
        int[] tbl1 = new int[n];
        int[] tbl2 = new int[n];
        int p1 = 0;
        int p2 = 0;
        int i = 0;
        long cnt = 0;
        StringBuilder out = new StringBuilder();

        // Read input string
        System.in.read(inp);

        // Process input
        while (i < n) {
            while (p2 < n && inp[p2] != ' ') {
                p2++;
            }
            String subStr = new String(Arrays.copyOfRange(inp, p1, p2));
            int len = subStr.length();
            if (i + len < n) {
                tbl2[i + len]++;
            }
            p1 = p2 + 1;
            i = p2;
        }

        // Calculate result
        i = 0;
        while (i < n - 2) {
            if (i + tbl1[i] < n) {
                cnt += tbl2[i + tbl1[i]];
            }
            i++;
        }

        // Output result
        out.append(cnt);
        System.out.println(out.toString());
    }
}
```