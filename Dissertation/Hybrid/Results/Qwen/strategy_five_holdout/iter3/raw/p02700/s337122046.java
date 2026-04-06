```java
import java.util.Scanner;

public class ProgramId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input
        System.out.print("Enter value for ln: ");
        String ln = scanner.nextLine();
        
        // Split the input string into components
        String[] parts = ln.split("\\s+");
        if (parts.length != 4) {
            throw new IllegalArgumentException("Input must contain exactly four space-separated numbers.");
        }
        
        int A = Integer.parseInt(parts[0]);
        int B = Integer.parseInt(parts[1]);
        int C = Integer.parseInt(parts[2]);
        int D = Integer.parseInt(parts[3]);
        
        // Compute TK and AO
        int TK = (C + B - 1) / B;
        int AO = (A + D - 1) / D;
        
        // Compare and display result
        if (TK <= AO) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```