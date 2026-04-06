import java.util.Scanner;

public class Kyopuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String inStr = scanner.nextLine();
        
        // Splitting the input string into components
        String[] parts = inStr.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int k = Integer.parseInt(parts[1]);
        
        long viewRes;
        
        if (k == 0) {
            viewRes = (long) n * n;
        } else {
            long res = 0;
            long i = k + 1;
            while (i <= n) {
                long q = n / i;
                long r = n % i;
                res += (i - k) * q + Math.max(r - k + 1, 0);
                i++;
            }
            viewRes = res;
        }
        
        // Output the result
        System.out.printf("%018d%n", viewRes);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `ACCEPT` with Java's `Scanner` to read input from the console.
2. **String Splitting**: Used `split("\\s+")` to split the input string by spaces.
3. **Data Types**: Converted COBOL data types to appropriate Java data types (`int`, `long`).
4. **Looping**: Replaced COBOL's `PERFORM` loop with a `while` loop in Java.
5. **Conditional Logic**: Kept the conditional logic intact but used Java syntax.
6. **Output Formatting**: Used `System.out.printf` to format the output as specified in the COBOL program.
7. **Math Functions**: Used `Math.max` instead of a custom function for maximum value calculation.

This Java code maintains the same functionality and behavior as the original COBOL program while adhering to modern Java practices and syntax.