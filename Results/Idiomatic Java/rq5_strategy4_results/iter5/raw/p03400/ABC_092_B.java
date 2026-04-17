```java
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
        int cur = 0;
        int i = 0;
        int len;
        int[] DX = new int[maxlen];
        int[] A = new int[N];
        int sm = 0;

        // Process INP
        for (int m = 0; m < maxlen; m++) {
            int j = cur;
            while (j < INP.length() && INP.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            DX[i] = Integer.parseInt(INP.substring(cur, cur + len));
            cur = j + 1;
            i++;
        }

        // Accept A array
        for (int k = 0; k < N; k++) {
            A[k] = scanner.nextInt();
        }

        // Initialize sm
        sm = 0;

        // Calculate sm
        for (int p = 0; p <= DX[0]; p++) {
            for (int q = 0; q < N; q++) {
                if (p == 0 || p % A[q] == 0) {
                    sm++;
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
```