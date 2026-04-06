import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter a value: ");
        int a = scanner.nextInt();
        
        // Processing section
        int out = a + (int) Math.pow(a, 2) + (int) Math.pow(a, 3);
        
        // Output section
        System.out.println(String.format("%03d", out));
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **Math Operations**: Used `Math.pow` for exponentiation and casted the result to `int`.
3. **Output Formatting**: Used `String.format` to ensure the output is zero-padded to three digits.
4. **Code Quality**: Utilized Java 17 features such as `var` for local variable type inference (not used here but can be applied where appropriate). Added comments for clarity.