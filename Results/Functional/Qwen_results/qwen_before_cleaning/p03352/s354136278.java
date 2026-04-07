import java.util.Scanner;

public class ABC_097_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input for variable A
        System.out.print("Enter value for A: ");
        long A = scanner.nextLong();
        
        long ans = 1;
        
        // Perform nested loops as per the original COBOL logic
        for (long b = 2; A >= b; b++) {
            for (long p = 2; A >= p; p++) {
                long tmp = (long) Math.pow(b, p);

                if (A < tmp) {
                    break;
                }

                ans = Math.max(ans, tmp);
            }
        }

        // Display the result
        System.out.println("Result: " + ans);
    }
}
```

### Explanation of Changes:
1. **Input/Output**: Replaced `ACCEPT` with `Scanner` for user input and `DISPLAY` with `System.out.println`.
2. **Data Types**: Changed `PIC 9(18)` to `long` for larger number handling.
3. **Looping**: Used `for` loops instead of `PERFORM VARYING` statements.
4. **Math Operations**: Replaced `**` with `(long) Math.pow` for exponentiation.
5. **Conditional Statements**: Used `if` and `break` statements similarly to the original COBOL logic.
6. **Comments**: Added comments for clarity where necessary.