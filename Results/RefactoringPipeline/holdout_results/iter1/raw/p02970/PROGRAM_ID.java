```java
import java.util.Scanner;

public class ProgramID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // ACCEPT ln
        String ln = scanner.nextLine();
        
        // UNSTRING ln DELIMITED BY SPACE INTO N D
        String[] parts = ln.split("\\s+");
        long N = Long.parseLong(parts[0]);
        long D = Long.parseLong(parts[1]);
        
        // COMPUTE ans = (N + 2 * D) / (2 * D + 1)
        long ans = (N + 2 * D) / (2 * D + 1);
        
        // DISPLAY FUNCTION TRIM(zs)
        System.out.println(String.valueOf(ans).trim());
        
        scanner.close();
    }
}
```