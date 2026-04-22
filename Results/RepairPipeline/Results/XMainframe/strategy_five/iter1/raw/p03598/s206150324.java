```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.nextLine(); // Consume newline
        String s = sc.nextLine();
        int cur = 0;
        int i = 1;
        int j;
        int len;
        int ans = 0;
        while (i <= n) {
            j = cur;
            while (j < s.length() && s.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            int x = Integer.parseInt(s.substring(cur, j));
            x = Math.min(x, k - x);
            ans += 2 * x;
            cur = j + 1;
            i++;
        }
        System.out.println(ans);
    }
}
```