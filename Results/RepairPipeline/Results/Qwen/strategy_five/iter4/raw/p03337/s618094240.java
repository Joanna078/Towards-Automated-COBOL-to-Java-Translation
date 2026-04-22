```java
import java.util.Arrays;

public class ABC_098_A {
    public static void main(String[] args) {
        String inp = "1234567890"; // Simulating input acceptance
        int maxlen = 2;
        int cur = 1;
        long[] ab = new long[2];
        int i = 0;

        while (i < maxlen) {
            int j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }

            int len = j - cur;
            if (len > 0) { // Ensure there is something to parse
                ab[i] = Long.parseLong(inp.substring(cur - 1, cur - 1 + len));
            }

            cur = j + 1;
            i++;
        }

        long ans = Math.max(ab[0] + ab[1], Math.max(ab[0] - ab[1], ab[0] * ab[1]));
        System.out.println(ans);
    }
}
```