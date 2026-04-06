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
        int[][] stx = new int[n][];
        int[][] sty = new int[n][];
        int[][] ptx = new int[m][];
        int[][] pty = new int[m][];

        // Reading and parsing input
        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            parts = line.split(" ");
            stx[i] = new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};
            sty[i] = new int[]{Integer.parseInt(parts[2]), Integer.parseInt(parts[3])};
        }

        for (int i = 0; i < m; i++) {
            String line = scanner.nextLine();
            parts = line.split(" ");
            ptx[i] = new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};
            pty[i] = new int[]{Integer.parseInt(parts[2]), Integer.parseInt(parts[3])};
        }

        // Main logic
        for (int i = 0; i < n; i++) {
            int mn = 200000001;
            int p = 0;

            for (int j = 0; j < m; j++) {
                int dtx = stx[i][0] - ptx[j][0];
                int dty = stx[i][1] - pty[j][1];
                int dt = Math.abs(dtx) + Math.abs(dty);

                if (dt < mn) {
                    mn = dt;
                    p = j;
                }
            }

            int zs = p + 1; // Adjusting for 1-based index
            char[] ans = new char[2];

            // Unans section
            String dummy = String.format("%02d", zs).replace(' ', '0');
            String result = dummy.replaceAll("\\s+", "");
            System.arraycopy(result.toCharArray(), 0, ans, 0, Math.min(result.length(), 2));

            // Output
            System.out.println(new String(ans));
        }

        scanner.close();
    }
}
```