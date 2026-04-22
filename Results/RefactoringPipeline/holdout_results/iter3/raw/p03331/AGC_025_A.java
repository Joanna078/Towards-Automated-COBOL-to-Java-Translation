```java
import java.util.Scanner;

public class AGC_025_A {

    private static final int MAX_SM = 99;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        scanner.close();

        int half = N / 2;
        int sm = MAX_SM;

        for (int i = 1; i <= half; i++) {
            int a = i;
            int b = N - i;
            int asm = 0;
            int bsm = 0;

            while (a > 0) {
                asm += a % 10;
                a /= 10;
            }

            while (b > 0) {
                bsm += b % 10;
                b /= 10;
            }

            int sum = asm + bsm;
            if (sum < sm) {
                sm = sum;
            }
        }

        System.out.println(sm);
    }
}
```