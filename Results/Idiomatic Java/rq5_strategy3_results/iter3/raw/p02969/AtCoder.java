```java
import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        scanner.close();

        A = 3 * A * A;
        System.out.println(A);
    }
}
```