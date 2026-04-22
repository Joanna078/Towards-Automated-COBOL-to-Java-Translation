import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program_Id {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inp;
        int cur = 1;
        int i = 1;
        int j;
        int jix = 1;
        int len;
        int N;
        int num = 3;
        int nm;
        int ans;
        int flg = 0;
        int[] y = new int[100];
        int[] x = new int[100];
        int[] tate = new int[100];
        int[] yoko = new int[100];
        int[] naname = new int[100];

        for (int k = 0; k < num; k++) {
            inp = reader.readLine();
            cur = 1;
            jix = 1;
            while (cur <= inp.length()) {
                j = cur;
                while (j < inp.length() && inp.charAt(j) != ' ') {
                    j++;
                }
                len = j - cur;
                nm = Integer.parseInt(inp.substring(cur - 1, j));
                y[nm] = i;
                x[nm] = jix;
                cur = j + 1;
                jix++;
            }
            i++;
        }
        N = Integer.parseInt(reader.readLine());
        for (int k = 0; k < N; k++) {
            nm = Integer.parseInt(reader.readLine());
            if (y[nm] != -1) {
                yoko[y[nm]]++;
                if (num == yoko[y[nm]]) {
                    flg = 1;
                    break;
                }
                tate[x[nm]]++;
                if (num == tate[x[nm]]) {
                    flg = 1;
                    break;
                }
                if (y[nm] == x[nm]) {
                    naname[1]++;
                    if (num == naname[1]) {
                        flg = 1;
                        break;
                    }
                }
                if (y[nm] == num - x[nm] + 1) {
                    naname[2]++;
                    if (num == naname[2]) {
                        flg = 1;
                        break;
                    }
                }
            }
        }
        if (flg == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}