```java
import java.util.Scanner;

public class PROGRAM_ID {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ln = scanner.nextLine();
        
        String[] parts = ln.split("\\s+", 2);
        String S = parts.length > 0 ? parts[0] : "";
        String T = parts.length > 1 ? parts[1] : "";
        
        String ans = T.trim() + S.trim();
        System.out.println(ans.trim());
        
        scanner.close();
    }
}
```