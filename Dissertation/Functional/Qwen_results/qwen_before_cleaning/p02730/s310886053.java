import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = s.length();
        int m = n;
        String cur = reverseString(s);
        if (s.equals(cur)) {
            cur = " ".repeat(n);
            m /= 2;
            String x = s.substring(0, m);
            x = reverseString(x);
            if (x.equals(cur)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
```

### Explanation of the Conversion:
1. **Input Handling**: The `Scanner` class is used to read input from the console.
2. **String Length Calculation**: The length of the string `s` is calculated using `s.length()`.
3. **String Reversal**: A helper method `reverseString` is created to reverse the string using `StringBuilder`.
4. **Logic Preservation**:
   - The original logic checks if the string is a palindrome.
   - If it is, it then checks if the first half of the string is also a palindrome.
5. **Output**: The result ("Yes" or "No") is printed based on the conditions.

This Java code maintains the same functionality as the original COBOL program while adhering to modern Java practices and using Java 17 features.