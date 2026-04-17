```java
import java.util.Scanner;

public class ABC_051_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        int K = Integer.parseInt(parts[0]);
        int S = Integer.parseInt(parts[1]);

        int cnt = 0;

        for (int i = 0; 3 * K > i; i++) {
            if (K < i) break;
            for (int j = 0; 3 * K > j; j++) {
                if (K < j) break;
                int tmp = i + j;
                if (tmp <= S && S - tmp <= K) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
```