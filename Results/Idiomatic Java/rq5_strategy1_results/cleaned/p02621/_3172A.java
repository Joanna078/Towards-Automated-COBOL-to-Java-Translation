import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");
    private BigDecimal d3 = new BigDecimal("0");

    private int returnCode = 0;
    private String inputA = "0";
    private String outputOUT = "0";

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        inputA = scanner.nextLine();
        scanner.close();

        // Convert input to BigDecimal
        BigDecimal a = new BigDecimal(inputA);

        // Compute
        d0 = a;
        d2 = a.pow(2);
        d0 = d0.add(d2);
        d1 = a.pow(3);
        d0 = d0.add(d1);

        // Format output
        outputOUT = d0.toString();

        // Display output
        System.out.println("Output: " + outputOUT);
    }
}