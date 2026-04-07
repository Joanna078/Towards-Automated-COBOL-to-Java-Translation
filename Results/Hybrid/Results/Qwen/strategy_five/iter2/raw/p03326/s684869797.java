```java
import java.util.Arrays;
import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_100_D {
    public static void main(String[] args) {
        // Data division equivalent in Java
        int n, m;
        String inp;
        BigDecimal[] a = new BigDecimal[1000];
        BigDecimal[] b = new BigDecimal[1000];
        BigDecimal[] x = new BigDecimal[1000];
        BigDecimal[] y = new BigDecimal[1000];
        BigDecimal[] z = new BigDecimal[1000];

        BigDecimal[][] c = new BigDecimal[8][1000];
        Arrays.stream(c).forEach(row -> Arrays.fill(row, BigDecimal.ZERO));

        BigDecimal mx = BigDecimal.ZERO;
        StringBuilder ans = new StringBuilder();

        // Procedure division equivalent in Java
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input:");
        inp = scanner.nextLine();

        String[] parts = inp.split("\\s+");
        n = Integer.parseInt(parts[0]);
        m = Integer.parseInt(parts[1]);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter input:");
            inp = scanner.nextLine();
            parts = inp.split("\\s+", 4);
            x[i] = new BigDecimal(parts[0]);
            y[i] = new BigDecimal(parts[1]);
            z[i] = new BigDecimal(parts[2]);

            BigDecimal sm = x[i].negate().add(y[i]).add(z[i]);
            c[0][i] = sm;

            sm = x[i].negate().add(y[i]).subtract(z[i]);
            c[1][i] = sm;

            sm = x[i].negate().subtract(y[i]).add(z[i]);
            c[2][i] = sm;

            sm = x[i].add(y[i]).add(z[i]);
            c[3][i] = sm;

            sm = x[i].negate().add(y[i]).subtract(z[i]);
            c[4][i] = sm;

            sm = x[i].add(y[i]).subtract(z[i]);
            c[5][i] = sm;

            sm = x[i].add(y[i]).add(z[i]);
            c[6][i] = sm;

            sm = x[i].negate().subtract(y[i]).subtract(z[i]);
            c[7][i] = sm;
        }

        for (int i = 0; i < 8; i++) {
            Arrays.sort(c[i], BigDecimal::compareTo);
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < 8; j++) {
                mx = mx.add(c[j][i]);
            }
        }

        ans.append(mx.toPlainString());

        System.out.println(ans.toString());
        scanner.close();
    }
}
```