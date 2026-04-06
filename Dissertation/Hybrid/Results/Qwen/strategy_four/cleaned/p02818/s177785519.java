import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        String ln = scanner.nextLine();
        
        // Splitting the input string into components
        String[] parts = ln.split(" ");
        if (parts.length != 3) {
            throw new IllegalArgumentException("Input must contain exactly three space-separated numbers.");
        }
        
        long A = Long.parseLong(parts[0]);
        long B = Long.parseLong(parts[1]);
        long K = Long.parseLong(parts[2]);
        
        // Compute mna and update A
        long mna = Math.min(A, K);
        A -= mna;
        
        // Update K with the new value of mna
        K -= mna;
        
        // Compute mnb and update B
        long mnb = Math.min(B, K);
        B -= mnb;
        
        // Convert results to strings and trim leading/trailing spaces
        String zsa = String.format("%d", A).trim();
        String zsb = String.format("%d", B).trim();
        
        // Concatenate the results with a space in between
        String ans = zsa + " " + zsb;
        
        // Output the result
        System.out.println(ans.trim());
        
        scanner.close();
    }
}