import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Processing section
        int q = (n + 1) / 2;
        double ans = (double) q / n;
        
        // Output section
        System.out.printf("Result: %.1f%n", ans);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **Data Types**: Changed `PIC 9(10)` to `int` for integer values and used `double` for the result to maintain precision.
3. **Division Operation**: Casted `q` to `double` before dividing by `n` to ensure floating-point division.
4. **Output Formatting**: Used `System.out.printf` to format the output to one decimal place.
5. **Resource Management**: Closed the `Scanner` object after use to free up resources.