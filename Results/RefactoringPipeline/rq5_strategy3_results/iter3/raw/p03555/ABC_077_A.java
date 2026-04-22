```java
import java.util.Scanner;

public class ABC_077_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter C1: ");
        String c1 = scanner.nextLine().trim();

        System.out.print("Enter C2: ");
        String c2 = scanner.nextLine().trim();

        if (c1.length() != 3 || c2.length() != 3) {
            System.out.println("Invalid input. Please enter exactly 3 characters for both C1 and C2.");
            return;
        }

        if (c1.charAt(0) == c2.charAt(2) &&
            c1.charAt(1) == c2.charAt(1) &&
            c1.charAt(2) == c2.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }
}
```