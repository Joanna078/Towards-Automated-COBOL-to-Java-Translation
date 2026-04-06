import java.util.Arrays;

public class ProgramID {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        String ln = System.console().readLine();
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int ans = 0;
        int zs = 0;
        n--;
        int[] A = new int[100];
        int[] B = new int[100];
        int[] C = new int[100];

        // First loop
        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            A[i] = Integer.parseInt(ln.substring(cur - 1, j));
            cur = j + 1;
            i++;
        }

        // Second loop
        cur = 1;
        i = 1;
        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            B[i] = Integer.parseInt(ln.substring(cur - 1, j));
            ans += B[i];
            cur = j + 1;
            i++;
        }

        // Third loop
        cur = 1;
        i = 1;
        while (cur <= maxlen) {
            j = cur;
            while (j <= maxlen && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            C[i] = Integer.parseInt(ln.substring(cur - 1, j));
            cur = j + 1;
            i++;
        }

        // Fourth loop
        for (i = 2; i <= n; i++) {
            if (A[i - 1] + 1 == A[i]) {
                ans += C[A[i - 1]];
            }
        }

        zs = ans;
        System.out.println(String.format("%d", zs));
    }
}