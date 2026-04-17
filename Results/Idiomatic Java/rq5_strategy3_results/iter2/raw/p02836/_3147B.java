```java
import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        int length = input.length();
        int mismatchCount = 0;

        for (int i = 0, j = length - 1; i < j; i++, j--) {
            if (input.charAt(i) != input.charAt(j)) {
                mismatchCount++;
            }
        }

        System.out.println(mismatchCount);
    }
}
```