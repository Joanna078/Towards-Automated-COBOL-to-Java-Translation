import java.util.Arrays;
import java.util.Scanner;

public class ABC_105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nm = scanner.nextLine();
        int n = Integer.parseInt(nm.split(" ")[0]);
        int m = Integer.parseInt(nm.split(" ")[1]);

        String inp = scanner.nextLine();

        int[] x = new int[100001];
        int sx = 0;
        int cur = 1;
        int i = 1;

        while (cur <= inp.length()) {
            int j = cur;
            while (j <= inp.length() && j <= n && inp.charAt(j - 1) != ' ') {
                j++;
            }
            int len = j - cur;
            String tmp = inp.substring(cur - 1, j - 1);
            sx += Integer.parseInt(tmp);
            x[i] = sx;
            cur = j + 1;
            i++;
        }

        int[] y = new int[n + 1];
        for (i = 1; i <= n; i++) {
            y[i] = x[i] % m;
        }

        Arrays.sort(y);

        long bk = 9999999999L;
        int znum = 0;
        int[] z = new int[100001];
        int[] zcnt = new int[100001];

        for (i = 1; i <= n; i++) {
            if (bk == y[i]) {
                zcnt[znum]++;
            } else {
                bk = y[i];
                znum++;
                z[znum] = y[i];
                zcnt[znum]++;
            }
        }

        long sm = 0;
        for (i = znum; i >= 1; i--) {
            int zc = zcnt[i] - 1;
            zc *= zc;
            sm += zc / 2;
            if (z[i] == 0) {
                sm += zcnt[i];
            }
        }

        System.out.println(String.format("%d", sm));
    }
}