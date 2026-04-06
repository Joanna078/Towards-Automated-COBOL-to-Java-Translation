import java.util.Arrays;

public class ABC110B {
    public static void main(String[] args) {
        String input = System.console().readLine();
        String[] parts = input.split(" ");
        
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        int x = Integer.parseInt(parts[2]);
        int y = Integer.parseInt(parts[3]);
        
        input = System.console().readLine();
        parts = input.split(" ");
        
        int[] array = Arrays.stream(parts).mapToInt(Integer::parseInt).toArray();
        
        input = System.console().readLine();
        parts = input.split(" ");
        
        int ptr = 0;
        for (int i = 0; i < n; i++) {
            int t = array[ptr++];
            if (x < t) {
                x = t;
            }
        }
        
        input = System.console().readLine();
        parts = input.split(" ");
        
        ptr = 0;
        for (int i = 0; i < m; i++) {
            int t = array[ptr++];
            if (t < y) {
                y = t;
            }
        }
        
        if (x < y) {
            System.out.println("No War");
        } else {
            System.out.println("War");
        }
    }
}
```

### Explanation of Changes:
1. **Data Types**: Replaced COBOL data types with appropriate Java data types (`int` for numeric values, `String` for text).
2. **Input Handling**: Used `System.console().readLine()` to read input from the console, similar to COBOL's `ACCEPT`.
3. **Array Processing**: Converted the string array into an integer array using Java Streams for easier manipulation.
4. **Looping**: Replaced COBOL loops with Java `for` loops.
5. **Conditional Statements**: Kept the conditional logic unchanged.
6. **Output**: Used `System.out.println()` to display output, similar to COBOL's `DISPLAY`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards and best practices.