import java.util.Scanner;

public class ABC_099_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input from console
        int n = scanner.nextInt();
        
        // Check condition and display output
        if (999 < n) {
            System.out.println("ABD");
        } else {
            System.out.println("ABC");
        }
        
        scanner.close();
    }
}