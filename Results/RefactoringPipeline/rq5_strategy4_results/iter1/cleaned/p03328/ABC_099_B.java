import java.util.Scanner;

public class ABC_099_B {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        String input = scanner.nextLine();
        scanner.close();

        int ablen = 2;
        int cur = 1;
        long[] ab11 = new long[2];
        int i = 1;
        int j = 0;
        int len = 0;
        long div = 0;
        long s = 0;
        long t = 0;
        long ans = 0;

        for (int n = 0; n < ablen; n++) {
            j = cur;
            while (j < input.length() && input.charAt(j) != ' ') {
                j++;
            }
            len = j - cur;
            ab11[i - 1] = Long.parseLong(input.substring(cur - 1, cur - 1 + len));
            cur = j + 1;
            i++;
        }

        div = ab11[1] - ab11[0];

        s = 0;
        i = 1;
        for (int n = 0; n < div; n++) {
            s += i;
            i++;
        }

        t = s - ab11[1];
        ans = t;

        System.out.printf("%011d%n", ans);
    }
}