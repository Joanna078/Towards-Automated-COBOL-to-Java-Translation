import java.util.Scanner;

public class ABC_104_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int inf = 1000000007;
        char[] dp = new char[100001];
        Arrays.fill(dp, '0');
        dp[s.length()] = '1';

        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = 4; j > 0; j--) {
                if (j == 4) {
                    int m1 = s.charAt(i) == '?' ? 3 : 1;
                    dp[i] = (char) ((m1 * (dp[i + 1] - '0')) % inf + '0');
                } else {
                    int m1 = s.charAt(i) == '?' ? 3 : 1;
                    int m2 = s.charAt(i) != 'A' + j - 1 ? 0 : 1;
                    dp[i] = (char) (((m1 * (dp[i + 1] - '0') + m2 * (dp[i + 2] - '0')) % inf) + '0');
                }
            }
        }

        StringBuilder ans = new StringBuilder();
        while (dp[0] != '0') {
            ans.append((char) (dp[0] - '0'));
            dp[0] = '0';
            for (int k = 1; k < dp.length; k++) {
                int carry = dp[k] - '0';
                dp[k] = (char) ((carry * 10 + dp[k - 1] - '0') % inf + '0');
            }
        }

        System.out.println(ans.reverse());
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `READ` statement with Java's `Scanner` to read input from the console.
2. **Data Structures**: Used Java arrays and strings instead of COBOL's data structures.
3. **Looping and Conditional Logic**: Translated COBOL loops and conditional statements into Java syntax.
4. **Modulo Operation**: Used Java's modulo operator `%` to replace COBOL's `FUNCTION MOD`.
5. **String Manipulation**: Used Java's `StringBuilder` to handle string concatenation and manipulation.
6. **Character Comparison**: Used Java's character comparison operators (`==`, `!=`) instead of COBOL's `=` and `NOT =`.

This Java code maintains the same logic and behavior as the original COBOL program.