```java
import java.util.Scanner;

public class ABC_091_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int tmp = 0;

        while (i <= maxlen) {
            j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }

            len = j - cur;
            if (len > 0) {
                tmp += Integer.parseInt(inp.substring(cur - 1, j - 1));
            }

            cur = j + 1;
            i++;
        }

        if (inp.length() >= 16 && tmp < Integer.parseInt(inp.substring(12, 16))) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
```