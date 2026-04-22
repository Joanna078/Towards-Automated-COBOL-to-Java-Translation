```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        String[] parts = inp.split(" ");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);
        int k = Integer.parseInt(parts[2]);

        char[][] tbl1 = new char[6][6];
        for (int i = 0; i < h; i++) {
            String cs = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                tbl1[i][j] = cs.charAt(j);
            }
        }

        char[][] tblSv = new char[6][6];
        for (int i = 0; i < 6; i++) {
            System.arraycopy(tbl1[i], 0, tblSv[i], 0, 6);
        }

        int cb = 0;
        int cw = 0;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (tbl1[i][j] == '#') {
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
                    for (int x = 0; x < 6; x++) {
                        System.arraycopy(tblSv[x], 0, tbl1[x], 0, 6);
                    }

                    int s = i;
                    for (int x = 0; x < h; x++) {
                        int amr = s % 2;
                        s /= 2;
                        if (amr == 1) {
                            for (int y = 0; y < w; y++) {
                                tbl1[h - x - 1][y] = '*';
                            }
                        }
                    }

                    s = j;
                    for (int y = 0; y < w; y++) {
                        int amr = s % 2;
                        s /= 2;
                        if (amr == 1) {
                            for (int x = 0; x < h; x++) {
                                tbl1[x][w - y - 1] = '*';
                            }
                        }
                    }

                    int cbW = 0;
                    for (int x = 0; x < h; x++) {
                        for (int y = 0; y < w; y++) {
                            if (tbl1[x][y] == '#') {
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

        System.out.printf("%04d%n", cnt);
    }
}
```