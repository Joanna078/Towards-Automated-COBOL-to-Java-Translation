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
        long[] DN = new long[maxlen];

        while (i <= maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }

            len = j - cur;
            if (len > 0) { // Check to avoid parsing empty strings
                DN[i - 1] = Long.parseLong(inp.substring(cur - 1, j).trim());
            }

            cur = j + 1;
            i++;
        }

        if (DN[0] >= 0 && DN[1] >= 0) { // Ensure non-negative values for power calculation
            long tmp = (long) Math.pow(100, DN[0]) * DN[1];
            ans = tmp;
        }

        System.out.println(ans);
    }
}