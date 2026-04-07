import java.util.Scanner;

public class ABC_101_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        String n = scanner.nextLine();
        
        int num = Integer.parseInt(n);
        int sn = 0;
        
        // Calculate sum of digits
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch != ' ') {
                int now = Character.getNumericValue(ch);
                sn += now;
            }
        }
        
        // Divide sum by number and check remainder
        int x = sn / num;
        int r = sn % num;
        
        if (r == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` with `Scanner` to read input from the console.
2. **Data Types**: Converted `PIC` fields to appropriate Java data types (`int`, `char`).
3. **Looping**: Used a `for` loop instead of `PERFORM VARYING`.
4. **String Operations**: Used `charAt` and `Character.getNumericValue` to handle string operations.
5. **Division and Remainder**: Used `/` and `%` operators for division and remainder calculation.
6. **Output**: Replaced `DISPLAY` with `System.out.println`.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and using Java 17 features where applicable.