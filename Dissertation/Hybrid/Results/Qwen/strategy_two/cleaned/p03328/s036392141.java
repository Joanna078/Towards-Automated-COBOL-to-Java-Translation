import java.util.Scanner;

public class ABC_099_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        scanner.close();

        int ablen = 2;
        int cur = 1;
        char[] ab1 = new char[ablen];
        int len;
        int div;
        int s = 0;
        int t;
        int ans = 0;

        while (cur <= inp.length()) {
            int j = cur;
            while (j <= inp.length() && inp.charAt(j - 1) != ' ') {
                j++;
            }
            len = j - cur;
            System.arraycopy(inp.toCharArray(), cur - 1, ab1, 0, len);

            cur = j + 1;

            int i = 0; // Initialize the variable i
            if (i < ablen) {
                i++;
            } else {
                break;
            }
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