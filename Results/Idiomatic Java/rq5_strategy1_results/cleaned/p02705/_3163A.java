import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

    private boolean initialized = false;
    private BigDecimal pi = new BigDecimal("31415926").movePointLeft(7);
    private BigDecimal two = new BigDecimal("2");

    private int returnCode = 0;
    private String input = "";
    private BigDecimal output = BigDecimal.ZERO;

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        if (!initialized) {
            initialized = true;
        }

        acceptInput();
        computeOutput();
        displayOutput();
    }

    private void acceptInput() {
        // Simulate accepting input from user
        input = "123"; // Example input
    }

    private void computeOutput() {
        BigDecimal number = new BigDecimal(input);
        BigDecimal result = number.multiply(two).multiply(pi);
        output = result.setScale(4, RoundingMode.HALF_UP);
    }

    private void displayOutput() {
        System.out.println(output.toPlainString());
    }
}