import java.util.Arrays;

public class ABC_098_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        String s = System.console().readLine();

        char[] x = new char[26];
        Arrays.fill(x, ' ');
        int xNum = 0;

        char[] y = new char[26];
        Arrays.fill(y, ' ');
        int yNum = 0;

        int cntMax = 0;

        for (int i = 0; i < n; i++) {
            char chr = s.charAt(i);

            boolean foundX = false;
            for (int j = 0; j < xNum; j++) {
                if (x[j] == chr) {
                    foundX = true;
                    break;
                }
            }

            if (!foundX) {
                x[xNum++] = chr;
            }

            String str = s.substring(i + 1);

            for (int j = 0; j < str.length(); j++) {
                chr = str.charAt(j);

                boolean foundY = false;
                for (int k = 0; k < yNum; k++) {
                    if (y[k] == chr) {
                        foundY = true;
                        break;
                    }
                }

                if (!foundY) {
                    y[yNum++] = chr;
                }
            }

            int cnt = 0;
            for (int j = 0; j < xNum; j++) {
                for (int k = 0; k < yNum; k++) {
                    if (x[j] == y[k]) {
                        cnt++;
                    }
                }
            }

            cntMax = Math.max(cntMax, cnt);
        }

        System.out.println(cntMax);
    }
}
```

### Explanation of Changes:
1. **Data Types**: Converted COBOL data types to appropriate Java data types.
2. **Arrays**: Used Java arrays instead of OCCURS clauses.
3. **String Operations**: Replaced COBOL string operations with Java's `substring` method.
4. **Looping**: Replaced COBOL `PERFORM` loops with Java `for` loops.
5. **Conditionals**: Replaced COBOL `IF` statements with Java `if` statements.
6. **Initialization**: Used `Arrays.fill` to initialize arrays.
7. **Math Functions**: Replaced COBOL `FUNCTION MAX` with Java's `Math.max`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.