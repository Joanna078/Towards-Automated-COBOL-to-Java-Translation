```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int k = sc.nextInt();

        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int len;
        int mx = 0;
        int tmp = 0;
        String ans = "";
        String zs = "000000";
        int[][] abc = new int[4][2];
        char dummy = ' ';

        for (int m = 0; m < maxlen; m++) {
            int j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                abc[i][0] = Integer.parseInt(inp.substring(cur - 1, cur - 1 + len));
            }
            cur = j + 1;
            i++;
        }

        tmp = abc[1][0] + abc[2][0] + abc[3][0];
        mx = Math.max(abc[1][0], Math.max(abc[2][0], abc[3][0]));

        tmp -= mx;
        mx *= Math.pow(2, k);
        tmp += mx;

        zs = String.format("%06d", tmp);

        String[] parts = zs.split("(?<=\\G.)(?=\\p{Lu})");
        ans = parts[1];

        System.out.println(ans);
    }
}
```