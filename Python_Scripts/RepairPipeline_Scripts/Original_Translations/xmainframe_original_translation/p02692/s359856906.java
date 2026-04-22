import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        int abc1 = Integer.parseInt(line.split(" ")[1]);
        int abc2 = Integer.parseInt(line.split(" ")[2]);
        int abc3 = Integer.parseInt(line.split(" ")[3]);
        char[][] tbl = new char[n][];
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                line = reader.readLine().trim() + "  ";
            } else {
                line = reader.readLine().trim() + " ";
            }
            tbl[i] = line.toCharArray();
        }
        boolean flg = true;
        int j1 = 0;
        int j2 = 0;
        int j3 = 0;
        int j4 = 0;
        if (abc1 == 0 && abc2 == 0) {
            flg = false;
        } else if (abc1 < abc2) {
            ;
        } else if (abc1 > abc2) {
            j1 = 1;
            j2 = 2;
            if (abc1 == 1 && abc2 == 1) {
                line = reader.readLine();
                char c = line.charAt(0);
                if (c == 'A') {
                    j1 = 1;
                    j2 = 2;
                } else if (c == 'B') {
                    j1 = 2;
                    j2 = 3;
                } else if (c == 'C') {
                    j1 = 1;
                    j2 = 3;
                }
            }
        } else {
            flg = false;
        }
        if (flg) {
            for (int i = 0; i < n; i++) {
                if (tbl[i][j1 - 1] == 'A') {
                    abc1++;
                } else if (tbl[i][j1 - 1] == 'B') {
                    abc2++;
                } else if (tbl[i][j1 - 1] == 'C') {
                    abc3++;
                }
                if (tbl[i][j2 - 1] == 'A') {
                    abc1--;
                } else if (tbl[i][j2 - 1] == 'B') {
                    abc2--;
                } else if (tbl[i][j2 - 1] == 'C') {
                    abc3--;
                }
                System.out.println(tbl[i][j1 - 1]);
            }
        } else {
            System.out.println("No");
        }
    }
}
