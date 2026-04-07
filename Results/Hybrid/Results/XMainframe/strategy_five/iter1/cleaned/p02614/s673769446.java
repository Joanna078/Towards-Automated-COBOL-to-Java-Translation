import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp = reader.readLine();
        int h = Integer.parseInt(inp.substring(0, 2).trim());
        int w = Integer.parseInt(inp.substring(2, 4).trim());
        int k = Integer.parseInt(inp.substring(4, 6).trim());
        int cb = 0;
        int cw = 0;
        char[][] tbl1 = new char[6][6];
        for (int i = 0; i < h; i++) {
            String line = reader.readLine();
            for (int j = 0; j < w; j++) {
                char c = line.charAt(j);
                tbl1[i][j] = c;
                if (c == '#') {
                    cb++;
                } else {
                    cw++;
                }
            }
        }
        int cnt = 0;
        if (cb >= k) {
            for (int i = 0; i < Math.pow(2, h); i++) {
                for (int j = 0; j < Math.pow(2, w); j++) {
                    char[][] tblCopy = new char[6][6];
                    for (int x = 0; x < 6; x++) {
                        System.arraycopy(tbl1[x], 0, tblCopy[x], 0, 6);
                    }
                    int s = i;
                    for (int i1 = 1; i1 <= h; i1++) {
                        int amr = s % 2;
                        s /= 2;
                        if (amr == 1) {
                            for (int j1 = 1; j1 <= w; j1++) {
                                tblCopy[h - i1][j1 - 1] = '*';
                            }
                        }
                    }
                    s = j;
                    for (int j1 = 1; j1 <= w; j1++) {
                        int amr = s % 2;
                        s /= 2;
                        if (amr == 1) {
                            for (int i1 = 1; i1 <= h; i1++) {
                                tblCopy[i1 - 1][w - j1] = '*';
                            }
                        }
                    }
                    int cbW = 0;
                    for (int x = 0; x < h; x++) {
                        for (int y = 0; y < w; y++) {
                            if (tblCopy[x][y] == '#') {
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