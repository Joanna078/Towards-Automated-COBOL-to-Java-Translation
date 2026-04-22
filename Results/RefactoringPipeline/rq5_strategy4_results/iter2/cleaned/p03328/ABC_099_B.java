import java.util.Scanner;

public class ABC_099_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        int ablen = 2;
        int cur = 0;
        long[] ab11 = new long[2];
        int i = 0;
        int len = 0;

        for (int n = 0; n < ablen; n++) {
            while (cur < input.length() && input.charAt(cur) == ' ') {
                cur++;
            }
            int start = cur;
            while (cur < input.length() && input.charAt(cur) != ' ') {
                cur++;
            }
            len = cur - start;
            if (len > 0) {
                ab11[i] = Long.parseLong(input.substring(start, cur));
            } else {
                ab11[i] = 0; // Handle empty input by setting to 0
            }
            i++;
        }

        long div = ab11[1] - ab11[0];
        long s = 0;

        for (long n = 1; n <= div; n++) {
            s += n;
        }

        long t = s - ab11[1];
        long ans = t;

        System.out.printf("%011d%n", ans);
    }
}