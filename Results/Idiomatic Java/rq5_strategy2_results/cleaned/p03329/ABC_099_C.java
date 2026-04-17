import java.util.Scanner;

public class ABC_099_C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int N = scanner.nextInt();
        scanner.close();

        int res = N;

        for (int i = 1; i <= N; i++) {
            int t = i;
            int sumr = 0;

            while (t > 0) {
                sumr += t % 6;
                t /= 6;
            }

            t = N - i;

            while (t > 0) {
                sumr += t % 9;
                t /= 9;
            }

            res = Math.min(res, sumr);
        }

        String zs = String.format("%07d", res);
        String ans = zs.trim();

        System.out.println(ans);
    }
}