import java.util.Arrays;

public class ABC_044_A {
    public static void main(String[] args) {
        // Working storage variables
        char[] a = new char[1];
        char[] anum = {'a'};
        char[] chr = new char[1];
        char[] w = new char[100];
        int len;
        int i;
        int[] cnt1 = new int[26];
        int tmp;
        char flg = '0';

        // Accept input
        System.arraycopy(args[0].toCharArray(), 0, w, 0, Math.min(args[0].length(), 100));

        // Compute length of input string
        len = args[0].length();

        // Initialize character array a with 'a'
        a[0] = 'a';

        // Count occurrences of each character
        for (i = 0; i < len; i++) {
            chr[0] = w[i];
            cnt1[(int) chr[0] - (int) anum[0]]++;
        }

        // Check if any count is odd
        for (i = 0; i < 26; i++) {
            tmp = cnt1[i] % 2;
            if (tmp > 0) {
                flg = '1';
                break;
            }
        }

        // Display result
        if (flg == '0') {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```

### Explanation of Changes:
1. **Data Types**: Replaced COBOL data types with their Java equivalents.
2. **Arrays**: Used arrays instead of individual variables for repeated elements.
3. **String Handling**: Used `System.arraycopy` for accepting input and `args[0].length()` for computing the length.
4. **Looping**: Used traditional `for` loops instead of COBOL's `PERFORM VARYING`.
5. **Modulo Operation**: Used `%` operator for modulo operation.
6. **Character Arithmetic**: Converted characters to integers for arithmetic operations.
7. **Conditional Statements**: Used `if-else` statements for conditional logic.
8. **Output**: Used `System.out.println` for displaying output.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices.