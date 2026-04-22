```java
import java.math.BigDecimal;
import java.util.Scanner;

public class AtCoder {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal("0");
    private BigDecimal d1 = new BigDecimal("0");
    private BigDecimal d2 = new BigDecimal("0");

    private int returnCode = 0;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new AtCoder().execute();
    }

    public void execute() {
        if (!initialized) {
            initialize();
        }

        acceptInput();
        processLogic();
    }

    private void initialize() {
        initialized = true;
    }

    private void acceptInput() {
        System.out.print("Enter value for A: ");
        d0 = new BigDecimal(scanner.nextLine());

        System.out.print("Enter value for E: ");
        d1 = new BigDecimal(scanner.nextLine());

        System.out.print("Enter value for F: ");
        d2 = new BigDecimal(scanner.nextLine());
    }

    private void processLogic() {
        if (d1.subtract(d0).compareTo(d2) > 0) {
            System.out.println(":(");
        } else {
            System.out.println("Yay!");
        }

        returnCode = 0;
        scanner.close();
    }
}
```