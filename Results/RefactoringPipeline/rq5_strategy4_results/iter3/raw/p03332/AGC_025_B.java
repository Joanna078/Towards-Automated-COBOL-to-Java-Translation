```java
import java.math.BigInteger;
import java.util.Scanner;

public class AGC_025_B {

    private static final BigInteger MOD = BigInteger.valueOf(998244353);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(input[0]);
        int AX = Integer.parseInt(input[1]);
        int BX = Integer.parseInt(input[2]);
        int K = Integer.parseInt(input[3]);

        BigInteger[] factorial = new BigInteger[N + 1];
        BigInteger[] inverseFactorial = new BigInteger[N + 1];

        calculateFactorialsAndInverse(N, factorial, inverseFactorial);

        BigInteger sm = BigInteger.ZERO;

        for (int i = 0; i <= N; i++) {
            if (K == 0) {
                sm = sm.add(BigInteger.ONE);
                break;
            }

            int tmp = i * AX;
            if (K < tmp) {
                break;
            }

            K -= tmp;
            int dv = K / BX;
            if (K % BX == 0 && dv <= N) {
                int a = i;
                int b = dv;

                BigInteger comba = combination(a, N, factorial, inverseFactorial);
                BigInteger combb = combination(b, N, factorial, inverseFactorial);

                BigInteger result = comba.multiply(combb).mod(MOD);
                sm = sm.add(result).mod(MOD);
            }
        }

        System.out.println(sm.toString(10));
    }

    private static void calculateFactorialsAndInverse(int N, BigInteger[] factorial, BigInteger[] inverseFactorial) {
        factorial[0] = BigInteger.ONE;
        inverseFactorial[0] = BigInteger.ONE;

        for (int i = 1; i <= N; i++) {
            factorial[i] = factorial[i - 1].multiply(BigInteger.valueOf(i)).mod(MOD);
            inverseFactorial[i] = factorial[i].modInverse(MOD);
        }
    }

    private static BigInteger combination(int n, int r, BigInteger[] factorial, BigInteger[] inverseFactorial) {
        if (n < r) {
            return BigInteger.ZERO;
        }
        return factorial[n].multiply(inverseFactorial[r]).multiply(inverseFactorial[n - r]).mod(MOD);
    }
}
```