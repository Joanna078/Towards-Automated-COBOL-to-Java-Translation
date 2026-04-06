```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long lucas = lucasNumber(N);
        System.out.println(lucas);
    }

    static long lucasNumber(int n) {
        if (n == 1) {
            return 1;
        }
        long ppr = 2;
        long pr = 1;
        long lucas = 0;
        for (int i = 2; i < n; i++) {
            lucas = ppr + pr;
            ppr = pr;
            pr = lucas;
        }
        return n > 1 ? lucas : 1;
    }
}
```