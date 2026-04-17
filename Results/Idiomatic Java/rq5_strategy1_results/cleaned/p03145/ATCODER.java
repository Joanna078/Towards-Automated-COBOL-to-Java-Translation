import java.math.BigDecimal;
import java.util.Scanner;

public class ATCODER {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private int returnCode = 0;
    private String indata = "";
    private String a1 = "0";
    private String a2 = "0";
    private String a3 = "0";
    private String r = "0";
    private String r2 = "0";
    private String disp = "";

    public static void main(String[] args) {
        new ATCODER().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        indata = scanner.nextLine();
        scanner.close();

        unstring(indata);
        computeAndDisplay();
    }

    private void unstring(String input) {
        String[] parts = input.split("\\s+");
        if (parts.length >= 3) {
            a1 = parts[0];
            a2 = parts[1];
            a3 = parts[2];
        }
    }

    private void computeAndDisplay() {
        d0 = new BigDecimal(a1).multiply(new BigDecimal(a2));
        r2 = d0.toString();
        d0 = new BigDecimal(r2).divide(new BigDecimal(2), BigDecimal.ROUND_HALF_UP);
        disp = d0.toString();
        System.out.println(disp);
    }
}