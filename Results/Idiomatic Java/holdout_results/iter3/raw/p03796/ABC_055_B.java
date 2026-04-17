```java
import java.math.BigInteger;
import java.util.Scanner;

public class ABC_055_B {

    private static final BigInteger INF = BigInteger.valueOf(1000000007);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.close();

        BigInteger tmp = BigInteger.ONE;
        for (int i = 1; i <= N; i++) {
            tmp = tmp.multiply(BigInteger.valueOf(i)).mod(INF);
        }

        String result = tmp.toString();
        System.out.println(result);
    }
}
```