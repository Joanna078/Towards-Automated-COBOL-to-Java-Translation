```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int l = k / 2;
        int ans = l * (k - l);
        String anss = String.format("%d", ans);
        System.out.println(anss);
    }
}
```