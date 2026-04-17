```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int k = scanner.nextInt();
        scanner.close();

        int l = k / 2;
        int ans = l * (k - l);
        System.out.printf("%03d%n", ans);
    }
}
```