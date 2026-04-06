import java.util.Scanner;

public class ABC_084_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input variables
        String inp = scanner.nextLine();
        String s = scanner.nextLine();

        // Parsing input
        int a = Character.getNumericValue(inp.charAt(0));
        int b = Character.getNumericValue(inp.charAt(1));

        // Flag variable
        boolean flag = true;

        // Loop through the string s
        for (int i = 1; i <= a + b + 1; i++) {
            if (a + 1 == i && !s.substring(i - 1, i).equals("-")) {
                flag = false;
                break;
            } else if (a + 1 != i && s.substring(i - 1, i).equals("-")) {
                flag = false;
                break;
            }
        }

        // Output result
        System.out.println(flag ? "Yes" : "No");

        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` statements with `Scanner` for reading input from the console.
2. **Parsing Input**: Used `Character.getNumericValue` to convert characters to integers.
3. **Loop and Conditionals**: Translated the `PERFORM VARYING` loop into a traditional `for` loop in Java.
4. **Flag Variable**: Changed the flag type from `PIC 9(1)` to `boolean`.
5. **String Substring**: Used `substring` method to check individual characters in the string.
6. **Output**: Simplified the output using ternary operator for better readability.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices.