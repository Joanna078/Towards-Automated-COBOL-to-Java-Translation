import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxlen = sc.nextInt();
        String inp = sc.next();
        int sm = 0;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        String ans = "";
        int[] T = new int[maxlen];
        for (int k = 0; k < maxlen; k++) {
            for (j = cur; j <= inp.length() && inp.charAt(j - 1) != ' '; j++);
            len = j - cur;
            T[k] = Integer.parseInt(inp.substring(cur - 1, j - 1));
            sm += T[k];
            cur = j + 1;
            i++;
        }
        int m = sc.nextInt();
        for (int o = 0; o < m; o++) {
            int p = sc.nextInt();
            int x = sc.nextInt();
            int tmp = sm - T[p - 1] + x;
            String zs = String.format("%d", tmp);
            ans = zs.replaceAll(" ", "");
            System.out.println(ans);
        }
    }
}
