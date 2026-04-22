```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");
    private int returnCode = 0;
    private String ans = "No ";
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main program = new Main();
        program.execute();
    }

    public void execute() {
        if (!initialized) {
            initialize();
        }

        System.out.print("Enter a value for S: ");
        String input = scanner.nextLine();

        if (input.length() != 3) {
            System.out.println("Invalid input. Please enter exactly 3 characters.");
            return;
        }

        char wA = input.charAt(0);
        char wB = input.charAt(2);

        for (int idx = 1; idx <= 1000001; idx++) {
            d0 = BigDecimal.valueOf(wA - '0');
            d2 = BigDecimal.valueOf(wB - '0');
            d0 = d0.multiply(d2).multiply(BigDecimal.valueOf(idx));

            if (d0.remainder(BigDecimal.valueOf(2)).equals(BigDecimal.ZERO)) {
                ans = "Yes";
                break;
            }
        }

        System.out.println(ans);
    }

    private void initialize() {
        initialized = true;
    }
}
```