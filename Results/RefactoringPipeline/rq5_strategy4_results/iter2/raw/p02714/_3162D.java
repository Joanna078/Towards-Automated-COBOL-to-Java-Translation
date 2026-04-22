```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input N and S
        int N = scanner.nextInt();
        String S = scanner.next();

        // Initialize arrays
        int[] RN = new int[N];
        int[] GN = new int[N];
        int[] BN = new int[N];

        // Initialize counters
        int IR = 0;
        int IG = 0;
        int IB = 0;

        // Populate arrays based on input string S
        for (int i = 0; i < N; i++) {
            char ch = S.charAt(i);
            switch (ch) {
                case 'R':
                    RN[IR++] = i + 1;
                    break;
                case 'G':
                    GN[IG++] = i + 1;
                    break;
                case 'B':
                    BN[IB++] = i + 1;
                    break;
            }
        }

        int KS = 0;

        // Calculate KS based on conditions
        for (int i = 0; i < IR; i++) {
            for (int j = 0; j < IG; j++) {
                for (int k = 0; k < IB; k++) {
                    int S1 = RN[i] - GN[j];
                    int S2 = GN[j] - BN[k];
                    int S3 = RN[i] - BN[k];

                    if (!(S1 == S2 || S1 == S3 || S2 == S3)) {
                        KS++;
                    }
                }
            }
        }

        // Output the result
        System.out.println(KS);
    }
}
```