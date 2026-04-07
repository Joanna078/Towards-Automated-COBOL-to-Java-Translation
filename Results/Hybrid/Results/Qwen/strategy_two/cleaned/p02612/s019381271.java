import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        // Processing section
        int qt = n / 1000;
        int rm = n % 1000;
        int num = 1000 - rm;
        qt = num / 1000;
        int ans = num % 1000;
        
        // Output section
        System.out.println(ans);
        
        scanner.close();
    }
}