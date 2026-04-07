import java.util.Arrays;

public class ProgramID {
    public static void main(String[] args) {
        int maxlen = 100;
        int cur = 1;
        int i = 1;
        int k = 1;
        int len = 0;
        int N = Integer.parseInt(System.console().readLine());
        int num = 4;
        String ans = "";
        int idx = 0;
        double zs = 0.0;
        String S = "";
        int[] C = new int[num];
        Arrays.fill(C, 0);
        String j1 = "AC WA TLE RE";
        char[][] j = j1.chars().mapToObj(c -> String.valueOf((char) c)).toArray(String[]::new);
        String mul = " x ";

        while (N >= i) {
            S = System.console().readLine();
            int ix = 0;
            while (ix < 4) {
                boolean found = false;
                for (; ix < 4; ix++) {
                    if (S.equals(j[ix])) {
                        idx = ix + 1;
                        C[idx - 1] += 1;
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    ix++;
                }
            }
            i++;
        }

        i = 1;
        while (num >= i) {
            ans = "";
            zs = C[i - 1];
            ans = j[i - 1].trim() + mul + String.format("%d", (int) zs).trim();
            System.out.println(ans.trim());
            i++;
        }
    }
}