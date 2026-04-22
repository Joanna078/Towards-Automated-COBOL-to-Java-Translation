```java
import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int A = scanner.nextInt();
        scanner.close();

        A = 3 * A * A;
        String B = String.format("%06d", A);
        System.out.println(B);
    }
}
```