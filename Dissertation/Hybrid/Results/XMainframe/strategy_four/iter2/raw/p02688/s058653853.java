```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        String[] parts = ln.split(" ");
        int N = Integer.parseInt(parts[0]);
        int K = Integer.parseInt(parts[1]);
        int[] A = new int[N];
        Arrays.fill(A, 1);
        for (int i = 0; i < K; i++) {
            int maxlen = sc.nextInt();
            ln = sc.nextLine().trim();
            int cur = 0;
            for (int j = 0; j < maxlen; j++) {
                if (cur >= ln.length()) break;
                if (ln.charAt(cur) == ' ') {
                    cur++;
                    continue;
                }
                int len = 0;
                while (cur + len < ln.length() && ln.charAt(cur + len) != ' ') {
                    len++;
                }
                int idx = Integer.parseInt(ln.substring(cur, cur + len));
                if (idx > 0 && idx <= N) {
                    A[idx - 1] = 0;
                }
                cur += len + 1;
            }
        }
        int ans = 0;
        for (int num : A) ans += num;
        System.out.println(ans);
    }
}
```