import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int[] ab = new int[2];
        int cur = 0;
        int i = 0;
        int len = 0;

        for (int ablen = 0; ablen < 2; ablen++) {
            while (cur < inp.length() && inp.charAt(cur) == ' ') {
                cur++;
            }
            i = cur;
            while (cur < inp.length() && inp.charAt(cur) != ' ') {
                cur++;
            }
            len = cur - i;
            ab[ablen] = Integer.parseInt(inp.substring(i, cur).trim());
        }

        int diff = ab[1] - ab[0];
        int sum = 0;
        for (int j = 1; j <= diff; j++) {
            sum += j;
        }

        int t = sum - ab[1];
        System.out.printf("%011d%n", t);
    }
}