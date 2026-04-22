```java
import java.util.Scanner;

public class ABC_092_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine();

        int maxlen = 2;
        int cur = 0;
        int i = 0;
        int[] DX = new int[maxlen];
        String[] parts = INP.split("\\s+");

        for (int j = 0; j < maxlen && j < parts.length; j++) {
            DX[i] = Integer.parseInt(parts[j]);
            cur += parts[j].length() + 1;
            i++;
        }

        int[] A = new int[N];
        for (int k = 0; k < N; k++) {
            A[k] = scanner.nextInt();
        }

        int sm = 0;
        for (int p = 0; p <= DX[0]; p++) {
            for (int q = 0; q < N; q++) {
                if (p == 0) {
                    sm++;
                } else {
                    int X = p / A[q];
                    int R = p % A[q];
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
```