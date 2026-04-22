```java
import java.util.Scanner;

public class ABC_099_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        int ablen = 2;
        int cur = 1;
        int i = 1;
        int len;
        long[] ab11 = new long[2];
        long div, s = 0, t;
        String ans = "";

        for (int n = 0; n < ablen; n++) {
            int j = cur;
            while (j < inp.length() && !inp.substring(j, j + 1).trim().isEmpty()) {
                j++;
            }
            len = j - cur;
            ab11[i - 1] = Long.parseLong(inp.substring(cur - 1, cur - 1 + len).trim());
            cur = j + 1;
            i++;
        }

        div = ab11[1] - ab11[0];

        for (int k = 1; k <= div; k++) {
            s += k;
        }

        t = s - ab11[1];
        ans = String.format("%011d", t);

        System.out.println(ans);
    }
}
```