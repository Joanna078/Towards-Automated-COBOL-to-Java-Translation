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
        int len;
        int[] nk = new int[2];
        String ans = "";

        // Process input
        for (int n = 0; n < maxlen; n++) {
            int j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            nk[i - 1] = Integer.parseInt(inp.substring(cur - 1, cur - 1 + len));
            cur = j + 1;
            i++;
        }

        // Calculate result
        int x = nk[0] - nk[1] - 1;
        int r = x % (nk[1] - 1);
        if (r != 0) {
            x /= (nk[1] - 1) + 1;
        } else {
            x /= (nk[1] - 1);
        }
        x++;

        // Convert to string
        String zs = String.format("%06d", x);

        // Extract answer
        ans = zs.substring(1);

        // Display result
        System.out.println(ans.trim());

        scanner.close();
    }
}