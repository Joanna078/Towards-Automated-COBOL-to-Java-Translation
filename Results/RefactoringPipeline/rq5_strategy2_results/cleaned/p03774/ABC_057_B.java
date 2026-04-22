import java.util.Scanner;

public class ABC_057_B {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int N = Integer.parseInt(parts[0]);
        int M = Integer.parseInt(parts[1]);

        int[][] st1 = new int[N][2];
        int[][] pt1 = new int[M][2];

        for (int i = 0; i < N; i++) {
            String inp2 = scanner.nextLine();
            String[] coords = inp2.split("\\s+");
            st1[i][0] = Integer.parseInt(coords[0]);
            st1[i][1] = Integer.parseInt(coords[1]);
        }

        for (int i = 0; i < M; i++) {
            String inp2 = scanner.nextLine();
            String[] coords = inp2.split("\\s+");
            pt1[i][0] = Integer.parseInt(coords[0]);
            pt1[i][1] = Integer.parseInt(coords[1]);
        }

        for (int i = 0; i < N; i++) {
            int mn = 200000001;
            int p = 0;

            for (int j = 0; j < M; j++) {
                int dtx = st1[i][0] - pt1[j][0];
                int dty = st1[i][1] - pt1[j][1];
                int dt = Math.abs(dtx) + Math.abs(dty);

                if (dt < mn) {
                    mn = dt;
                    p = j + 1;
                }
            }

            String ans = String.format("%02d", p);
            System.out.println(ans);
        }
    }
}