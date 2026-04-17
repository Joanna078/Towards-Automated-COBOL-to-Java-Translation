import java.util.Scanner;

public class ABC_095_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String inp = scanner.nextLine();
        int inp2;
        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int len;
        long nx1[] = new long[2];
        long tmp;
        int mn = 1001;
        int sm = 0;
        int x;
        String zs = "";
        String dummy = "";

        // Process input
        for (int m = 0; m < maxlen; m++) {
            for (int j = cur; j <= inp.length(); j++) {
                if (j == inp.length() || inp.charAt(j) == ' ') {
                    len = j - cur;
                    nx1[i - 1] = Long.parseLong(inp.substring(cur - 1, cur - 1 + len));
                    cur = j + 1;
                    i++;
                    break;
                }
            }
        }

        // Further processing
        for (int k = 1; k <= nx1[0]; k++) {
            inp2 = scanner.nextInt();
            sm += inp2;
            mn = Math.min(mn, inp2);
        }

        tmp = nx1[1] - sm;
        x = (int) (tmp / mn);

        nx1[0] += x;
        zs = String.format("%09d", nx1[0]);

        // Unstring operation
        String[] parts = zs.split("\\s+");
        dummy = parts[0];
        String ans = parts[1];

        // Display result
        System.out.println(ans.trim());

        scanner.close();
    }
}