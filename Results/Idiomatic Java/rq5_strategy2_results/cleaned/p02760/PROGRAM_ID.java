import java.util.Scanner;

public class ProgramID {

    private static final int MAX_ENTRIES = 100;
    private static final int NUM = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] y = new int[MAX_ENTRIES][3];
        int[][] x = new int[MAX_ENTRIES][3];
        int[] tate = new int[3];
        int[] yoko = new int[3];
        int[] naname = new int[2];
        boolean flg = false;

        for (int k = 0; k < NUM; k++) {
            String inp = scanner.nextLine();
            int cur = 1;
            int jix = 1;

            for (int m = 0; m < NUM; m++) {
                int j = cur;
                while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                    j++;
                }
                int len = j - cur;
                String nm = inp.substring(cur - 1, cur + len - 1);
                int nmValue = Integer.parseInt(nm);
                y[nmValue - 1][0] = k + 1;
                x[nmValue - 1][0] = jix;
                cur = j + 1;
                jix++;
            }
        }

        int N = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int n = 0; n < N; n++) {
            int nm = scanner.nextInt();
            if (y[nm - 1][0] != -1) {
                yoko[y[nm - 1][0] - 1]++;
                if (NUM == yoko[y[nm - 1][0] - 1]) {
                    flg = true;
                    break;
                }
                tate[x[nm - 1][0] - 1]++;
                if (NUM == tate[x[nm - 1][0] - 1]) {
                    flg = true;
                    break;
                }
                if (y[nm - 1][0] == x[nm - 1][0]) {
                    naname[0]++;
                    if (NUM == naname[0]) {
                        flg = true;
                        break;
                    }
                }
                if (y[nm - 1][0] == NUM - x[nm - 1][0] + 1) {
                    naname[1]++;
                    if (NUM == naname[1]) {
                        flg = true;
                        break;
                    }
                }
            }
        }

        if (flg) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}