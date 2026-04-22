```java
import java.util.Scanner;

public class ATCODER {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        if (parts.length > 0) {
            int number = Integer.parseInt(parts[0]);
            if (number == 3 || number == 5 || number == 7) {
                System.out.println(YES);
            } else {
                System.out.println(NO);
            }
        }
    }
}
```