```java
import java.util.Scanner;

public class ABC111B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        n = (n + 110) / 111;
        n = n * 111;

        System.out.println(n);
    }
}
```