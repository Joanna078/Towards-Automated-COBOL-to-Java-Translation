import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class ABC_102_A {

    private boolean initialized = false;
    private int returnCode = 0;
    private String n = "0000000000";
    private String x = "0000000000";
    private String d = "0000000000";
    private String zs = "00000000000";
    private String ans = "          ";
    private char dummy = ' ';

    public static void main(String[] args) {
        new ABC_102_A().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = scanner.nextLine().padStart(10, '0').substring(0, 10);

        BigDecimal bigN = new BigDecimal(n);
        BigDecimal divisor = new BigDecimal("2");

        x = bigN.divide(divisor, 0, BigDecimal.ROUND_DOWN).toString().padStart(10, '0').substring(0, 10);
        d = bigN.remainder(divisor).toString().padStart(10, '0').substring(0, 10);

        if (new BigInteger(d).compareTo(BigInteger.TEN) != 0) {
            bigN = bigN.multiply(new BigDecimal("2"));
            n = bigN.toString().padStart(10, '0').substring(0, 10);
        }

        zs = n;
        unans();
        System.out.println(ans.trim());
    }

    private void unans() {
        String[] parts = zs.split("\\s+");
        if (parts.length > 0) {
            ans = parts[0].substring(0, Math.min(10, parts[0].length()));
        }
    }
}