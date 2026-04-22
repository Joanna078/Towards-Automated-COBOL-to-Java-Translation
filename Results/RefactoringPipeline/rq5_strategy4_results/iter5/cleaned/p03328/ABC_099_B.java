import java.util.Scanner;

public class ABC_099_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine().trim();
        scanner.close();

        int ablen = 2;
        long[] ab11 = new long[ablen];
        int cur = 0;

        for (int i = 0; i < ablen; i++) {
            while (cur < input.length() && Character.isWhitespace(input.charAt(cur))) {
                cur++;
            }
            int start = cur;
            while (cur < input.length() && !Character.isWhitespace(input.charAt(cur))) {
                cur++;
            }
            if (start < cur) {
                ab11[i] = Long.parseLong(input.substring(start, cur));
            }
        }

        long div = ab11[1] - ab11[0];
        long s = div * (div + 1) / 2;
        long t = s - ab11[1];
        long ans = t;

        System.out.printf("%011d%n", ans);
    }
}