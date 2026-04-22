import java.util.Scanner;

public class AtCoder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        // Extract X, Y, and W from the input string
        String[] parts = inp.split("\\s+");
        double x = Double.parseDouble(parts[0]);
        double y = Double.parseDouble(parts[1]);
        double w = Double.parseDouble(parts[2]);

        // Calculate C
        double c = w / x;

        // Perform conditional calculations
        if (c >= (x * y / 2.0)) {
            c = c - (x * y / 2.0);
            c = (2.0 * c) / x;
            c = y - c;
            c = Math.atan(c / x);
        } else {
            c = (2.0 * c) / y;
            c = Math.atan(y / c);
        }

        // Convert to degrees
        c = c * 180.0 / Math.PI;

        // Output the result
        System.out.printf("%.9f%n", c);
    }
}