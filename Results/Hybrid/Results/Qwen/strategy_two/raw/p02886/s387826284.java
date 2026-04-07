```java
import java.util.Arrays;
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        // Input variables
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String ln = scanner.nextLine();
        
        // Working storage
        char[] d = new char[100];
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int j;
        int k;
        int len;
        long ans = 0;
        StringBuilder zs = new StringBuilder();
        
        // Process input string
        while (cur <= maxlen && ln.charAt(cur - 1) != ' ') {
            j = cur;
            while (j <= maxlen && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            System.arraycopy(ln.toCharArray(), cur - 1, d, i - 1, len);
            cur = j + 1;
            i++;
        }

        // Calculate answer
        for (i = 1; i < 50; i++) {
            for (k = i + 1; k < 50; k++) {
                ans += d[i - 1] * d[k - 1];
            }
        }

        // Output result
        zs.append(ans);
        System.out.println(zs.toString().trim());
        
        scanner.close();
    }
}
```