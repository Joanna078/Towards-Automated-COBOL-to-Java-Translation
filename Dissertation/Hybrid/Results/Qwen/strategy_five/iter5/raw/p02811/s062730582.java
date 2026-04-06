```java
import java.util.Scanner;

public class ABC150a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input section
        System.out.print("Enter value for K: ");
        int k = scanner.nextInt();
        System.out.print("Enter value for X: ");
        int x = scanner.nextInt();

        // Processing section
        k *= 500;
        if (k >= x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}
```