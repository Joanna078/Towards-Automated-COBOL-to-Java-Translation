import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter two numbers separated by space:");
        String input = scanner.nextLine();
        
        // Splitting input into two parts
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        
        // Calculation
        int ans = a + b;
        int sho = ans / 2;
        int ama = ans % 2;
        
        // Output
        if (ama == 1) {
            System.out.println("IMPOSSIBLE");
        } else {
            System.out.printf("%011d%n", sho);
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **String Splitting**: Used `split` method to separate the input string into two parts.
3. **Integer Parsing**: Converted the split strings to integers using `parseInt`.
4. **Calculation**: Performed the same arithmetic operations as in the original COBOL code.
5. **Output Formatting**: Used `printf` to format the output according to the original COBOL code's display format (`DISP PIC ZZZZZZZZZ9`).

This Java code maintains the same functionality and behavior as the original COBOL program while adhering to modern Java practices and syntax.