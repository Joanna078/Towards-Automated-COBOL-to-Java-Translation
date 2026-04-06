import java.util.Arrays;

public class ProgramID {
    public static void main(String[] args) {
        // Input handling (assuming input is provided as command-line arguments)
        String ln = "input string"; // Replace with actual input retrieval logic
        int n = Integer.parseInt(ln.split(" ")[0]);
        int k = Integer.parseInt(ln.split(" ")[1]);

        int[] a = new int[n];
        Arrays.fill(a, 1);

        for (int _k = 0; _k < k; _k++) {
            int maxlen = Integer.parseInt(ln);
            ln = ln.substring(maxlen.length() + 1).trim();
            int cur = 1;
            while (cur <= maxlen) {
                int j = cur;
                while (j <= maxlen && ln.charAt(j - 1) != ' ') {
                    j++;
                }
                int len = j - cur;
                int idx = Integer.parseInt(ln.substring(cur - 1, cur + len - 1));
                a[idx] = 0;
                cur = j + 1;
            }
        }

        int ans = 0;
        for (int j = 1; j <= n; j++) {
            ans += a[j];
        }

        System.out.println(ans);
    }
}