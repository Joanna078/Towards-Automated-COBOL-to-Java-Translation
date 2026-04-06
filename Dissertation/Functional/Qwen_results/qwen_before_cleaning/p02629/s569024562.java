import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = scanner.nextInt();
        
        // Constants
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        
        // Output buffer
        StringBuilder out = new StringBuilder("           ");
        
        // Logic
        int m = n;
        for (int i = 12; i >= 1 && m > 0; i--) {
            m--;
            int amr = m % 26 + 1;
            out.setCharAt(i - 1, alpha.charAt(amr - 1));
        }
        
        // Output
        System.out.println(out.toString().trim());
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input.
2. **Constants**: Used a `String` for the alphabet instead of a fixed-length array.
3. **Output Buffer**: Used a `StringBuilder` to efficiently build the output string.
4. **Loop**: Replaced the COBOL `PERFORM` loop with a `for` loop in Java.
5. **Character Manipulation**: Used `setCharAt` on the `StringBuilder` to replace characters at specific positions.
6. **Trimming**: Used `trim()` on the final string before printing it.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and using Java 17 features where applicable.