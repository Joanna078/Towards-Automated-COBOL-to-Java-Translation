```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> tbl = new ArrayList<>(Collections.nCopies(100002, 0));
        for (int i = 1; i <= 9; i++) {
            tbl.set(i - 1, i);
        }
        int l = 9;
        for (int i = 0; i < n; i++) {
            if (l >= n) break;
            int x = tbl.get(i);
            int a = x % 10;
            if (a > 0) {
                l++;
                tbl.set(l - 1, x * 10 + a - 1);
            }
            l++;
            tbl.set(l - 1, x * 10 + a);
            if (a < 9) {
                l++;
                tbl.set(l - 1, x * 10 + a + 1);
            }
        }
        System.out.println(tbl.get(n - 1));
    }
}
```