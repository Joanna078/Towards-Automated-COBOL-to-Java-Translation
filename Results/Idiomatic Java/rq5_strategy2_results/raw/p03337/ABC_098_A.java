```java
import java.util.Scanner;

public class ABC_098_A {

    private static final int MAXLEN = 2;
    private static final int CUR_INIT = 1;
    private static final int I_INIT = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine().substring(0, 10);
        scanner.close();

        int cur = CUR_INIT;
        int i = I_INIT;
        int[] ab = new int[2];

        for (int n = 0; n < MAXLEN; n++) {
            int j = cur;
            while (j < inp.length() && !inp.substring(j, j + 1).trim().isEmpty()) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                ab[i - 1] = Integer.parseInt(inp.substring(cur - 1, cur - 1 + len).trim());
            }
            cur = j + 1;
            i++;
        }

        int ans = Math.max(Math.max(ab[0] + ab[1], ab[0] - ab[1]), ab[0] * ab[1]);
        System.out.println(ans);
    }
}
```