import java.util.Scanner;

public class ABC_105_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept N
        int n = scanner.nextInt();
        
        // Initialize flag
        boolean found = false;
        
        // Perform nested loops
        for (int i = 0; i <= n / 4; i++) {
            for (int j = 0; j <= n / 7; j++) {
                if (4 * i + 7 * j == n) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        
        // Display result
        System.out.println(found ? "Yes" : "No");
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Data Types**: 
   - `N`, `i`, `j` are converted from COBOL's `PIC 9(3)` to Java's `int`.
   - `flg` is converted from COBOL's `PIC 9(1)` to Java's `boolean`.

2. **Input/Output**:
   - COBOL's `ACCEPT N` is replaced with Java's `Scanner` to read user input.
   - COBOL's `DISPLAY` statements are replaced with Java's `System.out.println`.

3. **Looping**:
   - COBOL's `PERFORM VARYING` loops are replaced with Java's `for` loops.
   - The loop conditions are adjusted to match the original COBOL logic.

4. **Conditionals**:
   - COBOL's `IF` statements are replaced with Java's `if` statements.
   - The `MOVE 1 TO flg` is replaced with `found = true`.

5. **Code Quality**:
   - Java 17 features are not used as there were no specific features required.
   - Comments are added for clarity where necessary.