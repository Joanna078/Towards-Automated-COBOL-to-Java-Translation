import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String INP = sc.nextLine();
        int cur = 1;
        int maxlen = 2;
        int[] NX = new int[3];
        int i = 1;

        for (int m = 1; m <= maxlen; m++) {
            int j = cur;
            while (j <= INP.length() && INP.charAt(j - 1) != ' ') {
                j++;
            }
            int len = j - cur;
            NX[i] = Integer.parseInt(INP.substring(cur - 1, cur + len - 1));
            cur = j + 1;
            i++;
        }

        int sm = 0;
        int mn = 1001;
        for (int k = 1; k <= NX[1]; k++) {
            int INP2 = sc.nextInt();
            sm += INP2;
            if (INP2 < mn) {
                mn = INP2;
            }
        }

        int tmp = NX[2] - sm;
        int x = tmp / mn;
        int ans = NX[1] + x;
        String ZS = String.format("%09d", ans);
        String ansStr = ZS.replaceAll("^0*", "");
        System.out.println(ansStr);
    }
}