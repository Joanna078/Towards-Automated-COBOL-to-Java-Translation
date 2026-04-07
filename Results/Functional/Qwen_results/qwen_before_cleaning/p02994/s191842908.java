import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String ln = scanner.nextLine();
        String[] parts = ln.split(" ");
        int n, l;
        
        if (parts[0].startsWith("-")) {
            n = Integer.parseInt(parts[0].substring(1));
            n = -n;
        } else {
            n = Integer.parseInt(parts[0]);
        }
        
        if (parts[1].startsWith("-")) {
            l = Integer.parseInt(parts[1].substring(1));
            l = -l;
        } else {
            l = Integer.parseInt(parts[1]);
        }
        
        // Calculation
        int ans = (n * (2 * l + n - 1)) / 2;
        if (l > 0) {
            ans -= l;
        } else if (l + n - 1 < 0) {
            ans -= (l + n - 1);
        }
        
        // Output handling
        if (ans == 0) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Used `Scanner` to read input from the console.
2. **String Splitting**: Used `split(" ")` to separate the input into two parts.
3. **Integer Parsing**: Converted the string parts to integers, handling negative signs appropriately.
4. **Calculation**: Translated the COBOL arithmetic operations into Java.
5. **Output Handling**: Printed the result directly without any formatting or additional steps.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.