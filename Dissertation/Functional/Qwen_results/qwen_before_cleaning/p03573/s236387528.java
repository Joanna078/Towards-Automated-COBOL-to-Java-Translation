import java.util.Scanner;

public class ABC_075_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter three numbers separated by spaces: ");
        String input = scanner.nextLine();
        
        // Parse input
        String[] parts = input.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        
        // Determine the result
        int zs;
        if (a == b) {
            zs = c;
        } else if (b == c) {
            zs = a;
        } else {
            zs = b;
        }
        
        // Convert result to string
        String ans = String.valueOf(zs);
        
        // Output
        System.out.println(ans.trim());
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `ACCEPT` with Java's `Scanner` to read user input.
2. **String Parsing**: Used `split("\\s+")` to split the input string into individual components based on spaces.
3. **Conditional Logic**: Translated the nested `IF` statements into Java's conditional expressions.
4. **Result Conversion**: Converted the integer result to a string using `String.valueOf()`.
5. **Output**: Used `System.out.println()` to display the result, trimming any leading/trailing whitespace from the string.