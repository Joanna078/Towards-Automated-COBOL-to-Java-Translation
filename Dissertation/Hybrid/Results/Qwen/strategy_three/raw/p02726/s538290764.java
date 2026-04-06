```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int n = Integer.parseInt(inp.split(" ")[0]);
        int x = Integer.parseInt(inp.split(" ")[1]);
        int y = Integer.parseInt(inp.split(" ")[2]);

        int sa = y - x;
        int cnt = 0;

        for (int i = 1; i < n; i++) {
            if (i == 1) {
                cnt = n;
            } else if (i == n - 1) {
                cnt = 0;
            } else {
                cnt = n - i;
            }

            int j = x - i + 1;
            int k = x + i - 1;

            if (j < 1) {
                j = 1;
            }
            if (k >= y) {
                k = y - 1;
            }

            int j1 = 0;
            int j2 = 0;

            for (int i1 = 0; i1 < i; i1++) {
                if ((j + i1 == x) || (j - i1 == x)) {
                    j1 = y;
                    j2 = y;
                } else if ((j + i1 < x) || (j - i1 > x)) {
                    continue;
                } else {
                    j1 = j + 1;
                    j2 = j - 1;
                }
            }

            if (j1 == j2) {
                if (j + i < j1) {
                    cnt++;
                }
            } else {
                if (j + i < j1 && j + i <= y && j1 <= n) {
                    cnt++;
                } else if (j + i < j1 && j + i > y && j + i <= n && j1 > n) {
                    cnt--;
                }
            }

            if (j + i < j2) {
                cnt++;
            } else if (j + i > j2 && j + i <= y) {
                cnt--;
            }
        }

        System.out.println(cnt);
    }
}
```