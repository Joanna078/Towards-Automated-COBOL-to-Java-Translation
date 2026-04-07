```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int cur = 0; // Change from 1 to 0
        int i = 1;
        int j;
        int len;
        int ans = 0;
        while (i <= n) {
            j = cur;
            while (j < s.length() && s.charAt(j) != ' ') { // Add length check
                j++;
            }
            if (j > cur) { // Ensure there is a number to parse
                len = j - cur;
                int x = Integer.parseInt(s.substring(cur, j)); // Adjust substring indices
                x = Math.min(x, k - x);
                ans += 2 * x;
            }
            cur = j + 1;
            i++;
        }
        System.out.println(ans);
    }
}
```