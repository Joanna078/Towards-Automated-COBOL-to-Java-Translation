import java.util.Scanner;

public class ABC_100_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().trim();

        int maxlen = 2;
        int cur = 0;
        long[] dn = new long[2];
        int i = 0;

        for (int n = 0; n < maxlen && i < 2; n++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                dn[i] = Long.parseLong(inp.substring(cur, j));
                i++;
            }
            cur = j + 1;
        }

        long tmp = (long) Math.pow(100, dn[0]) * dn[1];
        System.out.println(tmp);
    }
}