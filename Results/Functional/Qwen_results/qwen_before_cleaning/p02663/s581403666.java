import java.util.Scanner;

public class NomuraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter the time difference string (HH MM HH MM K): ");
        String inp = scanner.nextLine();
        
        // Parsing
        String[] parts = inp.split(" ");
        int h1 = Integer.parseInt(parts[0]);
        int m1 = Integer.parseInt(parts[1]);
        int h2 = Integer.parseInt(parts[2]);
        int m2 = Integer.parseInt(parts[3]);
        int k = Integer.parseInt(parts[4]);
        
        // Calculation
        int w = h2 * 60 + m2 - (h1 * 60 + m1);
        int out = w - k;
        
        // Output
        System.out.printf("%03d%n", out);
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Used `Scanner` to read input from the console.
2. **Parsing**: Split the input string using `split(" ")` and parsed each part into integers.
3. **Calculation**: The calculation logic remains the same.
4. **Output**: Used `System.out.printf` with `%03d` to format the output as a three-digit number, similar to the original COBOL `DISPLAY FUNCTION TRIM(OUT)`.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and syntax.