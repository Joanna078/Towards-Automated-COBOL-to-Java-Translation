```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        double ans = n / 2.0 + 0.9;
        System.out.printf("%02.0f%n", ans);
    }
}
```