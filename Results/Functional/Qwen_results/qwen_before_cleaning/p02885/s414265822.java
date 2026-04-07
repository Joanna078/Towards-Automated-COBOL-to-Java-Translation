import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        System.out.print("Enter a string: ");
        String ln = scanner.nextLine();
        
        // Split the input into two parts
        String[] parts = ln.split("\\s+");
        if (parts.length != 2) {
            System.out.println("Invalid input format.");
            return;
        }
        
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        
        // Compute the result
        int ans = 0;
        if (2 * B < A) {
            ans = A - 2 * B;
        }
        
        // Display the result
        System.out.println(ans);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: The COBOL `ACCEPT` statement is replaced with a `Scanner` object to read user input from the console.
2. **String Splitting**: The `UNSTRING` statement is replaced with the `split` method to split the input string into two parts based on spaces.
3. **Conditional Logic**: The conditional logic remains the same but uses Java's syntax.
4. **Output**: The `DISPLAY` statements are replaced with `System.out.println` to output the results.
5. **Error Handling**: Added basic error handling to check if the input format is correct.