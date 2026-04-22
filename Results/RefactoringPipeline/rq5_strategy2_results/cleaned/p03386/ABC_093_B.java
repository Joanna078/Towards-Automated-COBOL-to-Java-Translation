import java.util.Scanner;

public class ABC_093_B {

    private static final int MAXLEN = 3;
    private static final int ARRAY_SIZE = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        int[] abk = new int[3];
        int[] a = new int[ARRAY_SIZE];
        int[] b = new int[ARRAY_SIZE];

        int cur = 0;
        int i = 0;

        // Extract numbers from input string
        for (int k = 0; k < MAXLEN; k++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                abk[i] = Integer.parseInt(inp.substring(cur, j));
                cur = j + 1;
                i++;
            }
        }

        int idx = 1;
        for (int m = abk[0]; m <= abk[0] + abk[2] - 1; m++) {
            if (m <= abk[1]) {
                a[idx++] = m;
            } else {
                break;
            }
        }

        int idx2 = 1;
        int tmp = idx - 1;
        for (int p = abk[1]; p >= abk[1] - abk[2] + 1; p--) {
            if (a[tmp] < p) {
                b[idx2++] = p;
            } else {
                break;
            }
        }

        idx--;
        for (int m = 1; m <= idx; m++) {
            System.out.print(a[m] + " ");
        }

        idx2--;
        for (int p = idx2; p >= 1; p--) {
            System.out.print(b[p] + " ");
        }
    }
}