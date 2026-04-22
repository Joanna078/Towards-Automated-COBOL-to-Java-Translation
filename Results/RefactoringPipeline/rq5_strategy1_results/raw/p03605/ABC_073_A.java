```java
import java.util.Scanner;

public class ABC_073_A {

    private static final String YES = "Yes";
    private static final String NO = "No";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String input = scanner.nextLine().trim();

        if (input.length() != 2) {
            System.out.println("Invalid input. Please enter exactly two characters.");
            return;
        }

        char firstChar = input.charAt(0);
        char secondChar = input.charAt(1);

        if (firstChar == '9' || secondChar == '9') {
            System.out.println(YES);
        } else {
            System.out.println(NO);
        }
    }
}
```