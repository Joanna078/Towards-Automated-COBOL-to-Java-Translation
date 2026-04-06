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

        if (n == 1) {
            cnt = n;
        } else if (n == 2) {
            cnt = 0;
        } else {
            cnt = n - 1;
        }

        int j = x - 1;
        int k = x + 1;

        if (j < 1) {
            j = 1;
        }
        if (k >= y) {
            k = y - 1;
        }

        for (int i = j; i <= k; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                if ((i + i1 == x) || (i - i1 == x)) {
                    int j1 = y;
                    int j2 = y;
                    System.out.println(j1 + " " + j2);
                } else if ((i + i1 < x) || (i - i1 > x)) {
                    continue;
                } else {
                    int j1 = i + 1;
                    int j2 = i - 1;
                    System.out.println(j1 + " " + j2);
                }
            }
        }

        // Move the declaration of j1 and j2 outside the loop
        int j1 = y;
        int j2 = y;

        if (j1 == j2) {
            if (j + n < j1) {
                cnt++;
            }
        } else {
            if (j + n < j1 && j + n <= y && j1 <= n) {
                cnt++;
            } else if (j + n < j1 && j + n > y && j + n <= n && j1 > n) {
                cnt--;
            }
        }

        if (j + n < j2) {
            cnt++;
        } else if (j + n > j2 && j + n <= y) {
            cnt--;
        }

        System.out.println(cnt);
    }
}
```