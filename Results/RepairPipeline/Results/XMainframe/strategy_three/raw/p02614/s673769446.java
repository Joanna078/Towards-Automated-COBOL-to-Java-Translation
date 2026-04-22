```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        int cb = 0;
        int cw = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (grid[i][j] == '#') {
                    cb++;
                } else {
                    cw++;
                }
            }
        }
        int cnt = 0;
        if (cb >= k) {
            for (int i = 0; i < (1 << h); i++) {
                for (int j = 0; j < (1 << w); j++) {
                    char[][] tempGrid = new char[h][w];
                    for (int x = 0; x < h; x++) {
                        for (int y = 0; y < w; y++) {
                            tempGrid[x][y] = grid[x][y];
                        }
                    }
                    int s = i;
                    for (int i1 = 1; i1 <= h; i1++) {
                        int amr = s % 2;
                        s /= 2;
                        if (amr == 1) {
                            for (int j1 = 1; j1 <= w; j1++) {
                                tempGrid[h - i1][j1 - 1] = '*';
                            }
                        }
                    }
                    s = j;
                    for (int j1 = 1; j1 <= w; j1++) {
                        int amr = s % 2;
                        s /= 2;
                        if (amr == 1) {
                            for (int i1 = 1; i1 <= h; i1++) {
                                tempGrid[i1 - 1][w - j1] = '*';
                            }
                        }
                    }
                    int cbW = 0;
                    for (int x = 0; x < h; x++) {
                        for (int y = 0; y < w; y++) {
                            if (tempGrid[x][y] == '#') {
                                cbW++;
                            }
                        }
                    }
                    if (cbW == k) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
```