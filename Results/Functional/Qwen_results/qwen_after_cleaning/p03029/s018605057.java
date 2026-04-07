import java.math.BigInteger;

public class AtCoder {
    public static void main(String[] args) {
        // Input data as a string
        String indata = "example input"; // Replace with actual input handling

        // Splitting the input into components
        String[] parts = indata.split(" ");
        BigInteger a1 = new BigInteger(parts[0]);
        BigInteger a2 = new BigInteger(parts[1]);
        BigInteger a3 = new BigInteger(parts[2]);

        // Calculating a2
        a2 = a2.add(a1.multiply(BigInteger.valueOf(3)));

        // Dividing a2 by 2
        BigInteger g = a2.divide(BigInteger.valueOf(2));

        // Trimming leading zeros and displaying the result
        String disp = g.stripLeading().toString();
        System.out.println(disp);
    }
}