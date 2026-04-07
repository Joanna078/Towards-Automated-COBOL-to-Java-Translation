```java
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String inp = "3 3 1"; // Example input, replace with actual input
        int h = Integer.parseInt(inp.split(" ")[0]);
        int w = Integer.parseInt(inp.split(" ")[1]);
        int k = Integer.parseInt(inp.split(" ")[2]);

        char[][] c = new char[h][w];
        int cb = 0;
        int cw = 0;

        for (int i = 0; i < h; i++) {
            System.out.print("Enter row " + (i + 1) + ": ");
            String row = System.console().readLine();
            for (int j = 0; j < w; j++) {
                c[i][j] = row.charAt(j);
                if (c[i][j] == '#') {
                    cb++;
                } else {
                    cw++;
                }
            }
        }

        char[][] tbl1 = Arrays.copyOf(c, h);

        int cnt = 0;
        if (cb < k) {
            cnt = 0;
        } else {
            for (int i = 0; i < Math.pow(2, h); i++) {
                for (int j = 0; j < Math.pow(2, w); j++) {
                    tbl1 = Arrays.copyOf(c, h);

                    int s = i;
                    for (int i1 = 0; i1 < h; i1++) {
                        int amr = s % 2;
                        s /= 2;
                        if (amr == 1) {
                            for (int j1 = 0; j1 < w; j1++) {
                                tbl1[h - i1 - 1][j1] = '*';
                            }
                        }
                    }

                    s = j;
                    for (int j1 = 0; j1 < w; j1++) {
                        int amr = s % 2;
                        s /= 2;
                        if (amr == 1) {
                            for (int i1 = 0; i1 < h; i1++) {
                                tbl1[i1][w - j1 - 1] = '*';
                            }
                        }
                    }

                    int cbW = 0;
                    for (char[] row : tbl1) {
                        for (char cell : row) {
                            if (cell == '#') {
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