```java
import java.util.Scanner;

public class ABC_094_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        long[] abx = new long[3];

        while (i <= maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }

            len = j - cur;
            if (len > 0) { // Check to avoid parsing empty strings
                abx[i - 1] = Long.parseLong(inp.substring(cur - 1, j).trim());
            }

            cur = j + 1;
            i++;
        }

        if (abx[0] <= abx[2] && abx[2] <= abx[0] + abx[1]) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
```