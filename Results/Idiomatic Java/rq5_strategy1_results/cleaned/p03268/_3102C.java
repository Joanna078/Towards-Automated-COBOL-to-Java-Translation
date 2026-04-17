import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private BigDecimal n = BigDecimal.ZERO;
    private BigDecimal k = BigDecimal.ZERO;
    private BigDecimal s = BigDecimal.ZERO;
    private int a = 0;
    private BigDecimal s1 = BigDecimal.ZERO;
    private BigInteger cnt = BigInteger.ZERO;
    private BigInteger out = BigInteger.ZERO;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        unstring(inp);
        divideAndCompute();
        displayResult();
    }

    private void unstring(String input) {
        String[] parts = input.split(" ");
        if (parts.length >= 3) {
            n = new BigDecimal(parts[0]);
            k = new BigDecimal(parts[1]);
            s = new BigDecimal(parts[2]);
        }
    }

    private void divideAndCompute() {
        s1 = k.divide(n, 4, BigDecimal.ROUND_HALF_UP);
        a = k.remainder(n).intValue();

        if (a == 0) {
            cnt = s1.pow(3);
        } else {
            cnt = s1.pow(3);
            if (s.compareTo(BigDecimal.valueOf(5)) < 0) {
                cnt = cnt.add(s1.pow(3));
            } else {
                cnt = cnt.add(s1.add(BigDecimal.ONE)).pow(3);
            }
        }
        out = cnt;
    }

    private void displayResult() {
        System.out.println("Output: " + out);
    }
}