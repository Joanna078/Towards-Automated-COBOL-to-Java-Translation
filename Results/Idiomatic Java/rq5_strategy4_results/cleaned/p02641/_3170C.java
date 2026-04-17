import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read first line
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int X = Integer.parseInt(parts[0]);
        int N = Integer.parseInt(parts[1]);

        // Read second line
        inp = scanner.nextLine();
        int[] P = new int[102];
        int p1 = 0;
        for (int i = 0; i < N; i++) {
            int p2 = p1;
            while (p2 < inp.length() && inp.charAt(p2) != ' ') {
                p2++;
            }
            int idx = Integer.parseInt(inp.substring(p1, p2));
            P[idx + 1] = 1;
            p1 = p2 + 1;
        }

        int cnt;
        if (N == 0 || P[X + 1] == 0) {
            cnt = X;
        } else {
            int idx = 1;
            while (idx <= X && P[X - idx + 1] != 0 && P[X + idx + 1] != 0) {
                idx++;
            }
            if (P[X - idx + 1] == 0) {
                cnt = X - idx;
            } else {
                cnt = X + idx;
            }
        }

        System.out.println(cnt);
    }
}