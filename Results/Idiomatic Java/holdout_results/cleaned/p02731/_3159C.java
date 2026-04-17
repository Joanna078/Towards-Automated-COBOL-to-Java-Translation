import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept input for L
        int L = scanner.nextInt();

        // Compute H = L / 3
        BigDecimal H = BigDecimal.valueOf(L).divide(BigDecimal.valueOf(3), 8, BigDecimal.ROUND_HALF_UP);

        // Compute OUT = H ** 3
        BigDecimal OUT = H.pow(3);

        // Display the result, ensuring the format matches the expected output
        System.out.printf("%.7f%n", OUT);

        scanner.close();
    }
}