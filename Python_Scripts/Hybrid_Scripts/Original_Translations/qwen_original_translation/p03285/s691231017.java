import java.util.Scanner;

public class ABC_105_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept N
        int n = scanner.nextInt();
        
        // Initialize flag
        boolean found = false;
        
        // Perform nested loops
        for (int i = 0; i <= n / 4; i++) {
            for (int j = 0; j <= n / 7; j++) {
                if (4 * i + 7 * j == n) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        
        // Display result
        System.out.println(found ? "Yes" : "No");
        
        scanner.close();
    }
}