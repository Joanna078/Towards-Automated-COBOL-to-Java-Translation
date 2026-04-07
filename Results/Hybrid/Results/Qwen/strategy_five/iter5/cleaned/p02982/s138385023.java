import java.util.Arrays;

public class ProgramID {
    public static void main(String[] args) {
        String ln = "your_input_here"; // Replace with actual input
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int jidx = 1;
        int j = 0; // Initialize j
        int k;
        int sidx = 1;
        int eidx;
        int st;
        int len;
        int ans = 0;
        double pre;
        double nxt;
        int num;
        int zs;
        int N;
        int D;

        String[] parts = ln.split(" ");
        N = Integer.parseInt(parts[0]);
        D = Integer.parseInt(parts[1]);

        int[][] X = new int[N][D];
        Arrays.stream(X).forEach(row -> Arrays.fill(row, 0));

        while (i <= N) {
            ln = "your_input_here"; // Replace with actual input
            maxlen = Integer.parseInt(ln);
            cur = 1;
            jidx = 1;

            while (cur <= maxlen) {
                j = cur;
                while (j <= maxlen && !ln.substring(j - 1, j).equals(" ")) {
                    j++;
                }
                len = j - cur;

                if (ln.charAt(cur - 1) == '-') {
                    sidx = cur + 1;
                    eidx = len - 1;
                    X[i - 1][jidx - 1] = Integer.parseInt(ln.substring(sidx - 1, sidx + eidx - 1));
                    X[i - 1][jidx - 1] *= -1;
                } else {
                    X[i - 1][jidx - 1] = Integer.parseInt(ln.substring(cur - 1, cur + len - 1));
                }

                cur = j + 1;
                jidx++;
            }
            i++;
        }

        i = 1;
        while (i <= N) {
            st = i + 1;
            while (st <= N) {
                num = 0;
                k = 1;
                while (k <= D) {
                    num += Math.pow(X[st - 1][k - 1] - X[i - 1][k - 1], 2); // Corrected index for j
                    k++;
                }
                pre = Math.sqrt(num);
                nxt = num;
                if (Math.abs(pre - nxt) < 1e-9) { // Use epsilon for floating point comparison
                    ans++;
                }
                st++;
            }
            i++;
        }

        zs = ans;
        System.out.println(Integer.toString(zs).trim());
    }
}