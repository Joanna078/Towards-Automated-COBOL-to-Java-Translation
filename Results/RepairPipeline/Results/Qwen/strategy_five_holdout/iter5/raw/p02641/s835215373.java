```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String inp = "your_input_here"; // Replace with actual input
        int x = Integer.parseInt(inp.split(" ")[0]);
        int n = Integer.parseInt(inp.split(" ")[1]);

        int[] tbl1 = new int[103];
        Arrays.fill(tbl1, 0);

        int p1 = 0;
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            int idx = Integer.parseInt(inp.substring(p1, p2).trim());
            tbl1[idx] = 1; // Adjusted index to match COBOL's 1-based array
            p1 = p2 + 1;
        }

        int cnt;
        if (n == 0 || tbl1[x] == 0) {
            cnt = x;
        } else {
            int idx = 1;
            while (idx <= n && tbl1[x - idx] == 0 && tbl1[x + idx] == 0) {
                idx++;
            }
            if (tbl1[x - idx] == 0) {
                cnt = x - idx;
            } else {
                cnt = x + idx;
            }
        }

        System.out.println(cnt);
    }
}
```