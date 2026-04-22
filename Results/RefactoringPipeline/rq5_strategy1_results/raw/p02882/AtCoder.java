```java
import java.util.Scanner;

public class AtCoder {

    private boolean initialized = false;
    private int returnCode = 0;
    private String inp = "";
    private double a = 0;
    private double b = 0;
    private double c = 0;
    private double d = 0;
    private double x = 0;
    private double y = 0;
    private double w = 0;
    private double temp1 = 0;
    private double temp2 = 0;
    private double temp3 = 0;
    private double n = 0;

    public static void main(String[] args) {
        new AtCoder().execute();
    }

    public void execute() {
        Scanner scanner = new Scanner(System.in);
        inp = scanner.nextLine();
        scanner.close();

        // Extract values from input
        String[] parts = inp.split("\\s+");
        x = Double.parseDouble(parts[0]);
        y = Double.parseDouble(parts[1]);
        w = Double.parseDouble(parts[2]);

        // Perform calculations
        a = x;
        b = y;
        c = w;

        if (c * a >= b * b * 20) {
            c = (c * a - b * b * 20) / (a * a);
            c = (c * 1800) / Math.PI;
        } else {
            c = (b * b * 20) / (a * a);
            c = (c * 1800) / Math.PI;
        }

        // Output result
        System.out.printf("%.10f%n", c);
    }
}
```