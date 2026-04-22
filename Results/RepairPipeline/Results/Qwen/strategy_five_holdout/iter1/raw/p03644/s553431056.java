```java
import java.util.Scanner;

public class ABC_068_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        int mxv = 1;
        int mxt = 0;

        for (int i = 2; i <= N; i++) {
            int t = 0;
            int tmp = i;

            while (tmp != 0) {
                t++;
                tmp /= 2;
                if (tmp % 2 == 1) {
                    break;
                }
            }

            if (mxt < t) {
                mxv = i;
                mxt = t;
            }
        }

        String ZS = String.format("%04d", mxv);

        StringBuilder ans = new StringBuilder();
        for (char c : ZS.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }

        System.out.println(ans.toString());
    }
}
```