```java
import java.util.Scanner;

public class Kyopuro {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split("\\s+");
        long n = Long.parseLong(parts[0]);
        long k = Long.parseLong(parts[1]);

        long result;
        if (k == 0) {
            result = n * n;
        } else {
            long i = k + 1;
            long t = n - k;
            long res = 0;
            for (int j = 0; j < t; j++) {
                long q = n / i;
                long r = n % i;
                res += (i - k) * q + Math.max(r - k + 1, 0);
                i++;
            }
            result = res;
        }

        System.out.println(result);
    }
}
```