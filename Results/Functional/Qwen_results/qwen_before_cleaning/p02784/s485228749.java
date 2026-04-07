import java.util.Scanner;

public class ProgramId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input line
        String ln = scanner.nextLine();
        
        // Split input into H and N
        String[] parts = ln.split(" ");
        int h = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);
        
        // Initialize variables
        int maxlen = 100000;
        int cur = 1;
        long accum = 0;
        
        // Read next line from input
        ln = scanner.nextLine();
        
        // Process each character in the line
        for (int i = 1; i <= maxlen; i++) {
            while (cur <= ln.length() && ln.charAt(cur - 1) != ' ') {
                cur++;
            }
            int len = cur - 1 - i + 1;
            if (len > 0) {
                int a = Integer.parseInt(ln.substring(i - 1, i - 1 + len));
                accum += a;
            }
            i = cur;
        }
        
        // Compare H with accumulated value
        if (h <= accum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `ACCEPT` statement with Java's `Scanner` to read input from the console.
2. **String Splitting**: Used Java's `split` method to separate `H` and `N`.
3. **Looping and Conditionals**: Translated COBOL loops and conditionals into Java syntax.
4. **Variable Types**: Converted COBOL variable types to appropriate Java types (`int`, `long`).
5. **Character Access**: Used `charAt` and `substring` methods to access and manipulate characters in the string.
6. **Comparison and Output**: Compared `H` with `accum` and printed the result using `System.out.println`.

This Java code maintains the same logic and behavior as the original COBOL program.