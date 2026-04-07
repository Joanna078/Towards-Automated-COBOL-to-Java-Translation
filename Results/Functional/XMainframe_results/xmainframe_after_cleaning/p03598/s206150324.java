import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int cur = 1;
        int i = 1;
        int j;
        int len;
        int ans = 0;
        while (i <= n) {
            j = cur;
            while (s.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            int x = Integer.parseInt(s.substring(cur - 1, j));
            x = Math.min(x, k - x);
            ans += 2 * x;
            cur = j + 1;
            i++;
        }
        System.out.println(ans);
    }
}
