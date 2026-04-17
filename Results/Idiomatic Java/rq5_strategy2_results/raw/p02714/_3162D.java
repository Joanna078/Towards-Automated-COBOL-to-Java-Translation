```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String S = scanner.nextLine();

        // Initialize arrays
        int[] RN = new int[4000];
        int[] GN = new int[4000];
        int[] BN = new int[4000];

        // Initialize counters
        int IR = 0, IG = 0, IB = 0;

        // Populate arrays based on input string
        for (int i = 0; i < S.length(); i++) {
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

        // Calculate KS
        int KS = 0;
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
        System.out.printf("%08d%n", KS);
    }
}
```