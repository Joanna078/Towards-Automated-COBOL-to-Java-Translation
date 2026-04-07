import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input line
        String ln = scanner.nextLine();
        
        // Splitting the input into components
        String[] parts = ln.split(" ");
        int N = Integer.parseInt(parts[0]);
        int D = Integer.parseInt(parts[1]);
        
        // Calculating the answer
        double ans = (N + 2 * D) / (2 * D + 1.0);
        
        // Formatting the output
        System.out.printf("%.0f%n", ans);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read input from the console.
2. **String Splitting**: Used `split` method to separate the input string into components.
3. **Data Types**: Changed data types to `int` and `double` for better precision.
4. **Formatting Output**: Used `System.out.printf` to format the output as required.
5. **Java 17 Features**: No specific Java 17 features were used, but the code is compatible with Java 17.