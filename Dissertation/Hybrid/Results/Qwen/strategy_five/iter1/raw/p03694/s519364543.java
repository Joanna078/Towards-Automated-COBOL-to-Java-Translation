```java
import java.util.Scanner;

public class ABC_064_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int n = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();

        int maxlen = n;
        int cur = 1;
        int i = 1;
        int j;
        int len;

        int mn = 1001;
        int mx = 0;

        String ans = "";
        int a;

        while (i <= maxlen) {
            j = cur;
            while (j <= maxlen && inp.charAt(j - 1) != ' ') {
                j++;
            }

            if (len > 0) {
                len = j - cur;
                a = Integer.parseInt(inp.substring(cur - 1, cur + len - 1));

                mn = Math.min(mn, a);
                mx = Math.max(mx, a);
            }

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