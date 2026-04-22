import java.util.Scanner;

public class ABC_097_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine().trim();
        scanner.close();

        int maxlen = 4;
        int cur = 0;
        int i = 0;
        int[] abcd = new int[4];

        for (int n = 0; n < maxlen && i < 4; n++) {
            int j = cur;
            while (j < inp.length() && !Character.isWhitespace(inp.charAt(j))) {
                j++;
            }
            int len = j - cur;
            if (len > 0) {
                abcd[i] = Integer.parseInt(inp.substring(cur, j));
                i++;
            }
            cur = j + 1;
        }

        if (i == 4) {
            if (abcd[0] - abcd[2] <= abcd[3]) {
                System.out.println("Yes");
            } else if (abcd[0] - abcd[1] <= abcd[3] && abcd[1] - abcd[2] <= abcd[3]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}