import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        scanner.close();

        long[] tbl = new long[100002];
        for (int i = 1; i <= 9; i++) {
            tbl[i] = i;
        }

        int l = 9;
        for (int i = 1; i <= n && l < n; i++) {
            long x = tbl[i];
            long s = x / 10;
            int a = (int) (x % 10);

            if (a > 0) {
                tbl[++l] = x * 10 + a - 1;
            }
            tbl[++l] = x * 10 + a;
            if (a < 9) {
                tbl[++l] = x * 10 + a + 1;
            }
        }

        System.out.println(tbl[n]);
    }
}