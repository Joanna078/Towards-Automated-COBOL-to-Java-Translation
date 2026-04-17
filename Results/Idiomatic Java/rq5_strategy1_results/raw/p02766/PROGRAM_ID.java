```java
import java.math.BigInteger;
import java.util.Scanner;

public class PROGRAM_ID {

    private boolean initialized = false;
    private BigInteger d0 = BigInteger.ZERO;
    private BigInteger d1 = BigInteger.ZERO;
    private BigInteger d2 = BigInteger.ZERO;
    private int returnCode = 0;
    private String ln = "";
    private String n = "";
    private String k = "";
    private String cnt = "0";
    private String ans = "0";

    public static void main(String[] args) {
        new PROGRAM_ID().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        ln = scanner.nextLine();
        scanner.close();

        String[] parts = ln.split("\\s+");
        if (parts.length >= 2) {
            n = parts[0];
            k = parts[1];
        }

        if (!initialized) {
            initialize();
        }

        process();
        System.out.println("Result: " + ans);
    }

    private void initialize() {
        initialized = true;
    }

    private void process() {
        BigInteger bigN = new BigInteger(n);
        BigInteger bigK = new BigInteger(k);

        while (bigN.compareTo(bigK.pow(new BigInteger(cnt))) >= 0) {
            cnt = String.valueOf(Integer.parseInt(cnt) + 1);
        }

        ans = cnt;
    }
}
```