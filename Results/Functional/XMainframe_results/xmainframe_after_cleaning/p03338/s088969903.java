import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        char[] s = S.toCharArray();
        int[][] dp = new int[N][26];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 26; j++) {
                if (i == 0) {
                    if (s[i] - 'a' == j) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 0;
                    }
                } else {
                    if (s[i] - 'a' == j) {
                        dp[i][j] = dp[i - 1][j] + 1;
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                }
            }
        }
        int maxlen = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                boolean ok = true;
                for (int k = 0; k < 26; k++) {
                    if (dp[j][k] - (i == 0 ? 0 : dp[i - 1][k]) < 2) {
                        ok = false;
                        break;
                    }
                }
                if (ok) {
                    maxlen = Math.max(maxlen, j - i + 1);
                }
            }
        }
        System.out.println(maxlen);
    }
}
