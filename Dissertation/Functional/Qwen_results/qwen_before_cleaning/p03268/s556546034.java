import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Data
        int n = Integer.parseInt(inp.split(" ")[0]);
        int k = Integer.parseInt(inp.split(" ")[1]);
        int s = k / 2;
        int a = k % 2;
        double f1 = Math.pow(n, 1.0 / k);
        int s2 = (int) f1;
        long cnt = 0;
        String out = "";
        
        // Logic
        if (a == 1) {
            cnt = (long) Math.pow(f1, 3);
        } else {
            cnt = (long) Math.pow(f1, 3);
            if (s2 < 5) {
                cnt += (long) Math.pow(f1, 3);
            } else {
                cnt += (long) Math.pow(f1 + 1, 3);
            }
        }
        
        // Output
        out = String.format("%017d", cnt).replace(' ', '0');
        System.out.println(out.trim());
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `ACCEPT` with Java's `Scanner` to read user input.
2. **Data Types**: Converted COBOL data types to appropriate Java data types (`int`, `double`, etc.).
3. **String Operations**: Used Java's string manipulation methods instead of COBOL's `UNSTRING`.
4. **Math Operations**: Replaced COBOL's division and remainder operations with Java's arithmetic operators.
5. **Conditional Logic**: Translated COBOL's conditional statements into Java's `if-else` structure.
6. **Formatting**: Used Java's `String.format` to format the output string similarly to COBOL's `DISPLAY FUNCTION TRIM`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.