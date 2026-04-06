import java.io.*;
public class Main {
    static final int ABC_LEN = 3;
    static final long INF = 1000000007L;
    static final char ABC_CHAR = 'A';
    static final char QUESTION_MARK = '?';

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        int len = s.length();
        long[][] dp = new long[len + 1][ABC_LEN + 1];
        for (int i = len; i >= 0; i--) {
            for (int j = ABC_LEN; j >= 1; j--) {
                if (i == len) {
                    if (j == ABC_LEN) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 0;
                    }
                } else {
                    if (s.charAt(i) == QUESTION_MARK) {
                        dp[i][j] = dp[i + 1][j] * 3 % INF;
                    } else if (s.charAt(i) == ABC_CHAR + j - 1) {
                        dp[i][j] = (dp[i + 1][j] + dp[i + 1][j + 1]) % INF;
                    } else {
                        dp[i][j] = dp[i + 1][j];
                    }
                }
            }
        }
        System.out.println(dp[0][1]);
    }
}