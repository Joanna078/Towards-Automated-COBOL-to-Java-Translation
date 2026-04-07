import java.util.Scanner;

public class ABC_075_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input handling
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);

        char[][] field = new char[h][w];
        for (int i = 0; i < h; i++) {
            field[i] = scanner.nextLine().toCharArray();
        }

        // Directions arrays
        int[] dx = {0, 1, 0, -1, 1, 1, -1, -1};
        int[] dy = {1, 0, -1, 0, 1, -1, 1, -1};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (field[i][j] == '#') {
                    sb.append('#');
                } else {
                    int count = 0;
                    for (int k = 0; k < 8; k++) {
                        int nx = i + dx[k];
                        int ny = j + dy[k];

                        if (nx >= 0 && nx < h && ny >= 0 && ny < w && field[nx][ny] == '#') {
                            count++;
                        }
                    }
                    sb.append(count);
                }
            }
            System.out.println(sb.toString());
            sb.setLength(0); // Clear the StringBuilder for the next line
        }
    }
}