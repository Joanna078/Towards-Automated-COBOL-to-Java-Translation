import java.util.Scanner;

public class ABC_075_B {

    private static final int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
    private static final int[] dy = {1, 0, -1, 0, 1, -1, 1, -1};
    private static final char MARK1 = '#';
    private static final char MARK2 = ' ';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String inp = scanner.nextLine();
        String[] parts = inp.split("\\s+");
        int H = Integer.parseInt(parts[0]);
        int W = Integer.parseInt(parts[1]);

        // Read field data
        String[] field = new String[H];
        for (int i = 0; i < H; i++) {
            field[i] = scanner.nextLine();
        }

        // Process each row
        for (int i = 0; i < H; i++) {
            StringBuilder ln = new StringBuilder();
            for (int j = 0; j < W; j++) {
                if (field[i].charAt(j) == MARK1) {
                    ln.append(MARK1);
                } else {
                    int cnt = 0;
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];
                        if (nx >= 0 && nx < H && ny >= 0 && ny < W && field[nx].charAt(ny) == MARK1) {
                            cnt++;
                        }
                    }
                    ln.append(cnt);
                }
            }
            System.out.println(ln.toString());
        }

        scanner.close();
    }
}