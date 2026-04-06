import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Processing section
        int q = (n + 1) / 2;
        double ans = (double) q / n;
        
        // Output section
        System.out.printf("Result: %.10f%n", ans);
        
        scanner.close();
    }
}