import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter input: ");
        String inp = scanner.nextLine();
        
        // Parsing input
        String[] parts = inp.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        // Calculation
        int p1 = Math.round(a * 12.5f);
        int p2 = b * 10;
        int pri = (p1 > p2) ? p1 : p2;
        double t1 = pri * 0.08;
        double t2 = pri * 0.1;
        
        // Output
        if (t1 != a || t2 != b) {
            System.out.println("-1");
        } else {
            System.out.printf("%04d%n", pri);
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **Parsing Input**: Used `split` method to parse the input string into individual components.
3. **Calculation**: Converted COBOL arithmetic operations to Java syntax.
4. **Conditional Logic**: Translated COBOL conditional statements to Java's ternary operator and `if-else` statements.
5. **Output Formatting**: Used `printf` to format the output as specified in the original COBOL program.
6. **Java 17 Features**: No specific Java 17 features were used in this translation, but it is compatible with Java 17.