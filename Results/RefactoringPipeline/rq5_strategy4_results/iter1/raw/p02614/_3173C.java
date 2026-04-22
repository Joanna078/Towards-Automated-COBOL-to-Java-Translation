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
        int cb = 0;
        int cw = 0;

        for (int i = 0; i < h; i++) {
            String cs = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                char c = cs.charAt(j);
                if (c == '#') {
                    cb++;
                } else {
                    cw++;
                }
                tbl1[i][j] = c;
            }
        }

        char[][] tblSv = new char[6][6];
        for (int i = 0; i < 6; i++) {
            System.arraycopy(tbl1[i], 0, tblSv[i], 0, 6);
        }

        int cnt = 0;
        if (cb < k) {
            System.out.println(cnt);
            return;
        }

        for (int i = 0; i < Math.pow(2, h); i++) {
            for (int j = 0; j < Math.pow(2, w); j++) {
                for (int i1 = 0; i1 < 6; i1++) {
                    System.arraycopy(tblSv[i1], 0, tbl1[i1], 0, 6);
                }

                int s = i;
                for (int i1 = 0; i1 < h; i1++) {
                    int amr = s % 2;
                    s /= 2;
                    if (amr == 1) {
                        for (int j1 = 0; j1 < w; j1++) {
                            tbl1[i1][j1] = '*';
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
                for (int i1 = 0; i1 < h; i1++) {
                    for (int j1 = 0; j1 < w; j1++) {
                        if (tbl1[i1][j1] == '#') {
                            cbW++;
                        }
                    }
                }

                if (cbW == k) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
```