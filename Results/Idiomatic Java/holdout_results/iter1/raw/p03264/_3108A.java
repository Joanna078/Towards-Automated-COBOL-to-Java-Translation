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
        String ansStr = String.format("%03d", ans);
        System.out.println(ansStr);
    }
}
```