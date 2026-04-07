import java.util.Scanner;

public class ABC_059_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings A and B
        System.out.println("Enter string A:");
        String A = scanner.nextLine();
        System.out.println("Enter string B:");
        String B = scanner.nextLine();

        int numA = A.length();
        int numB = B.length();

        StringBuilder strA = new StringBuilder(A);
        StringBuilder strB = new StringBuilder(B);

        // Remove leading zeros from strA
        while (strA.length() > 0 && strA.charAt(0) == '0') {
            strA.deleteCharAt(0);
        }

        // Append A to strA
        strA.append(A);

        // Remove leading zeros from strB
        while (strB.length() > 0 && strB.charAt(0) == '0') {
            strB.deleteCharAt(0);
        }

        // Append B to strB
        strB.append(B);

        // Compare strA and strB
        if (strA.toString().compareTo(strB.toString()) > 0) {
            System.out.println("GREATER");
        } else if (strA.toString().compareTo(strB.toString()) < 0) {
            System.out.println("LESS");
        } else {
            System.out.println("EQUAL");
        }
    }
}
```

### Explanation of Changes:
1. **Input Handling**: Replaced `ACCEPT` statements with `Scanner` to handle user input.
2. **String Length Calculation**: Used `length()` method instead of `FUNCTION STORED-CHAR-LENGTH`.
3. **StringBuilder**: Used `StringBuilder` for efficient string manipulation.
4. **Loop for Removing Leading Zeros**: Implemented a loop to remove leading zeros from the strings.
5. **Comparison**: Used `compareTo` method for string comparison.
6. **Modern Java Features**: Utilized modern Java 17 features such as `StringBuilder` and `String.compareTo`.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices.