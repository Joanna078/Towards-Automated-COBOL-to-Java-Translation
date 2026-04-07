import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter a string with two numbers separated by space:");
        String ln = scanner.nextLine();
        
        // Splitting the input string into two parts
        String[] parts = ln.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        
        // Calculation
        int ans = n * (n - 1) / 2 + m * (m - 1) / 2;
        
        // Output
        System.out.println(ans);
        
        scanner.close();
    }
}
```

### Explanation of the Code:
1. **Input Handling**: The `Scanner` class is used to read user input from the console.
2. **Splitting the Input**: The input string is split using the `split` method with a regular expression that matches one or more whitespace characters (`\\s+`).
3. **Parsing Integers**: The split parts are parsed into integers using `Integer.parseInt`.
4. **Calculation**: The calculation follows the logic provided in the COBOL program.
5. **Output**: The result is printed to the console.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and using Java 17 features.