import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        String input = scanner.nextLine();
        
        // Split input into individual numbers
        String[] parts = input.split("\\s+");
        long A = Long.parseLong(parts[0]);
        long B = Long.parseLong(parts[1]);
        long K = Long.parseLong(parts[2]);
        
        // Compute mna and A
        long mna = Math.min(A, K);
        A -= mna;
        mna = K - mna;
        
        // Compute mnb and B
        long mnb = Math.min(B, mna);
        B -= mnb;
        
        // Display results
        System.out.printf("%18d%18d%n", A, B);
        
        scanner.close();
    }
}