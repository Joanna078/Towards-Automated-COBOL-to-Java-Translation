```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double w1;
        int n2w = 10;
        int gk = 0;
        int m1 = 0;
        int m2 = 0;
        int i;
        int out;

        for (i = 1; i <= 5; i++) {
            n = scanner.nextInt();
            w1 = (n % 100) * 10 + 9;
            w1 = w1 * 10;
            if (n / 100 > 0 && n / 100 < n2w) {
                gk += m1 - m2 + n;
                m1 = (int) w1;
                m2 = n;
                n2w = n / 100;
            } else {
                gk += w1;
            }
        }

        out = gk;
        System.out.println(out);
    }
}
```