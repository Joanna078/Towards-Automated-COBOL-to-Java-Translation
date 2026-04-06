import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize scanner for input
        Scanner scanner = new Scanner(System.in);

        // Declare variables
        int r;
        double out;

        // Accept input
        System.out.print("Enter a value for R: ");
        r = scanner.nextInt();

        // Compute output
        out = r * 2 * Math.PI;

        // Display output
        System.out.printf("%d%n", (int) out);

        // Close scanner
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Scanner for Input**: Replaced `ACCEPT` with a `Scanner` object to read user input from the console.
2. **Variable Declarations**: Changed data types to match COBOL's picture clauses (`int` for `R`, `double` for `OUT`).
3. **Math Constants**: Used `Math.PI` instead of hardcoding the value of π.
4. **Formatted Output**: Used `System.out.printf` to format the output as specified in the COBOL program.
5. **Resource Management**: Closed the `Scanner` object to avoid resource leaks.