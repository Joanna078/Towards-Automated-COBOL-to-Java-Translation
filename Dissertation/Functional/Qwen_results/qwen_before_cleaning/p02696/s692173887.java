import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter the values: ");
        String input = scanner.nextLine();
        
        // Splitting the input string into components
        String[] parts = input.split(" ");
        int a = Integer.parseInt(parts[0]);
        long b = Long.parseLong(parts[1]);
        long n = Long.parseLong(parts[2]);
        
        // Logic
        long x;
        if (n >= b) {
            x = b - 1;
        } else {
            x = n;
        }
        
        double fa = (a * x) / (double) b;
        double fb = x / (double) b;
        fb = a * fb;
        double out = fa - fb;
        
        // Output
        System.out.printf("%.17f%n", out);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `ACCEPT` with Java's `Scanner` to read user input.
2. **Data Types**: Changed COBOL's fixed-length picures to appropriate Java data types (`int`, `long`, `double`).
3. **String Splitting**: Used Java's `split` method to break the input string into components.
4. **Type Casting**: Added type casting where necessary to ensure correct arithmetic operations.
5. **Output Formatting**: Used `System.out.printf` to format the output as specified in the COBOL program.
6. **Comments**: Added comments to explain complex logic sections.