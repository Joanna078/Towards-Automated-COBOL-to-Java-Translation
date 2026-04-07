```java
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