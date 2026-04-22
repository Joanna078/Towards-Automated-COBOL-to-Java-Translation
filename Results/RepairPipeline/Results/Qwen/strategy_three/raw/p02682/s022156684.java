```java
import java.util.Scanner;

public class ProgramID {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        String ln = scanner.nextLine();
        
        // Data storage
        int A, B, C, K, ans;
        String[] parts = ln.split("\\s+");
        
        // Parsing input
        A = Integer.parseInt(parts[0]);
        B = Integer.parseInt(parts[1]);
        C = Integer.parseInt(parts[2]);
        K = Integer.parseInt(parts[3]);
        
        // Logic
        if (K <= A) {
            ans = K;
        } else if (K <= A + B) {
            ans = A;
        } else {
            ans = A - (K - A - B);
        }
        
        // Output
        System.out.println(String.format("%d", ans));
        
        scanner.close();
    }
}
```