```java
import java.util.Scanner;

public class Program171C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();

        String result = convertToBase26(n);
        System.out.println(result.trim());
    }

    private static String convertToBase26(long n) {
        if (n == 0) {
            return "";
        }

        StringBuilder out = new StringBuilder(12);
        String alpha = "abcdefghijklmnopqrstuvwxyz";

        while (n > 0) {
            n--;
            long amr = n % 26;
            out.append(alpha.charAt((int) amr));
            n /= 26;
        }

        return out.reverse().toString();
    }
}
```