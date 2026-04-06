```java
import java.util.Arrays;

public class ABC_094_B {
    public static void main(String[] args) {
        String inp = "your_input_here"; // Replace with actual input
        String inp2 = "your_input_here"; // Replace with actual input

        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int j;

        int[] nmx = new int[3];
        int[] a = new int[100];

        int len;
        char[] ans = new char[3];
        char[] dummy = new char[1];

        while (i <= maxlen) {
            j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len <= 3) { // Ensure we do not copy more than 3 characters
                System.arraycopy(inp.toCharArray(), cur - 1, ans, 0, len);
            }
            nmx[i - 1] = Integer.parseInt(new String(ans, 0, len));
            cur = j + 1;
            i++;
        }

        cur = 1;
        maxlen = nmx[1];
        while (cur <= inp2.length()) {
            j = cur;
            while (j <= inp2.length() && inp2.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            int x = Integer.parseInt(inp2.substring(cur - 1, j));
            a[x] = 1;
            cur = j + 1;
        }

        int tmp = 0;
        for (int k = nmx[2]; k >= nmx[0]; k--) {
            tmp += a[k];
        }
        int sm = tmp;

        tmp = 0;
        for (int k = nmx[2]; k > 0; k--) {
            tmp += a[k];
        }
        sm = Math.min(sm, tmp);

        char zs = (char) sm;

        unans(zs, dummy, ans);

        System.out.println(new String(ans).trim());
    }

    private static void unans(char zs, char[] dummy, char[] ans) {
        StringBuilder sb = new StringBuilder();
        sb.append(zs);
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.indexOf(" "));
        }
        System.arraycopy(sb.toString().toCharArray(), 0, ans, 0, Math.min(sb.length(), 3)); // Ensure we do not copy more than 3 characters
    }
}
```