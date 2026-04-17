import java.util.Scanner;

public class TestA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = scanner.nextInt();

        System.out.print("Enter K: ");
        int K = scanner.nextInt();

        System.out.print("Enter X: ");
        int X = scanner.nextInt();

        System.out.print("Enter Y: ");
        int Y = scanner.nextInt();

        int ans;
        if (K < N) {
            ans = K * X + (N - K) * Y;
        } else {
            ans = N * X;
        }

        System.out.printf("%09d%n", ans);
    }
}