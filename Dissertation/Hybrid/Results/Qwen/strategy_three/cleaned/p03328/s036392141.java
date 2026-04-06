import java.util.Scanner;

public class ABC_099_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int ablen = 2;
        int cur = 1;
        int[] ab1 = new int[ablen];
        int len;
        int div;
        int s = 0;
        int t;
        int ans = 0;
        int i = 1; // Initialize i here

        while (i <= ablen) {
            int j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            ab1[i - 1] = Integer.parseInt(inp.substring(cur - 1, j));

            cur = j + 1;

            i++;
        }

        div = ab1[1] - ab1[0];

        for (int k = 1; k <= div; k++) {
            s += k;
        }

        t = s - ab1[1];
        ans = t;

        System.out.println(ans);
    }
}