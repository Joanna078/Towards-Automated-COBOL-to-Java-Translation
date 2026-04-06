import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        // Split input string into two parts
        String[] parts = inp.split(" ");
        String s = parts[0];
        String t = parts[1];
        
        // Create a StringBuilder to hold the result
        StringBuilder st = new StringBuilder();
        
        // Perform the loop using Java 17 features
        for (int i = 0; i < n; i++) {
            st.append(s.charAt(i));
            st.append(t.charAt(i));
        }
        
        // Display the result
        System.out.println(st.toString());
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Used `Scanner` to read input from the console.
2. **String Splitting**: Used `split` method to divide the input string into two parts.
3. **StringBuilder**: Used `StringBuilder` for efficient string concatenation.
4. **Loop**: Replaced the COBOL `PERFORM` loop with a standard `for` loop in Java.
5. **Character Access**: Used `charAt` method to access characters in strings.
6. **Output**: Used `System.out.println` to display the result.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and syntax.