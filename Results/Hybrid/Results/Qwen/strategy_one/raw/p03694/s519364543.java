```java
import java.util.Scanner;

public class ABC_064_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();

        int maxlen = n;
        int cur = 0;
        int i = 0;
        int j;
        int len;

        int mn = 1001;
        int mx = 0;

        String ans = "";
        int a;

        while (i < maxlen) {
            j = cur;
            while (j < maxlen && inp.charAt(j) != ' ') {
                j++;
            }

            len = j - cur;
            a = Integer.parseInt(inp.substring(cur, cur + len));

            mn = Math.min(mn, a);
            mx = Math.max(mx, a);

            cur = j + 1;
            i++;
        }

        mx -= mn;

        StringBuilder sb = new StringBuilder();
        sb.append(mx);
        ans = sb.toString().trim();

        System.out.println(ans);
    }
}
```