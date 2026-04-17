```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);
        int k = Integer.parseInt(parts[2]);

        char[][] tbl1 = new char[h][w];
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

        int cnt = 0;
        if (cb < k) {
            System.out.println(cnt);
            return;
        }

        for (int i = 0; i < (1 << h); i++) {
            for (int j = 0; j < (1 << w); j++) {
                char[][] tblCopy = copyTable(tbl1);

                int s = i;
                for (int i1 = 0; i1 < h; i1++) {
                    int amr = s & 1;
                    s >>= 1;
                    if (amr == 1) {
                        for (int j1 = 0; j1 < w; j1++) {
                            tblCopy[i1][j1] = '*';
                        }
                    }
                }

                s = j;
                for (int j1 = 0; j1 < w; j1++) {
                    int amr = s & 1;
                    s >>= 1;
                    if (amr == 1) {
                        for (int i1 = 0; i1 < h; i1++) {
                            tblCopy[i1][w - j1 - 1] = '*';
                        }
                    }
                }

                int cbW = countHashes(tblCopy);
                if (cbW == k) {
                    cnt++;
                }
            }
        }

        System.out.println(cnt);
    }

    private static char[][] copyTable(char[][] table) {
        char[][] copy = new char[table.length][table[0].length];
        for (int i = 0; i < table.length; i++) {
            System.arraycopy(table[i], 0, copy[i], 0, table[0].length);
        }
        return copy;
    }

    private static int countHashes(char[][] table) {
        int count = 0;
        for (char[] row : table) {
            for (char c : row) {
                if (c == '#') {
                    count++;
                }
            }
        }
        return count;
    }
}
```