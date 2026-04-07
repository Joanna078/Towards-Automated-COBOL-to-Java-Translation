import java.util.Scanner;

public class SortNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept N from user
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int cnt = 0;
        
        // Perform nested loops
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= n; b++) {
                for (int c = 1; c <= n; c++) {
                    int res = a * b + c;
                    
                    if (res > n) {
                        break;
                    }
                    
                    if (res == n) {
                        cnt++;
                        break;
                    }
                }
            }
        }
        
        // Display the result
        System.out.println(cnt);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input/Output**: Replaced `ACCEPT` with `Scanner` for reading input from the user and `DISPLAY` with `System.out.println` for output.
2. **Looping**: Used modern Java `for` loops instead of COBOL's `PERFORM VARYING`.
3. **Conditionals**: Kept the conditional logic as is but used modern Java syntax.
4. **Variable Naming**: Changed variable names to be more descriptive and follow Java naming conventions.
5. **Resource Management**: Added `scanner.close()` to close the scanner resource after use.