import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Abc169c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value for ab: ");
        String ab = scanner.nextLine();

        String[] parts = ab.split("\\s+");
        BigDecimal a = new BigDecimal(parts[0]);
        BigDecimal b = new BigDecimal(parts[1]);

        BigDecimal ans = a.multiply(b).setScale(0, RoundingMode.HALF_UP);

        System.out.println("Result: " + ans);
    }
}