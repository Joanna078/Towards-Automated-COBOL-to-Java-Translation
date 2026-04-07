import java.math.BigInteger;

public class CombinationCalculator {

    private static final BigInteger INF = new BigInteger("998244353");
    private static final int BNY = 2;
    private static final int MAX_SIZE = 300000;

    private BigInteger[] factorial = new BigInteger[MAX_SIZE];
    private BigInteger[] inverse = new BigInteger[MAX_SIZE];
    private BigInteger[] combination = new BigInteger[MAX_SIZE];

    public void calculateCombinations(String input) {
        String[] parts = input.split(" ");
        int n = Integer.parseInt(parts[0]);
        int ax = Integer.parseInt(parts[1]);
        int bx = Integer.parseInt(parts[2]);
        int k = Integer.parseInt(parts[3]);

        calculateFactorials(n);
        calculateInverses(n);
        calculateCombinationsTable(n);

        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i <= n; i++) {
            if (k == 0) {
                sum = sum.add(BigInteger.ONE);
                break;
            }
            BigInteger a = BigInteger.valueOf(i);
            BigInteger tmp = a.multiply(BigInteger.valueOf(ax));
            if (k.compareTo(tmp) < 0) {
                break;
            }
            k = k.subtract(tmp);
            BigInteger rm = k.divide(BigInteger.valueOf(bx));
            if (rm.equals(BigInteger.ZERO) && rm.compareTo(BigInteger.valueOf(n)) <= 0) {
                BigInteger b = rm;
                BigInteger comba = BigInteger.ONE;
                if (!a.equals(BigInteger.ZERO) && !a.equals(BigInteger.valueOf(n))) {
                    if (BNY < a.intValue()) {
                        a = BigInteger.valueOf(n).subtract(a);
                    }
                    comba = combination[a.intValue()];
                }

                BigInteger combb = BigInteger.ONE;
                if (!b.equals(BigInteger.ZERO) && !b.equals(BigInteger.valueOf(n))) {
                    if (BNY < b.intValue()) {
                        b = BigInteger.valueOf(n).subtract(b);
                    }
                    combb = combination[b.intValue()];
                }

                BigInteger dvx = comba.multiply(combb).mod(INF);
                sum = sum.add(dvx);
                if (sum.compareTo(INF) >= 0) {
                    sum = sum.subtract(INF);
                }
            }
        }

        System.out.println(sum.toString());
    }

    private void calculateFactorials(int n) {
        factorial[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            factorial[i] = factorial[i - 1].multiply(BigInteger.valueOf(i)).mod(INF);
        }
    }

    private void calculateInverses(int n) {
        inverse[n] = modInverse(factorial[n], INF);
        for (int i = n - 1; i >= 0; i--) {
            inverse[i] = inverse[i + 1].multiply(BigInteger.valueOf(i + 1)).mod(INF);
        }
    }

    private void calculateCombinationsTable(int n) {
        combination[0] = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            combination[i] = factorial[i].multiply(inverse[i]).multiply(inverse[n - i]).mod(INF);
        }
    }

    private BigInteger modInverse(BigInteger a, BigInteger m) {
        return a.modPow(m.subtract(BigInteger.TWO), m);
    }

    public static void main(String[] args) {
        CombinationCalculator calculator = new CombinationCalculator();
        calculator.calculateCombinations("998244353 1 1 0");
    }
}