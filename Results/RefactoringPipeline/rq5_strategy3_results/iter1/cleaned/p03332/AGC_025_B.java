import java.math.BigInteger;
import java.util.Scanner;

public class AGC_025_B {

    private static final BigInteger INF = BigInteger.valueOf(998244353);
    private static final int BNY = 2;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int N = Integer.parseInt(input[0]);
        int AX = Integer.parseInt(input[1]);
        int BX = Integer.parseInt(input[2]);
        int K = Integer.parseInt(input[3]);

        BigInteger[] factorial = new BigInteger[N + 1];
        BigInteger[] inverseFactorial = new BigInteger[N + 1];
        BigInteger[] combination = new BigInteger[N + 1];

        calculateFactorialsAndInverses(N, factorial, inverseFactorial);
        calculateCombinations(N, factorial, inverseFactorial, combination);

        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i <= N; i++) {
            if (K == 0) {
                sum = sum.add(BigInteger.ONE);
                break;
            }

            int tmp = AX * i;
            if (K < tmp) {
                break;
            }

            K -= tmp;
            int dv = K / BX;
            if (K % BX == 0 && dv <= N) {
                int a = i;
                int b = dv;

                BigInteger comba = combination[a];
                BigInteger combb = combination[b];

                sum = sum.add(comba.multiply(combb).mod(INF));
                sum = sum.mod(INF);
            }
        }

        System.out.println(sum.toString());
    }

    private static void calculateFactorialsAndInverses(int N, BigInteger[] factorial, BigInteger[] inverseFactorial) {
        factorial[0] = BigInteger.ONE;
        inverseFactorial[0] = BigInteger.ONE;

        for (int i = 1; i <= N; i++) {
            factorial[i] = factorial[i - 1].multiply(BigInteger.valueOf(i)).mod(INF);
            inverseFactorial[i] = factorial[i].modInverse(INF);
        }
    }

    private static void calculateCombinations(int N, BigInteger[] factorial, BigInteger[] inverseFactorial, BigInteger[] combination) {
        for (int i = 0; i <= N; i++) {
            combination[i] = factorial[N].multiply(inverseFactorial[i]).multiply(inverseFactorial[N - i]).mod(INF);
        }
    }
}