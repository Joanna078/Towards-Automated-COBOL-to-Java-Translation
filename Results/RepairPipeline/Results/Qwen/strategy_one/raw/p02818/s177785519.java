```java
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
        
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int K = Integer.parseInt(parts[2]);
        
        // Compute mna and update A
        int mna = Math.min(A, K);
        A -= mna;
        
        // Update K with the new value of mna
        K -= mna;
        
        // Compute mnb and update B
        int mnb = Math.min(B, mna);
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
```