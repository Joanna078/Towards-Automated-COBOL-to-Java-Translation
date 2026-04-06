import java.math.BigInteger;

public class AGC_026_B {
    public static void main(String[] args) {
        int T = Integer.parseInt(System.console().readLine());
        for (int i = 0; i < T; i++) {
            String[] input = System.console().readLine().split(" ");
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
    }

    private static int gcd(int a, int b) {
        return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue();
    }
}
```

This Java code translates the provided COBOL program into a modern Java application using Java 17 features. The `main` method reads the input, processes it according to the business logic, and prints the output. The `gcd` method calculates the greatest common divisor using the `BigInteger` class from the Java standard library.