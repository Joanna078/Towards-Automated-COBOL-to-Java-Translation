```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int h = Integer.parseInt(inp.split(" ")[0]);
        int w = Integer.parseInt(inp.split(" ")[1]);
        int k = Integer.parseInt(inp.split(" ")[2]);

        char[][] c = new char[h][w];
        int cb = 0;
        int cw = 0;

        for (int i = 0; i < h; i++) {
            System.out.print("Enter row " + (i + 1) + ": ");
            String row = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                c[i][j] = row.charAt(j);
                if (c[i][j] == '#') {
                    cb++;
                } else {
                    cw++;
                }
            }
        }

        char[][] tbl1 = new char[h][w];
        for (int i = 0; i < h; i++) {
            tbl1[i] = c[i].clone();
        }

        int cnt = 0;
        if (cb < k) {
            cnt = 0;
        } else {
            for (int i = 0; i < Math.pow(2, h); i++) {
                for (int j = 0; j < Math.pow(2, w); j++) {
                    for (int i1 = 0; i1 < h; i1++) {
                        tbl1[i1] = c[i1].clone();
                    }

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
        scanner.close();
    }
}
```