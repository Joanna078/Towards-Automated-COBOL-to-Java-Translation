import java.util.Arrays;

public class ABC_103_A {
    public static void main(String[] args) {
        String inp = "123 456 789"; // Simulating input
        int maxlen = 3;
        int cur = 0;
        int i = 0;
        int j;
        int len;
        char[] ans = new char[3];
        int[][] A = new int[maxlen][maxlen];
        int tmp;
        int sm = 0;

        while (cur < inp.length()) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            A[i] = Arrays.stream(inp.substring(cur, j).split("")).mapToInt(Integer::parseInt).toArray();
            cur = j + 1;
            i++;
        }

        for (i = 0; i < 2; i++) {
            j = i + 1;
            while (j < 3) {
                if (A[j][0] < A[i][0]) {
                    tmp = A[i][0];
                    A[i][0] = A[j][0];
                    A[j][0] = tmp;
                }
                j++;
            }
        }

        sm += A[1][0] - A[0][0];
        sm += A[2][0] - A[0][0];

        String zs = String.format("%04d", sm);
        String dummy = "";
        System.arraycopy(zs.toCharArray(), 0, ans, 0, Math.min(zs.length(), ans.length));

        System.out.println(new String(ans));
    }
}