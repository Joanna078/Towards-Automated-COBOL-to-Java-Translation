```java
import java.util.Scanner;

public class ABC_079_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        int d = n;
        int cnt = 0;
        int bk = -1; // Initialize bk to an invalid digit

        while (d != 0) {
            int r = d % 10;
            d /= 10;
            if (bk == r) {
                cnt++;
            }
            bk = r;
        }

        if (cnt >= 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
```