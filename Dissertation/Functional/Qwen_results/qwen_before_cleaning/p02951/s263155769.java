import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter three numbers separated by spaces:");
        String ln = scanner.nextLine();
        
        // Splitting the input string into individual numbers
        String[] parts = ln.split("\\s+");
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);
        
        // Logic
        int ans;
        if (A < B + C) {
            ans = B + C - A;
        } else {
            ans = 0;
        }
        
        // Output
        System.out.println(ans);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **String Splitting**: Used `split("\\s+")` to split the input string into individual numbers based on spaces.
3. **Type Conversion**: Converted the split strings to integers using `Integer.parseInt`.
4. **Conditional Logic**: Kept the conditional logic unchanged.
5. **Output**: Used `System.out.println` to display the result.
6. **Resource Management**: Closed the `Scanner` object after use to avoid resource leaks.