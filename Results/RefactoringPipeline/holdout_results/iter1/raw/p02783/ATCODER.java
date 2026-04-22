```java
import java.util.Scanner;

public class ATCODER {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String indata = scanner.nextLine();
        scanner.close();

        String[] parts = indata.split("\\s+");
        long n = Long.parseLong(parts[0]);
        long m = Long.parseLong(parts[1]);

        long g = n / m;
        long d = n % m;
        long res = g;

        if (d > 0) {
            res += 1;
        }

        System.out.printf("%04d%n", res);
    }
}
```