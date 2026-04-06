import java.util.Scanner;

public class ABC_070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter values separated by spaces: ");
        String inp = scanner.nextLine();
        
        // Parsing input
        String[] parts = inp.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int d = Integer.parseInt(parts[3]);
        
        // Compute max and min
        int mx = Math.max(a, c);
        int mn = Math.min(b, d);
        
        if (mx < mn) {
            mn -= mx;
        } else {
            mn = 0;
        }
        
        // Convert result to string
        String zs = String.format("%03d", mn);
        
        // Reverse string
        StringBuilder sb = new StringBuilder(zs).reverse();
        String ans = sb.toString().trim();
        
        // Output
        System.out.println(ans.substring(0, ans.length()));
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read user input from the console.
2. **Parsing Input**: Used `split` method to parse the input string into individual components.
3. **Math Functions**: Replaced `FUNCTION MAX` and `FUNCTION MIN` with `Math.max` and `Math.min`.
4. **String Formatting**: Used `String.format` to format the integer as a zero-padded string.
5. **String Reversal**: Used `StringBuilder` to reverse the string.
6. **Output**: Simplified the output using `System.out.println`.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices.