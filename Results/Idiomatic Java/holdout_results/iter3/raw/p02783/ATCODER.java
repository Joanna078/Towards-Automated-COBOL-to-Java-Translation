```java
import java.util.Scanner;

public class ATCODER {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String indata = scanner.nextLine();
            String[] parts = indata.split("\\s+");
            long n = Long.parseLong(parts[0]);
            long m = Long.parseLong(parts[1]);

            long g = n / m;
            long d = n % m;
            long res = g + (d > 0 ? 1 : 0);

            System.out.println(res);
        }
    }
}
```