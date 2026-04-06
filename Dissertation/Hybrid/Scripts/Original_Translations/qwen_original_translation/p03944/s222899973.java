import java.util.Scanner;

public class ABC_047_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int w = Integer.parseInt(parts[0]);
        int h = Integer.parseInt(parts[1]);
        int n = Integer.parseInt(parts[2]);

        int xs = 0;
        int xl = w;
        int ys = 0;
        int yl = h;

        for (int i = 0; i < n; i++) {
            String inp2 = scanner.nextLine();
            parts = inp2.split(" ");
            int x = Integer.parseInt(parts[0]);
            int y = Integer.parseInt(parts[1]);
            int a = Integer.parseInt(parts[2]);

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

        int sq = xl <= xs || yl <= ys ? 0 : (xl - xs) * (yl - ys);

        StringBuilder ans = new StringBuilder();
        ans.append(sq);

        System.out.println(ans.toString());
    }
}