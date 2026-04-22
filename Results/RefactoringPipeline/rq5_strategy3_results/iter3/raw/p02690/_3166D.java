```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value for X: ");
        long x = scanner.nextLong();

        long y = 0;
        long z = 0;

        for (int a = 1; a <= 3980 && y == 0; a++) {
            for (int b = -2500; b <= 3980 && y == 0; b++) {
                if (x == Math.pow(a, 5) - Math.pow(b, 5)) {
                    y = a;
                    z = b;
                }
            }
        }

        System.out.println(y + " " + z);
    }
}
```