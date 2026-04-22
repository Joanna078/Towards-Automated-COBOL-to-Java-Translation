```java
import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        BigInteger n = new BigInteger(arr[0]);
        BigInteger k = new BigInteger(arr[1]);
        if (n.equals(BigInteger.TEN.pow(18))) {
            if (k.equals(BigInteger.TEN.pow(18))) {
                System.out.println(1);
            } else {
                System.out.println(k.subtract(BigInteger.ONE));
            }
        } else if (k.equals(BigInteger.TEN.pow(18))) {
            System.out.println(n.subtract(BigInteger.ONE));
        } else {
            BigInteger s = n.divide(k);
            BigInteger a = n.mod(k);
            if (a.equals(BigInteger.ZERO)) {
                System.out.println(0);
            } else if (a.compareTo(k.divide(BigInteger.valueOf(2))) <= 0) {
                System.out.println(a);
            } else {
                System.out.println(k.subtract(a));
            }
        }
    }
}
```