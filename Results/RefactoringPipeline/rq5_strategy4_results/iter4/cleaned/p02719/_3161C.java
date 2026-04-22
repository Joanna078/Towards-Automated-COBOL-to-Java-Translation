import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
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

        long ans = 0;
        if (a == 0) {
            ans = 0;
        } else if (a <= k / 2) {
            ans = a;
        } else {
            ans = k - a;
        }

        System.out.println(ans);
    }
}