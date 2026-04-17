import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        BigDecimal N = scanner.nextBigDecimal();
        scanner.close();

        BigDecimal q = (N.add(BigDecimal.ONE)).divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP);
        BigDecimal ans = q.divide(N, 10, RoundingMode.HALF_UP);

        System.out.println("Result: " + ans);
    }
}