import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        String ln = scanner.nextLine();
        
        // Splitting the input string into components
        String[] parts = ln.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input must contain exactly three space-separated numbers.");
        }
        
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int K = Integer.parseInt(parts[2]);
        
        // Compute mna and update A
        int mna = Math.min(A, K);
        A -= mna;
        
        // Update K with the new value of mna
        K -= mna;
        
        // Compute mnb and update B
        int mnb = Math.min(B, mna);
        B -= mnb;
        
        // Convert results to strings and trim leading/trailing spaces
        String zsa = String.format("%d", A).trim();
        String zsb = String.format("%d", B).trim();
        
        // Concatenate the results with a space in between
        String ans = zsa + " " + zsb;
        
        // Output the result
        System.out.println(ans.trim());
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The `Scanner` class is used to read input from the console.
2. **String Splitting**: The `split` method is used to split the input string into individual components.
3. **Integer Parsing**: The `parseInt` method converts the string components to integers.
4. **Math Operations**: The `Math.min` function is used to compute the minimum values.
5. **Formatting and Trimming**: The `String.format` method is used to format the integer values as strings, and `trim` is used to remove any unnecessary whitespace.
6. **Concatenation**: The `+` operator is used to concatenate the strings.
7. **Output**: The `System.out.println` method is used to display the final result.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices and using Java 17 features.