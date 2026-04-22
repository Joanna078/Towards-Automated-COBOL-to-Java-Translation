import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Abc169c {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        System.out.print("Enter two numbers separated by space: ");
        String input = scanner.nextLine();
        
        // Unstring input
        String[] parts = input.split("\\s+");
        BigDecimal a = new BigDecimal(parts[0]);
        BigDecimal b = new BigDecimal(parts[1]);
        
        // Compute and display result
        BigDecimal ans = a.multiply(b).setScale(0, RoundingMode.HALF_UP);
        System.out.println("Result: " + ans);
        
        scanner.close();
    }
}