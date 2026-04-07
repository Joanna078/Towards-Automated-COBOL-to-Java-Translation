import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input N
        int N = scanner.nextInt();
        
        if (N == 1) {
            System.out.println("Hello World");
        } else if (N == 2) {
            // Input A and B
            char A = scanner.next().charAt(0);
            char B = scanner.next().charAt(0);
            
            // Convert characters to integers
            int A_9 = Character.getNumericValue(A);
            int B_9 = Character.getNumericValue(B);
            
            // Compute C_9
            int C_9 = A_9 + B_9;
            
            if (C_9 > 9) {
                System.out.println(C_9);
            } else {
                // Convert integer back to character
                char D_9 = (char) ('0' + C_9);
                System.out.println(D_9);
            }
        } else {
            System.out.println("ERR!");
        }
        
        scanner.close();
    }
}