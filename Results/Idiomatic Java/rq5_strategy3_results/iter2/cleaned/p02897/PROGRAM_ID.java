import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ACCEPT N
        System.out.print("Enter a number: ");
        long N = scanner.nextLong();
        
        // COMPUTE q = (N + 1) / 2
        long q = (N + 1) / 2;
        
        // COMPUTE ans = q / N
        double ans = (double) q / N;
        
        // DISPLAY ans
        System.out.printf("%.10f%n", ans);
        
        scanner.close();
    }
}