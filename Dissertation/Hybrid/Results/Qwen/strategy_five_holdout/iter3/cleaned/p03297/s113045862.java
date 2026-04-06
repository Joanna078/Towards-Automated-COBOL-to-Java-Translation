import java.util.Scanner;

public class AGC_026_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < T; i++) {
            String[] input = scanner.nextLine().split(" ");
            long A = Long.parseLong(input[0]);
            long B = Long.parseLong(input[1]);
            long C = Long.parseLong(input[2]);
            long D = Long.parseLong(input[3]);

            String result = "No";
            if (B <= A && B <= D) {
                if (B <= C) {
                    result = "Yes";
                } else {
                    long g = gcd(B, D);
                    long ad = A / g;
                    long ar = A % g;
                    long x = B - g + ar;
                    if (x <= C) {
                        result = "Yes";
                    }
                }
            }

            System.out.println(result);
        }
        scanner.close();
    }

    private static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}