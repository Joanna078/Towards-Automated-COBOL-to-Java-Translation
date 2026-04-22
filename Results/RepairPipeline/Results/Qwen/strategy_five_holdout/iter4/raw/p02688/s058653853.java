```java
import java.util.Arrays;

public class ProgramID {
    public static void main(String[] args) {
        // Input handling (assuming input is provided as command-line arguments)
        String ln = args[0]; // Replace with actual input retrieval logic
        int n = Integer.parseInt(ln.split(" ")[0]);
        int k = Integer.parseInt(ln.split(" ")[1]);

        int[] a = new int[n];
        Arrays.fill(a, 1);

        for (int _k = 0; _k < k; _k++) {
            int maxlen = Integer.parseInt(args[1 + (_k * 2)]); // Corrected to use command-line argument
            ln = args[2 + (_k * 2)]; // Corrected to use command-line argument
            int cur = 1;
            while (cur <= maxlen) {
                int j = cur;
                while (j <= maxlen && j <= ln.length() && ln.charAt(j - 1) != ' ') {
                    j++;
                }
                int len = j - cur;
                if (len > 0) {
                    int idx = Integer.parseInt(ln.substring(cur - 1, j - 1));
                    if (idx >= 1 && idx <= n) { // Added bounds check
                        a[idx - 1] = 0; // Adjusted index to be 0-based
                    }
                }
                cur = j + 1;
            }
        }

        int ans = 0;
        for (int j = 0; j < n; j++) { // Adjusted loop to be 0-based
            ans += a[j];
        }

        System.out.println(ans);
    }
}
```