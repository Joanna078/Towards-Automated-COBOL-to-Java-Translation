import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int maxlen = 3;
        int cur = 0;
        int[] A = new int[maxlen];
        int i = 0;
        int j = 0;
        int len = 0;
        String ans = "";
        int tmp = 0;
        int sm = 0;
        String ZS = "";
        String DUMMY = "";

        for (int k = 0; k < maxlen; k++) {
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                A[i] = Integer.parseInt(inp.substring(cur, cur + len));
                i++;
            }
            cur = j + 1;
        }

        for (i = 0; i < maxlen; i++) {
            for (j = i + 1; j < maxlen; j++) {
                if (A[j] < A[i]) {
                    tmp = A[i];
                    A[i] = A[j];
                    A[j] = tmp;
                }
            }
        }

        sm = A[0] + A[1] - A[2];
        ZS = String.format("%04d", sm);
        DUMMY = ZS.substring(0, 1);
        ans = ZS.substring(1);

        System.out.println(ans);
    }
}