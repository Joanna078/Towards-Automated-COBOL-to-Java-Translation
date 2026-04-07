import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long A = scanner.nextLong();
        long ans = 2_000_000_000_000L;
        double sqrtA = Math.sqrt(A) + 2;
        for (long t = 1; t < sqrtA; t++) {
            long temp1 = A / t;
            long temp2 = temp1 * t;
            if (temp2 == A) {
                if (ans > t + A / t - 2) {
                    ans = t + A / t - 2;
                }
            }
        }
        System.out.println(ans);
    }
}