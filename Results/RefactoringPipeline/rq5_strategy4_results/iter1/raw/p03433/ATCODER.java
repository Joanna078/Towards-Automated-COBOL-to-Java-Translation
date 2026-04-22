```java
import java.util.Scanner;

public class ATCODER {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input values
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();

        // Perform division and check condition
        int g1 = a1 / 500;
        int r1 = a1 % 500;

        if (r1 <= a2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```