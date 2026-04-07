```java
import java.util.Scanner;

public class ABC_106_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Working storage section
        char[] s = new char[100];
        int n;
        long k;
        long i;

        // Accepting input
        System.out.println("Enter string S:");
        String inputString = scanner.nextLine();
        if (inputString.length() > 100) {
            throw new IllegalArgumentException("Input string length must be less than or equal to 100");
        }
        inputString.getChars(0, inputString.length(), s, 0);
        System.out.println("Enter value of K:");
        k = scanner.nextLong();

        // Procedure division
        for (i = 1; i <= k; i++) {
            if (i > inputString.length()) {
                break;
            }
            if (s[(int) i - 1] != '1') {
                System.out.println(s[(int) i - 1]);
                return;
            }
        }

        System.out.println('1');
    }
}
```