import java.util.Arrays;
import java.util.Scanner;

public class ABC_042_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int l = Integer.parseInt(parts[1]);
        
        // Array initialization
        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextLine().substring(0, l);
        }
        
        // Sorting
        Arrays.sort(s);
        
        // Result construction
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < n; i++) {
            ans.append(s[i], 0, l);
        }
        
        // Output
        System.out.println(ans.toString());
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `ACCEPT` with Java's `Scanner` to read input from the console.
2. **Array Initialization**: Used Java arrays instead of COBOL's OCCURS clause.
3. **Sorting**: Utilized Java's `Arrays.sort()` method for sorting the array.
4. **String Construction**: Used `StringBuilder` for efficient string concatenation.
5. **Output**: Printed the result directly using `System.out.println`.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and syntax.