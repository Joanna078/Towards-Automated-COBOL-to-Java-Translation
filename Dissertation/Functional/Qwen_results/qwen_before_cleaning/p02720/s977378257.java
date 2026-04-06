import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] tbl = new int[100002];
        int i;
        int l = 0;
        int s;
        int a;
        int out;

        // Initialize array with values from 1 to 9
        for (i = 1; i <= 9; i++) {
            tbl[i] = i;
        }

        // Process the array as per the original logic
        for (i = 1; i <= n && l < n; i++) {
            s = tbl[i] / 10;
            a = tbl[i] % 10;
            if (a > 0) {
                l++;
                tbl[l] = tbl[i] * 10 + a - 1;
            }
            l++;
            tbl[l] = tbl[i] * 10 + a;
            if (a < 9) {
                l++;
                tbl[l] = tbl[i] * 10 + a + 1;
            }
        }

        // Output the result
        out = tbl[n];
        System.out.println(out);
    }
}
```

### Explanation of Changes:
1. **Data Types**: Converted COBOL data types to appropriate Java data types (`int` for numeric fields).
2. **Array Initialization**: Used a loop to initialize the array `tbl` with values from 1 to 9.
3. **Looping**: Replaced COBOL's `PERFORM VARYING` loops with standard Java `for` loops.
4. **Division and Modulus Operations**: Used Java's `/` and `%` operators for division and modulus operations.
5. **Conditional Statements**: Used Java's `if` statements to handle conditional logic.
6. **Output**: Used `System.out.println` to display the output, similar to COBOL's `DISPLAY`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.