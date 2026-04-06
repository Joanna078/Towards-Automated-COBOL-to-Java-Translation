import java.util.Scanner;

public class ABC_086_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();
        int maxlen = 2;
        int cur = 1;
        int i = 1;
        int j;
        int len;

        int[] ab = new int[maxlen];
        int x;
        int d;

        while (i <= maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }

            len = j - cur;
            if (len > 0) { // Ensure we don't parse an empty string
                ab[i - 1] = Integer.parseInt(inp.substring(cur - 1, cur - 1 + len));
            }

            cur = j + 1;
            i++;
        }

        x = ab[0] * ab[1];
        d = x % 2;

        if (d == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}