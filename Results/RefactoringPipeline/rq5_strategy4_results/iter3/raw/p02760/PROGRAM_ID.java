```java
import java.util.Scanner;

public class PROGRAM_ID {

    private static final int MAX_ENTRIES = 100;
    private static final int MAX_DIMENSIONS = 3;
    private static final int NUM = 3;

    private static Scanner scanner = new Scanner(System.in);

    private static int[] y = new int[MAX_ENTRIES];
    private static int[] x = new int[MAX_ENTRIES];
    private static int[] tate = new int[MAX_DIMENSIONS];
    private static int[] yoko = new int[MAX_DIMENSIONS];
    private static int[] naname = new int[2];
    private static int flg = 0;

    public static void main(String[] args) {
        for (int k = 0; k < NUM; k++) {
            String inp = scanner.nextLine();
            int cur = 0;
            int jix = 1;
            for (int m = 0; m < NUM; m++) {
                int j = cur;
                while (j < inp.length() && inp.charAt(j) != ' ') {
                    j++;
                }
                int len = j - cur;
                String nm = inp.substring(cur, cur + len);
                int numValue = Integer.parseInt(nm);
                y[numValue] = k + 1;
                x[numValue] = jix;
                cur = j + 1;
                jix++;
            }
        }

        int N = scanner.nextInt();
        for (int n = 0; n < N; n++) {
            int nm = scanner.nextInt();
            if (y[nm] != -1) {
                yoko[y[nm] - 1]++;
                if (NUM == yoko[y[nm] - 1]) {
                    flg = 1;
                    break;
                }
                tate[x[nm] - 1]++;
                if (NUM == tate[x[nm] - 1]) {
                    flg = 1;
                    break;
                }
                if (y[nm] == x[nm]) {
                    naname[0]++;
                    if (NUM == naname[0]) {
                        flg = 1;
                        break;
                    }
                }
                if (y[nm] == NUM - x[nm] + 1) {
                    naname[1]++;
                    if (NUM == naname[1]) {
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
```