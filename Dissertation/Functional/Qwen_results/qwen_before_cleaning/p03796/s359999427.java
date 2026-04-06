import java.math.BigInteger;

public class ABC_055_B {
    public static void main(String[] args) {
        // Input from user or predefined value
        int N = Integer.parseInt(System.console().readLine());

        BigInteger tmp = BigInteger.ONE;
        BigInteger INF = BigInteger.valueOf(1000000007);

        for (int i = 1; i <= N; i++) {
            tmp = tmp.multiply(BigInteger.valueOf(i)).mod(INF);
        }

        String ZS = tmp.toString();
        StringBuilder ans = new StringBuilder();

        for (char c : ZS.toCharArray()) {
            if (c != ' ') {
                ans.append(c);
            }
        }

        System.out.println(ans.toString());
    }
}
```

### Explanation of Changes:
1. **Data Types**: 
   - `i`, `N`, and `tmp` are converted to `int` and `BigInteger` respectively to handle large numbers.
   - `INF` is set as a `BigInteger`.

2. **Loop**:
   - The loop uses a standard `for` loop instead of COBOL's `PERFORM VARYING`.

3. **Modulo Operation**:
   - The modulo operation is performed using `BigInteger.mod()`.

4. **String Handling**:
   - The `UNSTRING` statement is replaced with a simple loop that appends non-space characters to a `StringBuilder`.

5. **Output**:
   - The final result is printed directly without any additional formatting.

This Java code maintains the original logic and behavior of the COBOL program while adhering to modern Java practices and syntax.