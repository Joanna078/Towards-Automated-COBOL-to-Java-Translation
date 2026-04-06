import java.util.Scanner;

public class ABC_106_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = scanner.nextInt();
        
        int cnt = 0;
        
        for (int i = 1; i <= n; i += 2) {
            int tmp = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    tmp++;
                }
            }
            if (tmp == 8) {
                cnt++;
            }
        }
        
        String ans = String.format("%03d", cnt);
        
        // Output
        System.out.println(ans.trim());
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read input from the console.
2. **Looping Constructs**: Used `for` loops instead of `PERFORM VARYING`.
3. **Conditionals**: Replaced `IF` statements with standard Java syntax.
4. **String Formatting**: Used `String.format` to format the output string.
5. **Output**: Simplified the output using `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.