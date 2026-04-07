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

            len = j - cur;
            if (len > 0) { // Ensure there is a substring to parse
                a = Integer.parseInt(inp.substring(cur - 1, j - 1));
                mn = Math.min(mn, a);
                mx = Math.max(mx, a);
            }

            cur = j + 1;
            i++;
        }

        mx -= mn;

        StringBuilder sb = new StringBuilder();
        sb.append(mx);
        ans = sb.toString();

        // Ensure the output is exactly 4 characters long by padding with leading zeros if necessary
        while (ans.length() < 4) {
            ans = "0" + ans;
        }

        System.out.println(ans);
    }
}
```