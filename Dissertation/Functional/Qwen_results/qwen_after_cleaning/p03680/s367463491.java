import java.util.Arrays;

public class ABC_065_A {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());
        int[] ary = new int[100000];
        Arrays.fill(ary, 0);
        boolean[] flg = new boolean[100000];
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

        StringBuilder sb = new StringBuilder();
        sb.append(cnt);
        String ans = sb.toString();

        System.out.println(ans);
    }
}