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
```

### Explanation of Changes:
1. **Data Types**: Replaced COBOL's `PIC` data types with Java's `BigInteger` for handling large numbers.
2. **Loop Constructs**: Used Java's `for` loops instead of COBOL's `PERFORM VARYING`.
3. **Comparison**: Used `compareTo` method for comparison since `BigInteger` does not support direct equality checks with primitive types.
4. **String Operations**: Used `trim()` method to remove leading/trailing spaces from the output strings.
5. **Main Method**: Enclosed the logic inside a `main` method to make it executable as a standalone Java application.