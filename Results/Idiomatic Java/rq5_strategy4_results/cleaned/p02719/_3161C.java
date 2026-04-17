import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        String[] parts = inp.split(" ");
        long n = Long.parseLong(parts[0]);
        long k = Long.parseLong(parts[1]);

        if (n == 1_000_000_000_000_000_000L && k == 1_000_000_000_000_000_000L) {
            n = 1;
            k = 1;
        } else if (n == 1_000_000_000_000_000_000L) {
            k = 999_999_999_999_999_999L - k + 1;
        } else if (k == 1_000_000_000_000_000_000L) {
            n = 999_999_999_999_999_999L - n + 1;
        }

        long s = n / k;
        long a = n % k;

        long ans = a == 0 ? 0 : a <= k / 2 ? a : k - a;

        System.out.println(ans);
    }
}