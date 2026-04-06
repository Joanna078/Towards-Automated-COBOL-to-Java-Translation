import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        int[][] dp = new int[s.length()][3];
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0) {
                    dp[i][j] = (s.charAt(i) - 'a' == j) ? 1 : 0;
                } else {
                    dp[i][j] = dp[i - 1][j]
                        + ((s.charAt(i) - 'a' == j) ? 1 : 0);
                    if (i >= k) {
                        for (int l = 0; l < 3; l++) {
                            dp[i][j] = Math.max(dp[i][j], dp[i - k][l]
                                    + ((s.charAt(i) - 'a' == j) ? 1 : 0));
                        }
                    }
                }
            }
        }
        System.out.println(Arrays.stream(dp[s.length() - 1]).max().getAsInt());
    }
}