import java.util.Scanner;

public class Test156 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Initialize variables
        int rate = 0;
        int a = 0;
        int b = 0;
        int naibu = 0;
        int x = 0;
        int y = 0;
        
        // Accept input
        System.out.print("Enter value for A: ");
        a = scanner.nextInt();
        System.out.print("Enter value for RATE: ");
        rate = scanner.nextInt();
        
        if (a >= 10) {
            System.out.println(rate);
        } else {
            b = a;
            y = 10 - b;
            x = 100 * y;
            naibu = rate + x;
            System.out.println(naibu);
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Data Types**: Converted COBOL data types to appropriate Java data types (`int`).
2. **Input/Output**: Replaced `ACCEPT` with `Scanner` for user input and `DISPLAY` with `System.out.println`.
3. **Control Structures**: Used Java's `if-else` structure instead of COBOL's `IF-THEN-ELSE`.
4. **Initialization**: Initialized all variables at the beginning of the method.
5. **Comments**: Added comments for clarity where necessary.
6. **Java 17 Features**: No specific Java 17 features were used as the original code was relatively simple.