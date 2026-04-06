import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        // Input string
        String inp = "1000000000000000000 1000000000000000000";

        // Splitting the input string into two parts
        String[] parts = inp.split(" ");
        String nx = parts[0];
        String kx = parts[1];

        // Variables to hold the parsed values
        BigInteger n;
        BigInteger k;
        BigInteger s;
        BigInteger a;
        BigInteger ans;

        // Parsing the input strings to BigInteger
        n = new BigInteger(nx);
        k = new BigInteger(kx);

        // Evaluating the conditions
        if (nx.equals("1000000000000000000") && kx.equals("1000000000000000000")) {
            n = BigInteger.ONE;
            k = BigInteger.ONE;
        } else if (nx.equals("1000000000000000000")) {
            k = new BigInteger(kx);
            n = BigInteger.valueOf(999999999999999999L).subtract(k).add(BigInteger.ONE);
        } else if (kx.equals("1000000000000000000")) {
            n = new BigInteger(nx);
            k = BigInteger.valueOf(999999999999999999L).subtract(n).add(BigInteger.ONE);
        } else {
            n = new BigInteger(nx);
            k = new BigInteger(kx);
        }

        // Dividing n by k and getting the remainder
        s = n.divide(k);
        a = n.remainder(k);

        // Evaluating the final condition
        if (a.equals(BigInteger.ZERO)) {
            ans = BigInteger.ZERO;
        } else if (a.compareTo(k.divide(BigInteger.TWO)) <= 0) {
            ans = a;
        } else {
            ans = k.subtract(a);
        }

        // Printing the result
        System.out.println(ans.toString().replaceAll("\\.?0*$", ""));
    }
}