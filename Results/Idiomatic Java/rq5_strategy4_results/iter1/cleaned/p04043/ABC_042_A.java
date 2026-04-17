import java.util.Scanner;

public class ABC_042_A {

    private static final int MAXLEN = 3;
    private static final int[] ABC = new int[3];
    private static int fiveCount = 0;
    private static int sevenCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        int cur = 0;
        int i = 0;

        for (int n = 0; n < MAXLEN; n++) {
            int j = cur;
            while (j < inp.length() && !inp.substring(j, j + 1).equals(" ")) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                ABC[i] = Integer.parseInt(inp.substring(cur, cur + len));
                cur = j + 1;
                i++;
            }
        }

        for (i = 0; i < ABC.length; i++) {
            if (ABC[i] == 5) {
                fiveCount++;
            } else if (ABC[i] == 7) {
                sevenCount++;
            }
        }

        if (fiveCount == 2 && sevenCount == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}