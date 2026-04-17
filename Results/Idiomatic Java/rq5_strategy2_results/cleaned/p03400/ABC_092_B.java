import java.util.Scanner;

public class ABC_092_B {

    private static final int MAXLEN = 2;
    private static final int CUR_INIT = 1;
    private static final int I_INIT = 1;
    private static final int K_INIT = 1;
    private static final int P_INIT = 0;
    private static final int Q_INIT = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine();

        int[] DX = new int[MAXLEN];
        int cur = CUR_INIT;
        int i = I_INIT;

        // Process INP to fill DX array
        for (int j = cur; j <= INP.length(); j++) {
            if (j == INP.length() || INP.charAt(j) == ' ') {
                int len = j - cur;
                DX[i - 1] = Integer.parseInt(INP.substring(cur - 1, cur - 1 + len));
                cur = j + 1;
                i++;
            }
        }

        int[] A = new int[N];
        for (int k = K_INIT; k <= N; k++) {
            A[k - 1] = scanner.nextInt();
        }

        int sm = 0;

        // Calculate sm
        for (int p = P_INIT; p < DX[0]; p++) {
            for (int q = Q_INIT; q <= N; q++) {
                if (p == 0) {
                    sm++;
                } else {
                    int X = p / A[q - 1];
                    int R = p % A[q - 1];
                    if (R == 0) {
                        sm++;
                    }
                }
            }
        }

        sm += DX[1];

        String ZS = String.format("%06d", sm);
        String ans = ZS.trim();

        System.out.println(ans);
    }
}