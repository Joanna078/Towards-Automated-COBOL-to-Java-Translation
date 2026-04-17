```java
import java.util.Scanner;

public class ABC_047_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first line
        String[] input = scanner.nextLine().split("\\s+");
        int W = Integer.parseInt(input[0]);
        int H = Integer.parseInt(input[1]);
        int N = Integer.parseInt(input[2]);

        int xs = 0;
        int xl = W;
        int ys = 0;
        int yl = H;

        for (int i = 0; i < N; i++) {
            String[] coordinates = scanner.nextLine().split("\\s+");
            int x = Integer.parseInt(coordinates[0]);
            int y = Integer.parseInt(coordinates[1]);
            int a = Integer.parseInt(coordinates[2]);

            switch (a) {
                case 1:
                    xs = Math.max(xs, x);
                    break;
                case 2:
                    xl = Math.min(xl, x);
                    break;
                case 3:
                    ys = Math.max(ys, y);
                    break;
                case 4:
                    yl = Math.min(yl, y);
                    break;
            }
        }

        int sq = 0;
        if (xl > xs && yl > ys) {
            sq = (xl - xs) * (yl - ys);
        }

        System.out.println(String.format("%05d", sq));
    }
}
```