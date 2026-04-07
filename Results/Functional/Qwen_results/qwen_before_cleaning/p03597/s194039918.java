import java.util.Scanner;

public class ABC_074_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Working storage variables
        int n;
        int a;
        StringBuilder ans = new StringBuilder();

        // Input section
        System.out.print("Enter N: ");
        n = scanner.nextInt();
        System.out.print("Enter A: ");
        a = scanner.nextInt();

        // Logic section
        n = (int) Math.pow(n, 2);
        n -= a;

        // Convert result to string
        String zs = String.format("%06d", n);

        // Perform UNANS section
        unans(zs, ans);

        // Output section
        System.out.println(ans.toString().trim());

        scanner.close();
    }

    private static void unans(String zs, StringBuilder ans) {
        // Unstring logic
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced COBOL's `ACCEPT` statements with Java's `Scanner` class for reading user input.
2. **Math Operations**: Used Java's `Math.pow` method for exponentiation.
3. **String Formatting**: Used `String.format` to format the number as a zero-padded string.
4. **Unstring Logic**: Implemented the `unans` method to replicate the COBOL `UNSTRING` functionality using a simple loop.
5. **Output**: Used `System.out.println` to display the final result after trimming any trailing spaces from the `StringBuilder`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to modern Java practices and syntax.