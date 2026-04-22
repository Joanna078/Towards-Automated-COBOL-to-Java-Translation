```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input line
        String ln = scanner.nextLine();
        
        // Split input into N and L
        String[] parts = ln.split("\\s+");
        String NX = parts[0];
        String LX = parts[1];
        
        // Parse N
        int N = Integer.parseInt(NX.startsWith("-") ? NX.substring(1) : NX);
        if (NX.startsWith("-")) {
            N = -N;
        }
        
        // Parse L
        int L = Integer.parseInt(LX.startsWith("-") ? LX.substring(1) : LX);
        if (LX.startsWith("-")) {
            L = -L;
        }
        
        // Calculate ans
        int ans = (N * (2 * L + N - 1)) / 2;
        
        // Adjust ans based on conditions
        if (L > 0) {
            ans -= L;
        } else if (L + N - 1 < 0) {
            ans -= (L + N - 1);
        }
        
        // Display result
        if (ans == 0) {
            System.out.println(0);
        } else {
            System.out.println(ans);
        }
        
        scanner.close();
    }
}
```