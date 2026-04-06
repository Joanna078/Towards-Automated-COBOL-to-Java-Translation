import java.util.Scanner;

public class Answer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input values
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        long ans = 0;
        
        // Loop through the range [a, b]
        for (int i = a; i <= b; i++) {
            String str = String.format("%05d", i);
            if (str.charAt(0) == str.charAt(4) && str.charAt(1) == str.charAt(3)) {
                ans++;
            }
        }
        
        // Output the result
        System.out.println(ans);
    }
}
```

### Explanation of the Conversion:
1. **Input Handling**: The COBOL `ACCEPT` statement is replaced with a `Scanner` to read input from the console.
2. **Data Types**: COBOL's `PIC 9(5)` is equivalent to a 5-digit integer in Java, which is handled using `String.format` to ensure leading zeros.
3. **Looping**: The COBOL loop is converted to a traditional `for` loop in Java.
4. **Conditionals**: The conditional checks in COBOL are directly translated into Java's `if` statements.
5. **Output**: The COBOL `DISPLAY` statement is replaced with `System.out.println` in Java.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices.