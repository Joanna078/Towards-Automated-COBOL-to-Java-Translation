```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept N
        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Accept INP
        String INP = scanner.nextLine().trim();

        int[] P = new int[20];
        int P1 = 1;
        int P2 = 0;
        int I = 0;

        // Split input string into parts
        for (I = 0; I < N && P1 <= INP.length(); I++) {
            P2 = INP.indexOf(' ', P1);
            if (P2 == -1) {
                P2 = INP.length();
            }
            P[I] = Integer.parseInt(INP.substring(P1 - 1, P2));
            P1 = P2 + 1;
        }

        int K = 0;

        // Count peaks and valleys
        for (I = 1; I < N - 1; I++) {
            if ((P[I - 1] < P[I] && P[I] < P[I + 1]) ||
                (P[I - 1] > P[I] && P[I] > P[I + 1])) {
                K++;
            }
        }

        // Output the result
        System.out.println(K);
    }
}
```