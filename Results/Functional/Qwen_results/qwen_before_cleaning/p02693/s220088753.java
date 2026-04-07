import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input K
        System.out.print("Enter K: ");
        int k = scanner.nextInt();

        // Input INP
        System.out.print("Enter INP: ");
        String inp = scanner.next();

        // Split INP into A and B
        String[] parts = inp.split(" ");
        if (parts.length != 2) {
            System.out.println("Invalid input format");
            return;
        }
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);

        // Calculate S1, S2, A1, A2
        int s1 = a / k;
        int a1 = a % k;
        int s2 = b / k;
        int a2 = b % k;

        // Check conditions
        if ((s1 >= 1 && s2 > 1) || (a1 == 0 && a > k)) {
            System.out.println("OK");
        } else {
            System.out.println("NG");
        }

        scanner.close();
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Used `Scanner` to read user input instead of COBOL's `ACCEPT`.
2. **String Splitting**: Used `split` method to split the input string into two parts.
3. **Division and Remainder Operations**: Used integer division (`/`) and modulus (`%`) operators to calculate `S1`, `S2`, `A1`, and `A2`.
4. **Conditional Logic**: Translated the conditional logic using Java's `if-else` statement.
5. **Output**: Used `System.out.println` to display the result instead of COBOL's `DISPLAY`.

This Java code maintains the same logic and behavior as the original COBOL program while adhering to Java 17 standards.