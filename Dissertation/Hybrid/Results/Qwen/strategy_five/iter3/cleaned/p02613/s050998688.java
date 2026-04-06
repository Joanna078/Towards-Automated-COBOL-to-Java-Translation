import java.util.Arrays;
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int k = 1;
        int len = 0;
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        int num = 4;
        String ans = "";
        int idx = 0;
        int zs = 0;
        String S = "";
        int[] C = new int[num];
        Arrays.fill(C, 0);
        String j1 = "AC WA TLERE";
        String[] j = j1.split(" ");
        String mul = " x ";

        while (i <= N) {
            S = scanner.nextLine();
            int ix = 1;
            while (ix <= 4) {
                if (S.equals(j[ix - 1])) {
                    idx = ix;
                    C[idx - 1] += 1;
                    break;
                }
                ix++;
            }
            i++;
        }

        i = 1;
        while (i <= num) {
            ans = "";
            zs = C[i - 1];
            ans = j[i - 1].trim() + mul + String.format("%d", zs).trim();
            System.out.println(ans.trim());
            i++;
        }
        scanner.close();
    }
}