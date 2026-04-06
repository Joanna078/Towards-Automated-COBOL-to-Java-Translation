import java.util.Arrays;

public class ProgramID {
    public static void main(String[] args) {
        // Input variables
        int n = Integer.parseInt(System.console().readLine());
        String ln = System.console().readLine();
        
        // Working storage
        char[] d = new char[100];
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int j;
        int k;
        int len;
        long ans = 0;
        StringBuilder zs = new StringBuilder();
        
        // Process input string
        while (cur <= maxlen && ln.charAt(cur - 1) != ' ') {
            j = cur;
            while (j <= maxlen && ln.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            System.arraycopy(ln.toCharArray(), cur - 1, d, i - 1, len);
            cur = j + 1;
            i++;
        }

        // Calculate answer
        for (i = 1; i < 50; i++) {
            for (k = i + 1; k < 50; k++) {
                ans += d[i - 1] * d[k - 1];
            }
        }

        // Output result
        zs.append(ans);
        System.out.println(zs.toString().trim());
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The `ACCEPT` statements in COBOL have been replaced with `System.console().readLine()` to read input from the console.
2. **Data Types**: COBOL data types like `PIC X(400)` and `PIC 9(10)` have been converted to appropriate Java data types (`char[]`, `int`, etc.).
3. **String Operations**: The `MOVE` and `COMPUTE` statements have been replaced with Java array operations and arithmetic.
4. **Looping**: The `PERFORM` loops in COBOL have been replaced with traditional `for` loops in Java.
5. **Output**: The `DISPLAY` statement has been replaced with `System.out.println()`.
6. **StringBuilder**: Used `StringBuilder` for efficient string manipulation.
7. **Comments**: Added comments where necessary to explain complex logic.