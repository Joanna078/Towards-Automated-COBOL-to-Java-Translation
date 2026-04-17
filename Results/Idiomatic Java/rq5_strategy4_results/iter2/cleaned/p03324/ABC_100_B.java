import java.util.Scanner;

public class ABC_100_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine().trim();
        scanner.close();

        int maxlen = 2;
        int cur = 0;
        long[] dn = new long[maxlen];
        int len;

        for (int n = 0; n < maxlen; n++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                dn[n] = Long.parseLong(inp.substring(cur, j));
            }
            cur = j + 1;
        }

        long tmp = (long) Math.pow(100, dn[0]) * dn[1];
        System.out.println(tmp);
    }
}