```java
import java.util.Scanner;

public class ABC_086_A {

    private static final int MAXLEN = 2;
    private static final int CUR_INIT = 1;
    private static final int I_INIT = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine().trim();

        int cur = CUR_INIT;
        int i = I_INIT;
        int[] ab = new int[2];

        for (int n = 0; n < MAXLEN && i <= 2; n++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                ab[i - 1] = Integer.parseInt(inp.substring(cur - 1, cur - 1 + len));
                cur = j + 1;
                i++;
            }
        }

        int x = ab[0] * ab[1];
        int d = x % 2;

        if (d == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        scanner.close();
    }
}
```