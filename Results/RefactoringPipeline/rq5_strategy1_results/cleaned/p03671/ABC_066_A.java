import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_066_A {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);

    private int returnCode = 0;
    private String inp = "";
    private String a = "0";
    private String b = "0";
    private String c = "0";
    private String ans = "";
    private String tmp = "0";
    private String zs = "";
    private char dummy = ' ';

    public static void main(String[] args) {
        new ABC_066_A().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        if (!initialized) {
            initialize();
        }

        unstring(inp, " ", new String[]{a, b, c});
        d0 = new BigDecimal(a);
        d2 = new BigDecimal(b);
        d0 = d0.add(d2);
        d1 = new BigDecimal(c);
        d0 = d0.add(d1);
        tmp = d0.toString();

        d0 = new BigDecimal(Math.max(Integer.parseInt(a), Math.max(Integer.parseInt(b), Integer.parseInt(c))));
        c = d0.toString();
        zs = subtract(c, tmp);

        unstring(zs, " ", new String[]{String.valueOf(dummy), ans});

        System.out.println("Result: " + ans);
    }

    private void initialize() {
        initialized = true;
    }

    private void unstring(String source, String delimiter, String[] targets) {
        String[] parts = source.split(delimiter);
        for (int i = 0; i < targets.length && i < parts.length; i++) {
            targets[i] = parts[i];
        }
    }

    private String subtract(String minuend, String subtrahend) {
        BigDecimal m = new BigDecimal(minuend);
        BigDecimal s = new BigDecimal(subtrahend);
        return m.subtract(s).toString();
    }
}