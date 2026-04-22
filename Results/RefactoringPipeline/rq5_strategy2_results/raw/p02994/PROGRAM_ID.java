```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read input
        String ln = scanner.nextLine();
        String[] parts = ln.split("\\s+");
        String nx = parts[0];
        String lx = parts[1];
        
        // Parse N
        int n = Integer.parseInt(nx.startsWith("-") ? nx.substring(1) : nx);
        if (nx.startsWith("-")) {
            n = -n;
        }
        
        // Parse L
        int l = Integer.parseInt(lx.startsWith("-") ? lx.substring(1) : lx);
        if (lx.startsWith("-")) {
            l = -l;
        }
        
        // Calculate ans
        int ans = (n * (2 * l + n - 1)) / 2;
        
        // Adjust ans based on conditions
        if (l > 0) {
            ans -= l;
        } else if (l + n - 1 < 0) {
            ans -= (l + n - 1);
        }
        
        // Display result
        System.out.println(ans == 0 ? "0" : String.valueOf(ans));
        
        scanner.close();
    }
}
```