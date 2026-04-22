import java.util.Scanner;

public class ProgramID {

    private static final int MAX_ENTRIES = 100;
    private static final int NUM = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] y = new int[MAX_ENTRIES];
        int[] x = new int[MAX_ENTRIES];
        int[] tate = new int[3];
        int[] yoko = new int[3];
        int[] naname = new int[2];
        boolean flg = false;

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
        scanner.nextLine(); // Consume newline

        for (int n = 0; n < N; n++) {
            int nm = scanner.nextInt();
            if (y[nm] != -1) {
                yoko[y[nm] - 1]++;
                if (NUM == yoko[y[nm] - 1]) {
                    flg = true;
                    break;
                }
                tate[x[nm] - 1]++;
                if (NUM == tate[x[nm] - 1]) {
                    flg = true;
                    break;
                }
                if (y[nm] == x[nm]) {
                    naname[0]++;
                    if (NUM == naname[0]) {
                        flg = true;
                        break;
                    }
                }
                if (y[nm] == NUM - x[nm] + 1) {
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