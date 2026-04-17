import java.util.Scanner;

public class ABC_095_B {

    private static final int MAXLEN = 2;
    private static final int CUR_INIT = 1;
    private static final int I_INIT = 1;
    private static final int MN_INIT = 1001;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String inp = scanner.nextLine();
        int[] nx = new int[2];
        int cur = CUR_INIT;
        int i = I_INIT;

        // Process input to extract numbers
        for (int m = 0; m < MAXLEN; m++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            int len = j - cur;
            nx[i - 1] = Integer.parseInt(inp.substring(cur, cur + len));
            cur = j + 1;
            i++;
        }

        int sm = 0;
        int mn = MN_INIT;
        int k = 1;

        // Read additional inputs and calculate sum and minimum
        while (nx[0] >= k) {
            int inp2 = scanner.nextInt();
            sm += inp2;
            mn = Math.min(mn, inp2);
            k++;
        }

        int tmp = nx[1] - sm;
        int x = tmp / mn;
        nx[0] += x;
        String zs = String.format("%09d", nx[0]);

        // Extract the result
        String ans = zs.trim();

        // Display the result
        System.out.println(ans);
    }
}