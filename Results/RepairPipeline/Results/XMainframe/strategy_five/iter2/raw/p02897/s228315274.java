```java
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double q = ((double) (n + 1)) / 2;
        double ans = q / (n + 1);
        System.out.printf("%.10f\n", ans);
    }
}
```