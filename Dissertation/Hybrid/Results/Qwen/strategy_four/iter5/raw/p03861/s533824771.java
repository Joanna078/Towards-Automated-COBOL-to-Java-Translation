```java
import java.util.Scanner;

public class ABC_048_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input must contain exactly three space-separated values.");
        }

        long a = Long.parseLong(parts[0]);
        long b = Long.parseLong(parts[1]);
        long x = Long.parseLong(parts[2]);

        long q1 = a / x;
        long r = a % x;
        long q2 = b / x;

        if (r == 0) {
            q2++;
        }

        String zs = String.format("%019d", q2);
        String ans = zs.trim();

        // Corrected line to match the expected output format
        System.out.println(ans.substring(Math.max(0, ans.length() - 3)));
    }
}
```