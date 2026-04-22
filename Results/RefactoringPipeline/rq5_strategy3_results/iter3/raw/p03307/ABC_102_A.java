```java
import java.util.Scanner;

public class ABC_102_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long N = scanner.nextLong();
        scanner.close();

        long X = N / 2;
        long D = N % 2;

        if (D != 0) {
            N *= 2;
        }

        String ZS = String.format("%11d", N);
        String ans = ZS.trim();

        System.out.println(ans);
    }
}
```