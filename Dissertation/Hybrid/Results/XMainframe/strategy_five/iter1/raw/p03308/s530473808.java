```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline left-over
        String s = sc.nextLine();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int cur = 0;
        int len = 0;
        int i = 0;
        while (i < n) {
            int j = cur;
            while (j < s.length() && !s.substring(j, j + 1).equals(" ")) {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                int x = Integer.parseInt(s.substring(cur, cur + len));
                min = Math.min(min, x);
                max = Math.max(max, x);
            }
            cur = j + 1;
            i++;
        }
        System.out.println(max - min);
    }
}
```