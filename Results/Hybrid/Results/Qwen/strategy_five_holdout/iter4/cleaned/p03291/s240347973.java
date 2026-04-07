import java.util.Arrays;
import java.util.Scanner;

public class ABC_104_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int inf = 1000000007;
        long[][] dp = new long[s.length() + 2][5];
        Arrays.fill(dp[s.length() + 1], 1);

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = 4; j > 0; j--) {
                if (j == 4) {
                    int m1 = s.charAt(i) == '?' ? 3 : 1;
                    dp[i][j] = (m1 * dp[i + 1][j]) % inf;
                } else {
                    int m1 = s.charAt(i) == '?' ? 3 : 1;
                    int m2 = s.charAt(i) != 'A' + j - 1 ? 0 : 1;
                    dp[i][j] = (m1 * dp[i + 1][j] + m2 * dp[i + 1][j + 1]) % inf;
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while (dp[0][1] > 0) {
            ans.append(dp[0][1] % 10);
            dp[0][1] /= 10;
            for (int k = 1; k < dp.length; k++) {
                long carry = dp[k][1];
                dp[k][1] = (carry * 10 + dp[k - 1][1] / 10) % inf;
            }
        }

        System.out.println(ans.reverse().toString());
    }
}