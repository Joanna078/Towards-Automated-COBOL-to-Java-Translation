```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        System.out.print("Enter values for A, B, and K separated by spaces: ");
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
        
        // Format results
        String zsa = String.format("%18d", A);
        String zsb = String.format("%18d", B);
        
        // Display results
        System.out.println(zsa.trim() + " " + zsb.trim());
        
        scanner.close();
    }
}
```