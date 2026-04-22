```java
import java.util.Scanner;

public class ABC_057_B {

    private boolean initialized = false;
    private int returnCode = 0;
    private int i, j, N, M;
    private String INP, INP2, ans;
    private int[] st1 = new int[900];
    private int[] pt1 = new int[900];
    private int dt, dtx, dty, mn, p;

    public static void main(String[] args) {
        new ABC_057_B().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter input: ");
        INP = scanner.nextLine();

        // Unstring input
        String[] parts = INP.split("\\s+");
        N = Integer.parseInt(parts[0]);
        M = Integer.parseInt(parts[1]);

        // Perform loop for N
        for (i = 1; i <= N; i++) {
            System.out.print("Enter input for iteration " + i + ": ");
            INP2 = scanner.nextLine();
            String[] parts2 = INP2.split("\\s+");
            st1[i - 1] = Integer.parseInt(parts2[0]);
            pt1[i - 1] = Integer.parseInt(parts2[1]);
        }

        // Perform loop for M
        for (j = 1; j <= M; j++) {
            mn = 200000001;
            p = 0;

            // Nested loop for N
            for (i = 1; i <= N; i++) {
                dtx = st1[i - 1] - pt1[j - 1];
                dty = st1[i - 1] - pt1[j - 1];
                dt = dtx + dty;

                if (dt < mn) {
                    mn = dt;
                    p = j;
                }
            }

            // Move p to ZS
            ans = String.valueOf(p);

            // Display result
            System.out.println("Result: " + ans);
        }

        scanner.close();
    }
}
```