import java.util.Scanner;

public class AisingB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();
        
        // Working storage
        int cnt = 0;
        int p1 = 1;
        int swK = 1;
        
        // Logic
        for (int i = 1; i <= n; i++) {
            int p2 = p1;
            while (p2 <= inp.length() && inp.charAt(p2 - 1) != ' ') {
                p2++;
            }
            String a = inp.substring(p1 - 1, p2 - 1);
            int s = Integer.parseInt(a) / 2;
            int amr = Integer.parseInt(a) % 2;
            
            if ((swK == 1 && amr == 1)) {
                cnt++;
            }
            
            p1 = p2 + 1;
            swK = 1 - swK;
        }
        
        // Output
        System.out.println(cnt);
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` statements with `Scanner` to read input from the console.
2. **Data Types**: Converted COBOL data types to appropriate Java data types (`int`, `String`).
3. **Looping**: Used `for` loops instead of `PERFORM VARYING`.
4. **String Operations**: Used `substring` method to extract substrings.
5. **Arithmetic Operations**: Directly used arithmetic operators instead of COBOL's `DIVIDE` and `GIVING`.
6. **Conditional Statements**: Used `if` statements directly.
7. **Output**: Used `System.out.println` to display the result.

This Java code maintains the same logic and behavior as the original COBOL program.