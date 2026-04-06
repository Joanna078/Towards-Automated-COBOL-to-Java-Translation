import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // Input
        BigInteger x = new BigInteger("1234567890"); // Example value for X

        // Working storage
        BigInteger y = BigInteger.ZERO;
        BigInteger z = BigInteger.ZERO;
        BigInteger cnt = BigInteger.ZERO;
        String out1 = "";
        String out2 = "";

        // Logic
        for (BigInteger a = BigInteger.ONE; a.compareTo(new BigInteger("3980")) <= 0 && y.equals(BigInteger.ZERO); a = a.add(BigInteger.ONE)) {
            for (BigInteger b = new BigInteger("-2500"); b.compareTo(new BigInteger("3980")) <= 0 && y.equals(BigInteger.ZERO); b = b.add(BigInteger.ONE)) {
                if (x.equals(a.pow(5).subtract(b.pow(5)))) {
                    y = a;
                    z = b;
                }
            }
        }

        // Output
        out1 = y.toString();
        out2 = z.toString();
        System.out.println(out1.trim() + " " + out2.trim());
    }
}