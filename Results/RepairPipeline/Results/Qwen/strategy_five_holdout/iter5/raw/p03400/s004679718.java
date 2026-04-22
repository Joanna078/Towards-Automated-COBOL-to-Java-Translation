```java
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
        int[] DX = new int[100];
        int[] A = new int[N];
        char[] ans = new char[5];

        // Process INP
        while (i <= maxlen) {
            j = cur;
            while (j <= INP.length() && INP.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            DX[i - 1] = Integer.parseInt(INP.substring(cur - 1, j - 1));
            cur = j + 1;
            i++;
        }

        // Process A
        for (k = 0; k < N; k++) {
            A[k] = Integer.parseInt(scanner.nextLine());
        }

        // Calculate sm
        for (p = 0; p <= DX[0]; p++) { // Change < to <= to include DX[0]
            for (q = 0; q < N; q++) {
                if (p == 0) {
                    sm++;
                } else {
                    int r = A[q] % p;
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
        System.out.println(new String(ans).substring(0, Math.min(index, 5)));
    }
}
```