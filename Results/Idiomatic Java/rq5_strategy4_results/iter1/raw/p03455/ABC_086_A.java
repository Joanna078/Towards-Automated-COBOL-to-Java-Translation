```java
import java.util.Scanner;

public class ABC_086_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();

        int maxlen = 2;
        int cur = 0;
        int i = 0;
        int[] ab = new int[2];
        int len;

        for (int n = 0; n < maxlen && i < 2; n++) {
            while (cur < input.length() && !Character.isWhitespace(input.charAt(cur))) {
                cur++;
            }
            len = cur - (cur == 0 ? 0 : cur - 1);
            if (len > 0) {
                ab[i] = Integer.parseInt(input.substring(cur - len, cur));
                i++;
            }
            cur++;
        }

        int x = ab[0] * ab[1];
        int d = x % 2;

        if (d == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```