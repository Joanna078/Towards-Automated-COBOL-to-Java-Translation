import java.util.Scanner;

public class ABC_092_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input N
        int N = Integer.parseInt(scanner.nextLine());

        // Input INP
        String INP = scanner.nextLine();

        // Initialize variables
        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int j;
        int k;
        int p;
        int q;
        int len;
        int sm = 0;
        char[] DX = new char[100];
        char[] A = new char[N];
        char[] ans = new char[5];

        // Process INP
        while (i <= maxlen) {
            j = cur;
            while (j <= INP.length() && INP.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            DX[i - 1] = INP.charAt(cur - 1);
            cur = j + 1;
            i++;
        }

        // Process A
        for (k = 0; k < N; k++) {
            A[k] = scanner.nextLine().charAt(0);
        }

        // Calculate sm
        for (p = 0; p < DX[0]; p++) {
            for (q = 0; q < N; q++) {
                if (p == 0) {
                    sm++;
                } else {
                    int r = (int) (A[q] / p);
                    if (r == 0) {
                        sm++;
                    }
                }
            }
        }
        sm += DX[1];

        // Convert sm to ZS
        int index = 0;
        while (sm > 0) {
            ans[index++] = (char) ('0' + sm % 10);
            sm /= 10;
        }

        // Reverse ans
        for (int l = 0; l < index / 2; l++) {
            char temp = ans[l];
            ans[l] = ans[index - 1 - l];
            ans[index - 1 - l] = temp;
        }

        // Display result
        System.out.println(new String(ans).substring(0, index));
    }
}