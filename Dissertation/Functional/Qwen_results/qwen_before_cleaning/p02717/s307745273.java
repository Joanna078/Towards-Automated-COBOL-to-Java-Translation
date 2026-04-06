import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        System.out.print("Enter three numbers separated by spaces: ");
        String ln = scanner.nextLine();
        
        // Split input into components
        String[] parts = ln.split("\\s+");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input must contain exactly three numbers.");
        }
        
        // Convert strings to integers
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);
        int z = Integer.parseInt(parts[2]);
        
        // Format output string
        String ans = String.format("%d %d %d", z, x, y).trim();
        
        // Display result
        System.out.println(ans.trim());
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **String Splitting**: Used `split("\\s+")` to split the input string by one or more whitespace characters.
3. **Integer Conversion**: Converted the split strings to integers using `Integer.parseInt`.
4. **Formatting Output**: Used `String.format` to format the output string and removed leading/trailing spaces using `trim()`.
5. **Error Handling**: Added a check to ensure that exactly three numbers are provided as input.
6. **Java 17 Features**: No specific Java 17 features were used in this translation, but it is written in Java 17 syntax.