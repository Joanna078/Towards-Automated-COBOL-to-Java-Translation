import java.util.Scanner;

public class ABC_098_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine().trim();
        scanner.close();

        int maxlen = 2;
        int cur = 0;
        int i = 0;
        int[] ab = new int[2];

        for (int n = 0; n < maxlen && i < 2; n++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                ab[i] = Integer.parseInt(inp.substring(cur, j));
                i++;
            }
            cur = j + 1;
        }

        int ans = Math.max(Math.max(ab[0] + ab[1], ab[0] - ab[1]), ab[0] * ab[1]);
        System.out.println(ans);
    }
}