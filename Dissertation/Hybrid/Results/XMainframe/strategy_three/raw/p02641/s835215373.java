```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int x = Integer.parseInt(inp.split(" ")[0]);
        int n = Integer.parseInt(inp.split(" ")[1]);
        int p1 = 1;
        int p2;
        int idx;
        int cnt = 0;
        int out;
        int[] p = new int[103];
        Arrays.fill(p, 0);
        if (n == 0) {
            cnt = x;
        } else {
            for (int i = 1; i <= n; i++) {
                p2 = p1;
                while (p2 <= inp.length() && inp.charAt(p2 - 1) != ' ') {
                    p2++;
                }
                idx = Integer.parseInt(inp.substring(p1 - 1, p2 - 1));
                p[idx + 1] = 1;
                p1 = p2 + 1;
            }
            if (p[x + 1] == 0) {
                cnt = x;
            } else {
                int left = 1;
                int right = x;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (p[mid - 1] == 0) {
                        left = mid + 1;
                    } else if (p[mid - 1] > 0) {
                        right = mid - 1;
                    } else {
                        cnt = mid;
                        break;
                    }
                }
                if (cnt == 0) {
                    cnt = Math.max(x - left + 1, right - x + 1);
                }
            }
        }
        out = cnt;
        System.out.println(out);
    }
}
```