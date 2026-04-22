```java
import java.util.Arrays;

public class ABC_103_A {
    public static void main(String[] args) {
        String inp = "123 456 789"; // Simulating input
        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        char[] ans = new char[3];
        int[] A = new int[maxlen];
        int tmp;
        int sm = 0;

        while (cur <= inp.length()) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) { // Ensure we don't parse empty strings
                A[i - 1] = Integer.parseInt(inp.substring(cur - 1, j).trim());
            }
            cur = j + 1;
            i++;
        }

        for (i = 1; i <= 3; i++) {
            j = i + 1;
            while (j <= 3) {
                if (A[j - 1] < A[i - 1]) {
                    tmp = A[i - 1];
                    A[i - 1] = A[j - 1];
                    A[j - 1] = tmp;
                }
                j++;
            }
        }

        sm += A[1] - A[0];
        sm += A[2] - A[0];

        String zs = String.format("%04d", sm);
        String dummy = "";
        System.arraycopy(zs.toCharArray(), 0, ans, 0, Math.min(zs.length(), ans.length));

        System.out.println(new String(ans).trim());
    }
}
```