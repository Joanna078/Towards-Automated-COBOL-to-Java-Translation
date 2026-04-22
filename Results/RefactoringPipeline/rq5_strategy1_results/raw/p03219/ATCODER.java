```java
import java.util.Scanner;

public class ATCODER {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String input = scanner.nextLine();
        String[] parts = input.split("\\s+");
        int a1 = Integer.parseInt(parts[0]);
        int a2 = Integer.parseInt(parts[1]);

        int result = (a1 + a2 / 2);
        System.out.printf("%04d%n", result);
    }
}
```