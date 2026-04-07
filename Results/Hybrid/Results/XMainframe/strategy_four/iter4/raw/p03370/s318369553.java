```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String INP = sc.nextLine().trim(); // Trim to remove trailing spaces
        int maxlen = 2;
        int cur = 1;
        int len = 0;
        int[] NX = new int[3];
        int i = 1;
        int j = 0;

        for (int m = 0; m < maxlen; m++) {
            for (j = cur; j <= INP.length() && INP.charAt(j - 1) != ' '; j++) ;
            len = j - cur;
            NX[i] = Integer.parseInt(INP.substring(cur - 1, j).trim()); // Trim to remove trailing spaces
            cur = j + 1;
            i++;
        }

        int sm = 0;
        int mn = 1001;
        for (int k = 1; k <= NX[1]; k++) {
            int INP2 = sc.nextInt();
            sm += INP2;
            if (INP2 < mn) {
                mn = INP2;
            }
        }

        int tmp = NX[2] - sm;
        int x = tmp / mn;

        NX[1] += x;
        String ZS = String.format("%09d", NX[1]);

        String ans = "";
        for (char c : ZS.toCharArray()) {
            if (c != ' ') {
                ans += c;
            }
        }

        System.out.println(ans);
    }
}
```