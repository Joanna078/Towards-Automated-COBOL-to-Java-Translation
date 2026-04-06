import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int maxlen = 3;
        int cur = 1;
        int i = 1;
        int j;

        int[] abk = new int[maxlen];
        for (int k = 0; k < maxlen; k++) {
            j = cur;
            while (j < inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            int len = j - cur;
            abk[k] = Integer.parseInt(inp.substring(cur - 1, j).trim());
            cur = j + 1;
            i++;
        }

        int m;
        int n = abk[0];
        int[] a = new int[n];
        for (m = 0; m < n; m++) {
            if (m + 1 <= abk[1]) {
                a[m] = m + 1;
            } else {
                break;
            }
        }

        int p;
        int idx = m;
        int tmp = idx;
        int idx2 = 0;
        int[] b = new int[n];
        for (p = abk[1]; p >= abk[1] - abk[2] + 1; p--) {
            if (tmp > 0 && a[tmp - 1] > p) {
                b[idx2] = p;
                idx2++;
            } else {
                break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < idx; x++) {
            sb.append(a[x]).append(" ");
        }
        System.out.println(sb.toString().trim());

        for (int y = idx2 - 1; y >= 0; y--) {
            sb.setLength(0);
            sb.append(b[y]).append(" ");
            System.out.println(sb.toString().trim());
        }
    }
}