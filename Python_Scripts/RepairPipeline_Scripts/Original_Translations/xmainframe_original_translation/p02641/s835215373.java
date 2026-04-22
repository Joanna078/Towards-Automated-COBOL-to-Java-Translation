import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int x = Integer.parseInt(inp.split(" ")[0]);
        int n = Integer.parseInt(inp.split(" ")[1]);
        int p1 = 1;
        int p2;
        int idx;
        int cnt = 0;
        int out;
        if (n == 0) {
            cnt = x;
        } else {
            boolean found = false;
            for (int i = 1; i <= n; i++) {
                p2 = p1;
                while (sc.hasNext() && sc.next().charAt(0) != ' ') {
                    p2++;
                }
                idx = Integer.parseInt(inp.substring(p1, p2));
                if (idx == x) {
                    found = true;
                    break;
                }
                p1 = p2 + 1;
            }
            if (found) {
                cnt = x;
            } else {
                int left = 1;
                int right = x;
                while (left <= right) {
                    int mid = (left + right) / 2;
                    if (mid < x) {
                        left = mid + 1;
                    } else if (mid > x) {
                        right = mid - 1;
                    } else {
                        cnt = mid;
                        break;
                    }
                }
                if (cnt == 0) {
                    cnt = Math.max(x - left + 1, right - x + 1);
                }
            }
        }
        out = cnt;
        System.out.println(out);
    }
}
