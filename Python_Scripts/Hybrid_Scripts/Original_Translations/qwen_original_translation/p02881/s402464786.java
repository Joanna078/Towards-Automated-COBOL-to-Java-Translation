import java.util.Scanner;

public class AtCoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        long A = scanner.nextLong();
        
        // Initialize variables
        long ans = 2_000_000_000_000L;
        double B = Math.sqrt(A) + 2;
        
        // Loop from 1 to B+1
        for (long t = 1; t <= B + 1; t++) {
            long C = A / t;
            C *= t;
            
            if (C == A) {
                if (ans > t + A / t - 2) {
                    ans = t + A / t - 2;
                }
            }
        }
        
        // Output
        System.out.println(ans);
        
        scanner.close();
    }
}