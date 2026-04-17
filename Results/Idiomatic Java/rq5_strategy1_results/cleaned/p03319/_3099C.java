import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private BigDecimal d3 = new BigDecimal(0);

    private int returnCode = 0;
    private String inp = "";
    private int n = 0;
    private int k = 0;
    private String out = "";

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine().trim();

        unstring(inp);
        compute();
        display();
    }

    private void unstring(String input) {
        String[] parts = input.split("\\s+");
        if (parts.length >= 2) {
            n = Integer.parseInt(parts[0]);
            k = Integer.parseInt(parts[1]);
        }
    }

    private void compute() {
        d0 = BigDecimal.valueOf(n).subtract(BigDecimal.valueOf(2));
        d2 = BigDecimal.valueOf(k).subtract(BigDecimal.ONE);
        d0 = d0.divide(d2, BigDecimal.ROUND_HALF_UP);
        d0 = d0.add(BigDecimal.ONE);
        out = String.format("%06d", d0.intValue());
    }

    private void display() {
        System.out.println(out.trim());
    }
}