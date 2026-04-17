import java.util.Scanner;

public class ABC_100_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        int maxlen = 2;
        int cur = 1;
        int i = 1;
        long[] dn = new long[2];
        int len;

        for (int n = 0; n < maxlen; n++) {
            int j = cur;
            while (j <= inp.length() && !Character.isWhitespace(inp.charAt(j - 1))) {
                j++;
            }
            len = j - cur;
            if (len > 0) {
                dn[i - 1] = Long.parseLong(inp.substring(cur - 1, j - 1));
            }
            cur = j + 1;
            i++;
        }

        long tmp = (long) Math.pow(100, dn[0]) * dn[1];
        System.out.printf("%07d%n", tmp);
    }
}