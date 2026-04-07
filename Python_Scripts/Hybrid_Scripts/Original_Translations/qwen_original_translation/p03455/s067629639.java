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

        String[] ab = new String[maxlen];
        int x;
        int d;

        while (i <= maxlen) {
            j = cur;
            while (j < inp.length() && inp.charAt(j) != ' ') {
                j++;
            }

            len = j - cur;
            ab[i - 1] = inp.substring(cur - 1, cur - 1 + len);

            cur = j + 1;
            i++;
        }

        x = Integer.parseInt(ab[0]) * Integer.parseInt(ab[1]);
        d = x % 2;

        if (d == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}