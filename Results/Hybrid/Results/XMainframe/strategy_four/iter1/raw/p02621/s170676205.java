```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int out = (int) (a + Math.pow(a, 2) + Math.pow(a, 3));
        System.out.println(String.format("%02d", out));
    }
}
```