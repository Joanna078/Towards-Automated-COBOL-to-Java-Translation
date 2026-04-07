import java.util.Scanner;

public class ABC_074_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input variables
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());
        String inp = scanner.nextLine();

        // Working storage
        int maxlen = n;
        int cur = 1;
        int i = 1;
        int j;
        int len;
        StringBuilder ans = new StringBuilder();
        int x;
        int sm = 0;
        String zs = "";
        char dummy;

        while (i <= maxlen) {
            j = cur;
            while (j <= maxlen && inp.charAt(j - 1) != ' ') {
                j++;
            }

            len = j - cur;
            x = Character.getNumericValue(inp.charAt(cur - 1));

            x = Math.min(x, k - x);
            sm += 2 * x;

            cur = j + 1;
            i++;
        }

        zs = String.format("%06d", sm);

        unans(zs, ans);

        System.out.println(ans.toString().trim());
    }

    private static void unans(String zs, StringBuilder ans) {
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }
    }
}