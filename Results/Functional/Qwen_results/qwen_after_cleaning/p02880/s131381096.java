import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int A = Integer.parseInt(scanner.nextLine());
        
        // Initialize variables
        boolean found = false;
        
        // Logic
        for (int B = 1; B <= 10; B++) {
            for (int C = 1; C <= 10; C++) {
                if (B * C == A) {
                    found = true;
                    break;
                }
            }
            if (found) break;
        }
        
        // Output
        System.out.println(found ? "Yes" : "No");
        
        scanner.close();
    }
}