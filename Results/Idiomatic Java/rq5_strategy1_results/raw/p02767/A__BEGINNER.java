```java
import java.math.BigDecimal;
import java.util.Scanner;

public class Beginner {

    private boolean initialized = false;
    private BigDecimal d0 = new BigDecimal(0);
    private BigDecimal d1 = new BigDecimal(0);
    private BigDecimal d2 = new BigDecimal(0);
    private BigDecimal d3 = new BigDecimal(0);

    private int returnCode = 0;
    private String inp = "";
    private String inData = "";
    private int inLen = 0;
    private int inN = 0;
    private String inXAll = "";
    private int i = 0;
    private int p1 = 0;
    private int p2 = 0;
    private int xp = 0;
    private int avg = 0;
    private int xP2 = 0;
    private String outP = "";

    public static void main(String[] args) {
        new Beginner().run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);

        // Accept input
        System.out.print("Enter data: ");
        inp = scanner.nextLine();

        // Unstring input
        String[] parts = inp.split(" ");
        inData = parts[0];
        inLen = inData.length();
        inN = Integer.parseInt(parts[1]);

        // Initialize variables
        i = 0;
        xp = 0;
        p1 = 1;

        // Perform loop
        while (i < inN) {
            p2 = p1;
            while (Character.isDigit(inp.charAt(p1 - 1))) {
                xp += Character.getNumericValue(inp.charAt(p1 - 1));
                p1++;
            }
            i++;
        }

        // Compute average
        avg = (xp + 5) / inN;

        // Compute xP2
        xP2 = 0;
        i = 1;
        while (i <= inN) {
            int diff = Character.getNumericValue(inp.charAt(i - 1)) - avg;
            xP2 += diff * diff;
            i++;
        }

        // Move result to output
        outP = String.format("%07d", xP2);

        // Display output
        System.out.println("Output: " + outP);
    }
}
```