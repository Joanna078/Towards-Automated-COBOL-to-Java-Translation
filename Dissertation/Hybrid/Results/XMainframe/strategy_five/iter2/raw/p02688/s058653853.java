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
            ln = sc.nextLine();
            parts = ln.split(" ");
            int maxlen = Integer.parseInt(parts[0]);
            ln = sc.nextLine();
            int cur = 0;
            for (int j = 0; j < maxlen; j++) {
                if (j >= ln.length()) break;
                if (ln.charAt(j) == ' ') {
                    cur = j + 1;
                    continue;
                }
                int len = 1;
                while (j + len < ln.length() && ln.charAt(j + len) != ' ') {
                    len++;
                }
                int idx = Integer.parseInt(ln.substring(cur, cur + len));
                if (idx >= 1 && idx <= N) { // Check index bounds
                    A[idx - 1] = 0;
                }
                cur = j + len;
            }
        }
        int ans = 0;
        for (int num : A) ans += num;
        System.out.println(ans);
    }
}
```