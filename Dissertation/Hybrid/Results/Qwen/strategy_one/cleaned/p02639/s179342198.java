import java.util.Arrays;

public class ProgramID {
    public static void main(String[] args) {
        String ln = "Your input string here"; // Replace with actual input
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int ans = 0;
        int zs = 0;
        int[] x1 = new int[5];

        for (j = cur; j <= maxlen; j++) {
            if (j > ln.length() || ln.charAt(j - 1) == ' ') break;
        }
        len = j - cur;
        if (len > 0) {
            System.arraycopy(ln.toCharArray(), cur - 1, x1, i - 1, len);
        }
        cur = j + 1;
        i++;

        for (int ix = 1; ix <= 5; ix++) {
            while (ix <= 5 && x1[ix - 1] != 0) {
                ix++;
            }
            if (ix > 5) break;
            ans = ix;
            ix++;
        }

        zs = ans;
        System.out.println(String.format("%d", zs));
    }
}