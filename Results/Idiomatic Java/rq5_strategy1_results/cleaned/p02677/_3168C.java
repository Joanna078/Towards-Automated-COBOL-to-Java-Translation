import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private BigDecimal d3 = new BigDecimal(0);
    private BigDecimal d4 = new BigDecimal(0);
    private BigDecimal d5 = new BigDecimal(0);

    private int returnCode = 0;
    private String inp = "";
    private int a = 0;
    private int b = 0;
    private int h = 0;
    private int m = 0;
    private int w = 0;
    private int ak = 0;
    private int bk = 0;
    private int sk = 0;
    private double rad = 0;
    private double cnt = 0;
    private double out = 0;

    public static void main(String[] args) {
        Main program = new Main();
        program.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input:");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split(" ");
        a = Integer.parseInt(parts[0]);
        b = Integer.parseInt(parts[1]);
        h = Integer.parseInt(parts[2]);
        m = Integer.parseInt(parts[3]);

        compute();
        displayResult();
    }

    private void compute() {
        d0 = BigDecimal.valueOf(h).multiply(BigDecimal.valueOf(30));
        d1 = BigDecimal.valueOf(m).multiply(new BigDecimal("0.05"));
        ak = d0.add(d1).intValue();

        bk = BigDecimal.valueOf(m).multiply(BigDecimal.valueOf(6)).intValue();

        sk = ak - bk;

        if (sk > 180) {
            sk = 360 - sk;
        }

        if (sk == 0) {
            cnt = a - b;
        } else if (sk == 90) {
            cnt = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        } else if (sk == 180) {
            cnt = a + b;
        } else {
            rad = Math.cos(Math.toRadians(sk));
            cnt = Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * rad;
            cnt = Math.sqrt(cnt);
        }
    }

    private void displayResult() {
        System.out.println("Result: " + cnt);
    }
}