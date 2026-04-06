import java.util.Arrays;

public class ABC_052_B {
    public static void main(String[] args) {
        // Input variables
        int n = Integer.parseInt(System.console().readLine());
        char[] s1 = System.console().readLine().toCharArray();

        // Working storage
        int mx = 0;
        int tmp = 0;
        char[] ans = new char[18];
        char zs = ' ';
        char dummy = ' ';

        // Logic
        for (int i = 0; i < n; i++) {
            if (s1[i] == 'I') {
                tmp++;
            } else {
                tmp--;
            }
            mx = Math.max(mx, tmp);
        }

        zs = (char) ('-' + mx);

        unans(zs, dummy, ans);

        System.out.println(new String(ans).trim());
    }

    private static void unans(char zs, char dummy, char[] ans) {
        StringBuilder sb = new StringBuilder();
        sb.append(zs);
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == dummy) {
            sb.deleteCharAt(sb.length() - 1);
        }
        sb.reverse();
        System.arraycopy(sb.toString().toCharArray(), 0, ans, 0, sb.length());
    }
}
```

### Explanation of Changes:
1. **Data Types**: Converted COBOL data types to their Java equivalents.
2. **Input/Output**: Used `System.console().readLine()` for input and `System.out.println()` for output.
3. **Looping**: Replaced COBOL's `PERFORM` loop with a traditional `for` loop in Java.
4. **String Manipulation**: Used `StringBuilder` for efficient string manipulation instead of `UNSTRING`.
5. **Math Functions**: Used `Math.max()` for finding the maximum value.
6. **Comments**: Added comments where necessary to explain complex logic.