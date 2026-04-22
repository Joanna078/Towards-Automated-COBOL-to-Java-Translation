import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt();
        scanner.close();

        // Processing
        BigDecimal h = new BigDecimal(l).divide(BigDecimal.valueOf(3), RoundingMode.HALF_UP);
        BigDecimal out = h.pow(3);

        // Output
        String formattedOut = String.format("%7.7f", out);
        System.out.println(formattedOut.trim());
    }
}