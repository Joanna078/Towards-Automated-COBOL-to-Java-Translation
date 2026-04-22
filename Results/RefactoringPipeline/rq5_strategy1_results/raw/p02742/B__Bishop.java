```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Bishop {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private BigDecimal d3 = new BigDecimal(0);

    private int returnCode = 0;
    private String inp = "";
    private int h = 0;
    private int w = 0;
    private int s1 = 0;
    private int s2 = 0;
    private String out = "";

    public static void main(String[] args) {
        Bishop bishop = new Bishop();
        bishop.execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter input: ");
        inp = scanner.nextLine();
        scanner.close();

        String[] parts = inp.split("\\s+");
        if (parts.length != 2) {
            System.out.println("Invalid input. Please enter two numbers separated by space.");
            return;
        }

        try {
            h = Integer.parseInt(parts[0]);
            w = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter numeric values.");
            return;
        }

        if (h == 10 || w == 10) {
            out = "0";
        } else {
            s1 = h / 2;
            s2 = w / 2;

            if (h == 2 * s1 && w == 2 * s2) {
                out = String.valueOf((h * w) / 2);
            } else {
                out = String.valueOf(((h * w) / 2) + 1);
            }
        }

        System.out.println("Output: " + out);
    }
}
```