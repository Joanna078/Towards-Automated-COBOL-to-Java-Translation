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

        for (int k = 0; k < 5; k++) {
            for (j = cur; j <= maxlen && j <= ln.length(); j++) {
                if (ln.charAt(j - 1) == ' ') break;
            }
            len = j - cur;
            if (len > 0) {
                try {
                    x1[k] = Integer.parseInt(ln.substring(cur - 1, j - 1));
                } catch (NumberFormatException e) {
                    // Handle the case where the substring is not a valid integer
                    x1[k] = 0; // or some other default value
                }
            }
            cur = j + 1;
        }

        for (int ix = 0; ix < 5; ix++) {
            if (x1[ix] == 0) {
                ans = ix + 1;
                break;
            }
        }

        zs = ans;
        System.out.println(String.format("%d", zs));
    }
}