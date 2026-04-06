import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int h = Integer.parseInt(line.split(" ")[0]);
        int w = Integer.parseInt(line.split(" ")[1]);
        int k = Integer.parseInt(line.split(" ")[2]);
        char[][] grid = new char[h][w];
        for (int i = 0; i < h; i++) {
            grid[i] = reader.readLine().toCharArray();
        }
        int count = 0;
        for (int i = 0; i < h - k + 1; i++) {
            for (int j = 0; j < w - k + 1; j++) {
                if (isSquare(grid, i, j, k)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    private static boolean isSquare(char[][] grid, int i, int j, int k) {
        for (int x = i; x < i + k; x++) {
            for (int y = j; y < j + k; y++) {
                if (grid[x][y] != '#') {
                    return false;
                }
            }
        }
        return true;
    }
}