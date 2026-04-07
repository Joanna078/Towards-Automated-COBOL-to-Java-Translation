import java.util.Scanner;

public class ABC_100_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        long ans = 0;
        long[][] DN = new long[maxlen][1];

        while (i <= maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }

            len = j - cur;
            DN[0][i - 1] = Long.parseLong(inp.substring(cur - 1, j));

            cur = j + 1;
            i++;
        }

        long tmp = (long) Math.pow(100, DN[0][0]) * DN[0][1];
        ans = tmp;

        System.out.println(ans);
    }
}