```java
import java.util.Arrays;

public class ABC_065_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] ary = new int[n];
        Arrays.fill(ary, 0);
        boolean[] flg = new boolean[n];
        Arrays.fill(flg, false);

        for (int i = 0; i < n; i++) {
            ary[i] = Integer.parseInt(System.console().readLine());
        }

        flg[0] = true;
        int cnt = 0;
        int now = 0;
        boolean flg2 = false;

        while (!flg[ary[now]]) {
            cnt++;
            now = ary[now];
            flg[now] = true;
            if (now == 2) {
                flg2 = true;
                break;
            }
        }

        if (!flg2) {
            cnt = -1;
        }

        System.out.println(cnt);
    }
}
```