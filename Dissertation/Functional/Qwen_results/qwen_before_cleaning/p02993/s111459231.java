import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input as a string
        String input = scanner.nextLine();
        
        // Convert the first character of the input to an integer
        int A = Character.getNumericValue(input.charAt(0));
        
        // Calculate B, C, D, and E based on the rules provided
        int B = (A % 100) / 10;
        int C = A % 10;
        int D = (A / 100) % 10;
        int E = A / 1000;
        
        // Check if any two consecutive digits are the same
        if (B == C || C == D || E == D) {
            System.out.println("Bad");
        } else {
            System.out.println("Good");
        }
        
        scanner.close();
    }
}
```

### Explanation:
1. **Input Handling**: The input is read as a string using `Scanner`.
2. **Digit Extraction**:
   - `A` is extracted from the first character of the input string.
   - `B`, `C`, `D`, and `E` are calculated based on the rules provided in the COBOL code.
3. **Condition Check**: The program checks if any two consecutive digits are the same and prints "Bad" or "Good" accordingly.
4. **Resource Management**: The `Scanner` is closed after use to free up resources.