import java.util.Scanner;

public class ABC_086_A {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        scanner.close();

        int maxlen = 2;
        int cur = 0;
        int i = 0;
        int[] ab = new int[2];

        for (int n = 0; n < maxlen && i < 2; n++) {
            int len = 0;
            while (cur < inp.length() && !Character.isWhitespace(inp.charAt(cur))) {
                cur++;
                len++;
            }
            if (len > 0) {
                ab[i] = Integer.parseInt(inp.substring(cur - len, cur));
                i++;
            }
            cur++;
        }

        int x = ab[0] * ab[1];
        int d = x % 2;

        if (d == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}