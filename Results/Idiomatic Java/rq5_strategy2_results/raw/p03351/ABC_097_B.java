```java
import java.util.Scanner;

public class ABC_097_B {

    private static final int MAXLEN = 4;
    private static final int CUR_INIT = 1;
    private static final int I_INIT = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine().trim();

        int[] abcd = new int[4];
        int cur = CUR_INIT;
        int i = I_INIT;

        for (int n = 0; n < MAXLEN; n++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                abcd[i - 1] = Integer.parseInt(inp.substring(cur - 1, j));
                cur = j + 1;
                i++;
            }
        }

        if (i > 3) {
            if (abcd[0] - abcd[2] <= abcd[3]) {
                System.out.println("Yes");
            } else if (abcd[0] - abcd[1] <= abcd[3] && abcd[1] - abcd[2] <= abcd[3]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
```