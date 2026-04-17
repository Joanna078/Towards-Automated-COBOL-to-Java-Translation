import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first line
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int x = Integer.parseInt(parts[0]);
        int n = Integer.parseInt(parts[1]);

        // Read second line
        inp = scanner.nextLine();
        int[] tbl1 = new int[102];
        int p1 = 1;
        for (int i = 0; i < n; i++) {
            int p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            int idx = Integer.parseInt(inp.substring(p1 - 1, p2));
            tbl1[idx] = 1;
            p1 = p2 + 1;
        }

        int cnt;
        if (n == 0 || tbl1[x] == 0) {
            cnt = x;
        } else {
            int idx = 1;
            while (idx <= x && tbl1[x - idx] != 0 && tbl1[x + idx] != 0) {
                idx++;
            }
            if (tbl1[x - idx] == 0) {
                cnt = x - idx;
            } else {
                cnt = x + idx;
            }
        }

        System.out.println(cnt);
    }
}