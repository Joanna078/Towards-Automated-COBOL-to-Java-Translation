import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.println("Enter the line: ");
        String ln = scanner.nextLine();
        
        // Data storage
        int A, B, C, K, ans;
        String[] parts = ln.split("\\s+");
        
        // Parsing input
        A = Integer.parseInt(parts[0]);
        B = Integer.parseInt(parts[1]);
        C = Integer.parseInt(parts[2]);
        K = Integer.parseInt(parts[3]);
        
        // Logic
        if (K <= A) {
            ans = K;
        } else if (K <= A + B) {
            ans = A;
        } else {
            ans = A - (K - A - B);
        }
        
        // Output
        System.out.println(String.format("%d", ans));
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **Data Storage**: Used primitive data types (`int`) instead of fixed-length strings (`PIC X(43)`).
3. **Parsing Input**: Split the input string using `split("\\s+")` to handle spaces as delimiters.
4. **Logic**: Translated the COBOL logic into equivalent Java conditional statements.
5. **Output**: Used `System.out.println` with formatted strings to match the original output behavior.
6. **Code Quality**: Utilized Java 17 features such as `String.format` for better readability and maintainability.