import java.util.Scanner;

public class Kyopuro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        String inStr = scanner.nextLine();
        
        // Splitting the input string into two parts
        String[] parts = inStr.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        
        // Result variable
        long viewRes;
        
        // Logic based on the conditions
        if (n == 1 && m == 1) {
            viewRes = 1;
        } else if (n == 1 || m == 1) {
            viewRes = Math.max(n, m) - 2;
        } else {
            viewRes = (long) (n - 2) * (m - 2);
        }
        
        // Output the result
        System.out.printf("%018d%n", viewRes);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Used `Scanner` to read input from the console.
2. **String Splitting**: Used `split("\\s+")` to split the input string by spaces.
3. **Type Conversion**: Converted the split strings to integers using `Integer.parseInt`.
4. **Conditional Logic**: Translated the COBOL conditional logic into Java's `if-else` statements.
5. **Result Formatting**: Used `System.out.printf` to format the output as specified in the COBOL program.
6. **Resource Management**: Closed the `Scanner` object after use to avoid resource leaks.