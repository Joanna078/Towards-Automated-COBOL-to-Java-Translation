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
        int len = 0;
        String a = "";

        for (int i = 0; i < maxlen; i++) {
            int j = cur;
            while (j < INP.length() && INP.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            a = INP.substring(cur, cur + len);

            if (!bk.equals(a)) {
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

        String ZS = String.format("%03d", sm);
        String ans = ZS.trim();

        System.out.println(ans);
    }
}
```