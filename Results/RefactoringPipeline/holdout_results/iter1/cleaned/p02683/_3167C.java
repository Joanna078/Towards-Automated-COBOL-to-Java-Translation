import java.util.Arrays;
import java.util.Scanner;

public class Program167C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);
        int X = Integer.parseInt(parts[2]);

        int[][] tbl1 = new int[N][M];
        for (int i = 0; i < N; i++) {
            inp = scanner.nextLine();
            parts = inp.split(" ");
            for (int j = 0; j < M; j++) {
                tbl1[i][j] = Integer.parseInt(parts[j]);
            }
        }

        int[] tbl2 = new int[1 << N];
        int[] cx = new int[1 << N];
        int l = 0;

        for (int i = 0; i < (1 << N); i++) {
            Arrays.fill(tbl2, 0);
            int idx = 0;
            int sho = i;
            int cw = 0;

            while (sho != 0 || idx < N) {
                if ((sho & 1) == 1) {
                    cw += tbl1[idx][0];
                }
                for (int j = 0; j < M && (sho & 1) == 1; j++) {
                    tbl2[j] += tbl1[idx][j];
                }
                sho >>= 1;
                idx++;
            }

            boolean valid = true;
            for (int j = 0; j < M; j++) {
                if (tbl2[j] < X) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                cx[l++] = cw;
            }
        }

        if (l == 0) {
            System.out.println("-1");
        } else {
            Arrays.sort(cx, 0, l);
            System.out.println(cx[0]);
        }
    }
}