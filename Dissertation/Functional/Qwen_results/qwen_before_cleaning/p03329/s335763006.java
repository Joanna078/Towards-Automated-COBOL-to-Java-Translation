import java.util.Scanner;

public class ABC_099_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = scanner.nextInt();
        
        // Initialize variables
        int res = n;
        String ans = "";
        StringBuilder sb = new StringBuilder();

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            int t = i;
            int sumr = 0;

            // Sum of digits of t when divided by 6
            while (t > 0) {
                int r = t % 6;
                sumr += r;
                t /= 6;
            }

            t = n - i;

            // Sum of digits of t when divided by 9
            while (t > 0) {
                int r = t % 9;
                sumr += r;
                t /= 9;
            }

            // Update result with minimum value
            res = Math.min(res, sumr);
        }

        // Convert result to string
        sb.append(res);

        // Reverse the string
        ans = sb.reverse().toString();

        // Output
        System.out.println(ans.substring(0, ans.length()));
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` statement with `Scanner` to read input.
2. **Variable Initialization**: Used Java's built-in types (`int`, `String`) instead of COBOL-specific data types.
3. **Looping**: Replaced `PERFORM VARYING` loops with standard `for` loops.
4. **Math Operations**: Replaced COBOL division and remainder operations with Java's `%` operator.
5. **String Manipulation**: Replaced `UNSTRING` with `StringBuilder` for reversing the string.
6. **Output**: Used `System.out.println` to display the output.

This Java code maintains the same logic and behavior as the original COBOL program.