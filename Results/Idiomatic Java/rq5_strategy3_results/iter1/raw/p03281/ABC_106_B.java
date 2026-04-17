```java
import java.util.Scanner;

public class ABC_106_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        scanner.close();

        int cnt = 0;

        for (int i = 1; i <= N; i += 2) {
            int tmp = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    tmp++;
                }
            }
            if (tmp == 8) {
                cnt++;
            }
        }

        String ans = String.format("%03d", cnt);
        System.out.println(ans.trim());
    }
}
```