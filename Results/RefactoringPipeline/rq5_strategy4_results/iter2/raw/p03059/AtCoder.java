```java
import java.math.BigInteger;
import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        int temp1 = 0;
        while (temp1 < inp.length() && inp.charAt(temp1) != ' ') {
            temp1++;
        }
        BigInteger a = new BigInteger(inp.substring(0, temp1));

        temp1 += 2;
        int temp2 = temp1;
        while (temp2 < inp.length() && inp.charAt(temp2) != ' ') {
            temp2++;
        }
        BigInteger b = new BigInteger(inp.substring(temp1, temp2 - temp1));

        temp2 += 1;
        int temp3 = temp2;
        while (temp3 < inp.length() && inp.charAt(temp3) != ' ') {
            temp3++;
        }
        BigInteger c = new BigInteger(inp.substring(temp2, temp3 - temp2));

        c = c.divide(a);
        c = c.multiply(b);

        System.out.printf("%010d%n", c);
    }
}
```