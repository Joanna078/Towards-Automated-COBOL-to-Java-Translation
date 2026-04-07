import java.util.Arrays;

public class ABC_098_A {
    public static void main(String[] args) {
        String inp = "1234567890"; // Simulating input acceptance
        int maxlen = 2;
        int cur = 1;
        long[] ab = new long[2];
        int i = 0;

        while (i < maxlen) {
            int j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }

            int len = j - cur;
            ab[i] = Long.parseLong(inp.substring(cur - 1, j - 1));

            cur = j + 1;
            i++;
        }

        long ans = Math.max(ab[0] + ab[1], Math.max(ab[0] - ab[1], ab[0] * ab[1]));
        System.out.println(ans);
    }
}
```

### Explanation of Changes:
1. **Data Types**: 
   - `PIC X(10)` is converted to `String` for handling variable-length strings.
   - `PIC S9(8)` is converted to `long` for handling signed integers.
   
2. **Looping**:
   - The `PERFORM` loops are replaced with `while` loops for better readability and control flow in Java.

3. **String Operations**:
   - `MOVE INP(cur:len) TO AB(i)` is replaced with `ab[i] = Long.parseLong(inp.substring(cur - 1, j - 1))` to extract and parse substrings into `long`.

4. **Math Functions**:
   - `FUNCTION MAX` is replaced with `Math.max` for calculating the maximum value among three numbers.

5. **Input Handling**:
   - The input string `inp` is simulated directly in the code for demonstration purposes. In a real scenario, you would read this from user input or another source.

This Java code maintains the original logic and behavior of the provided COBOL program while adhering to modern Java practices and syntax.