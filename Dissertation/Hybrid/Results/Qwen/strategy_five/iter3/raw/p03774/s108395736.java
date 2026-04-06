```java
import java.util.Scanner;

public class ABC_057_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input handling
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);

        // Arrays to store data
        int[] stx = new int[n];
        int[] sty = new int[n];
        int[] ptx = new int[m];
        int[] pty = new int[m];

        // Reading and parsing input
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            parts = line.split(" ");
            stx[i] = Integer.parseInt(parts[0]);
            sty[i] = Integer.parseInt(parts[1]);
        }

        for (int i = 0; i < m; i++) {
            String line = scanner.nextLine();
            parts = line.split(" ");
            ptx[i] = Integer.parseInt(parts[0]);
            pty[i] = Integer.parseInt(parts[1]);
        }

        // Main logic
        for (int i = 0; i < n; i++) {
            int mn = 200000001;
            int p = 0;

            for (int j = 0; j < m; j++) {
                int dtx = stx[i] - ptx[j];
                int dty = sty[i] - pty[j];
                int dt = dtx + dty;

                if (dt < mn) {
                    mn = dt;
                    p = j;
                }
            }

            int zs = p + 1; // Adjusting for 1-based index
            char[] ans = new char[2];

            // Unans section
            String dummy = String.format("%02d", zs);
            System.arraycopy(dummy.toCharArray(), 0, ans, 0, Math.min(dummy.length(), 2));

            // Output
            System.out.print(new String(ans));
        }

        scanner.close();
    }
}
```