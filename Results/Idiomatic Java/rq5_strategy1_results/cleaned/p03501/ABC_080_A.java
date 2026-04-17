import java.math.BigDecimal;
import java.util.Scanner;

public class ABC_080_A {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");
    private int returnCode = 0;
    private String inp = "";
    private int n = 0;
    private int t = 0;
    private int a = 0;
    private int b = 0;
    private String ans = "";

    public static void main(String[] args) {
        ABC_080_A program = new ABC_080_A();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        if (parts.length >= 3) {
            n = Integer.parseInt(parts[0]);
            a = Integer.parseInt(parts[1]);
            b = Integer.parseInt(parts[2]);
        }

        if (a * n <= b) {
            t = a * n;
        } else {
            t = b;
        }

        ans = String.valueOf(t);
        System.out.println("Result: " + ans);
    }
}