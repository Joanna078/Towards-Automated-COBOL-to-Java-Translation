```java
import java.util.Scanner;

public class ABC_066_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        scanner.close();

        int len = S.length();
        int l = len - 1;
        int i = l;
        int flg = 1;

        while (i > 0) {
            flg = 1;

            if (i % 2 == 1) {
                flg = 0;
            } else {
                int k = i;
                int ini = k / 2;
                int len2 = ini;
                ini++;

                if (!S.substring(0, len2).equals(S.substring(ini - 1, ini + len2 - 1))) {
                    flg = 0;
                }
            }

            if (flg == 1) {
                break;
            }
            i--;
        }

        String ZS = String.format("%04d", i);
        String ans = ZS.trim();

        System.out.println(ans);
    }
}
```