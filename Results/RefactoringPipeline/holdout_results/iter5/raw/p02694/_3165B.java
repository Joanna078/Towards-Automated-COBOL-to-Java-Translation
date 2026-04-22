```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine().trim();
        scanner.close();

        int len = inp.length();
        int out;

        if (len <= 18) {
            long x = Long.parseLong(inp);
            long y = 100;
            int i = 0;

            while (i <= 3759 && y < x) {
                y += y / 100; // Adjusted to match COBOL's multiplication by 0.01
                i++;
            }

            out = i;
        } else {
            out = 3760;
        }

        System.out.printf("%03d%n", out);
    }
}
```