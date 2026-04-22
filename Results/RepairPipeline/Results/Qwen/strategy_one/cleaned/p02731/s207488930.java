import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        // Input
        int l = Integer.parseInt(System.console().readLine());

        // Processing
        BigDecimal h = new BigDecimal(l).divide(BigDecimal.valueOf(3), 10, RoundingMode.HALF_UP);
        BigDecimal out = h.pow(3);

        // Output
        System.out.printf("%07d.%07d%n", out.toBigInteger(), out.remainder(BigDecimal.ONE).multiply(BigDecimal.TEN.pow(7)).toBigInteger());
    }
}