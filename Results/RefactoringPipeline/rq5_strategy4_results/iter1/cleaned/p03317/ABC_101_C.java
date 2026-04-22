import java.util.Scanner;

public class ABC_101_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        String inp = scanner.nextLine();
        String inp2 = scanner.nextLine();

        // Initialize variables
        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int[] nk = new int[2];
        StringBuilder ans = new StringBuilder();

        // Extract values from INP
        for (int n = 0; n < maxlen; n++) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            int len = j - cur;
            nk[i - 1] = Integer.parseInt(inp.substring(cur - 1, cur + len - 1));
            cur = j + 1;
            i++;
        }

        // Calculate X and ZS
        int x = nk[0] - nk[1] - 1;
        x /= nk[1];
        if ((nk[0] - nk[1]) % nk[1] != 0) {
            x++;
        }
        x++;

        // Convert X to string and extract last 6 characters
        String zs = String.format("%06d", x);
        ans.append(zs.substring(Math.max(0, zs.length() - 6)));

        // Display result
        System.out.println(ans.toString());
    }
}