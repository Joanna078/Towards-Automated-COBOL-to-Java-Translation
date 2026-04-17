```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().split(" ");
        int h = Integer.parseInt(parts[0]);
        int w = Integer.parseInt(parts[1]);
        int k = Integer.parseInt(parts[2]);

        char[][] table = new char[h][w];
        int cb = 0;
        int cw = 0;

        for (int i = 0; i < h; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < w; j++) {
                char c = line.charAt(j);
                table[i][j] = c;
                if (c == '#') {
                    cb++;
                } else {
                    cw++;
                }
            }
        }

        int cnt = 0;
        if (cb >= k) {
            int maxI = 1 << h;
            int maxJ = 1 << w;

            for (int i = 0; i < maxI; i++) {
                for (int j = 0; j < maxJ; j++) {
                    char[][] tempTable = copyTable(table);
                    int s = i;
                    for (int i1 = 0; i1 < h; i1++) {
                        int amr = s & 1;
                        s >>= 1;
                        if (amr == 1) {
                            for (int j1 = 0; j1 < w; j1++) {
                                tempTable[h - i1 - 1][j1] = '*';
                            }
                        }
                    }
                    s = j;
                    for (int j1 = 0; j1 < w; j1++) {
                        int amr = s & 1;
                        s >>= 1;
                        if (amr == 1) {
                            for (int i1 = 0; i1 < h; i1++) {
                                tempTable[i1][w - j1 - 1] = '*';
                            }
                        }
                    }
                    int cbW = 0;
                    for (char[] row : tempTable) {
                        for (char c : row) {
                            if (c == '#') {
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

    private static char[][] copyTable(char[][] table) {
        char[][] copy = new char[table.length][];
        for (int i = 0; i < table.length; i++) {
            copy[i] = table[i].clone();
        }
        return copy;
    }
}
```