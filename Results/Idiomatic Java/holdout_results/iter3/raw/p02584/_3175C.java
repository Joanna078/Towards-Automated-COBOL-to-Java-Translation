```java
import java.util.Scanner;

public class Program175C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        long x = Long.parseLong(parts[0]);
        long k = Long.parseLong(parts[1]);
        long d = Long.parseLong(parts[2]);

        long wx = x;
        long s = wx / d;
        long r = wx % d;
        long za;

        if (s > 0) {
            if (x > 0) {
                if (s > k) {
                    za = x - k * d;
                    k = 0;
                } else {
                    za = x - s * d;
                    k -= s;
                }
            } else {
                if (s > k) {
                    za = x + k * d;
                    k = 0;
                } else {
                    za = x + s * d;
                    k -= s;
                }
            }
        } else {
            za = x;
        }

        if (k > 0) {
            s = k / 2;
            r = k % 2;
            if (r == 0) {
                System.out.println(za);
            } else {
                if (za > 0) {
                    System.out.println(za - d);
                } else {
                    System.out.println(za + d);
                }
            }
        } else {
            System.out.println(za);
        }
    }
}
```