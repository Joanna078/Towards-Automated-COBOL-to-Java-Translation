```java
import java.util.Scanner;

public class AGC_026_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        for (int i = 0; i < T; i++) {
            String[] input = scanner.nextLine().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            int C = Integer.parseInt(input[2]);
            int D = Integer.parseInt(input[3]);

            String result = "No";
            if (B <= A && B <= D) {
                if (B <= C) {
                    result = "Yes";
                } else {
                    int g = gcd(B, D);
                    int ad = A / g;
                    int ar = A % g;
                    int x = B - g + ar;
                    if (x <= C) {
                        result = "Yes";
                    }
                }
            }

            System.out.println(result);
        }
        scanner.close();
    }

    private static int gcd(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
}
```