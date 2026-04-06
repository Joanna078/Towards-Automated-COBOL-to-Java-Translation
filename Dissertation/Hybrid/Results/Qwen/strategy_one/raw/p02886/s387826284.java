```java
import java.util.Arrays;

public class ProgramID {
    public static void main(String[] args) {
        // Input variables
        int n = Integer.parseInt(System.console().readLine());
        String ln = System.console().readLine();
        
        // Working storage
        char[] d = new char[100];
        int maxlen = 100;
        int cur = 0;
        int i = 0;
        int j;
        int k;
        int len;
        long ans = 0;
        StringBuilder zs = new StringBuilder();
        
        // Process input string
        while (cur < maxlen && ln.charAt(cur) != ' ') {
            j = cur;
            while (j < maxlen && ln.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            System.arraycopy(ln.toCharArray(), cur, d, i, len);
            cur = j + 1;
            i++;
        }

        // Calculate answer
        for (i = 0; i < 50; i++) {
            for (k = i + 1; k < 50; k++) {
                ans += (d[i] - '0') * (d[k] - '0');
            }
        }

        // Output result
        zs.append(ans);
        System.out.println(zs.toString().trim());
    }
}
```