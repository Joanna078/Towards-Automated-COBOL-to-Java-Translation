import java.util.Scanner;

public class ABC_092_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine().trim();

        // Initialize variables
        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int len;
        int[] DX = new int[2];
        int[] A = new int[100];
        int sm = 0;

        // Process INP
        for (int m = 0; m < maxlen; m++) {
            for (j = cur; j <= INP.length(); j++) {
                if (INP.charAt(j - 1) == ' ') {
                    break;
                }
            }
            len = j - cur;
            DX[i - 1] = Integer.parseInt(INP.substring(cur - 1, cur - 1 + len));
            cur = j + 1;
            i++;
        }

        // Accept A array
        for (int k = 1; k <= N; k++) {
            A[k - 1] = scanner.nextInt();
        }

        // Initialize sm
        sm = 0;

        // Calculate sm
        for (int p = 0; p < DX[0]; p++) {
            for (int q = 1; q <= N; q++) {
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

        // Add DX[1] to sm
        sm += DX[1];

        // Convert sm to string
        String ZS = String.format("%06d", sm);

        // Extract ans from ZS
        String ans = ZS.substring(1);

        // Display ans
        System.out.println(ans);

        scanner.close();
    }
}