import java.util.Scanner;

public class Crackers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        System.out.println("Enter the input string:");
        String inp = scanner.nextLine();
        
        // Parsing input
        String[] parts = inp.split("\\s+");
        int inN = Integer.parseInt(parts[0]);
        int inK = Integer.parseInt(parts[1]);
        
        // Calculation
        int maisu = inN / inK;
        int amari = inN % inK;
        
        // Output based on condition
        if (amari == 0) {
            System.out.println("0");
        } else {
            System.out.println("1");
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **Parsing Input**: Used `split` method to split the input string into parts and then parsed them into integers.
3. **Calculation**: Used integer division (`/`) and modulus (`%`) operators to calculate `maisu` and `amari`.
4. **Output**: Used `System.out.println` to display the result.
5. **Resource Management**: Closed the `Scanner` object after use to avoid resource leaks.