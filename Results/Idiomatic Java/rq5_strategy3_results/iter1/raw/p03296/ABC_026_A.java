```java
import java.util.Scanner;

public class ABC_026_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine();

        int maxlen = N;
        int bk = 999;
        int cnt = 1;
        int sm = 0;
        int cur = 0;

        while (cur < maxlen) {
            int j = cur;
            while (j < maxlen && INP.charAt(j) != ' ') {
                j++;
            }

            int len = j - cur;
            String a = INP.substring(cur, cur + len);

            if (!a.equals(String.valueOf(bk))) {
                cnt /= 2;
                sm += cnt;
                cnt = 1;
                bk = Integer.parseInt(a);
            } else {
                cnt++;
            }

            cur = j + 1;
        }

        cnt /= 2;
        sm += cnt;

        String ZS = String.valueOf(sm);
        String ans = ZS.substring(ZS.length() - 3);

        System.out.println(ans);
    }
}
```