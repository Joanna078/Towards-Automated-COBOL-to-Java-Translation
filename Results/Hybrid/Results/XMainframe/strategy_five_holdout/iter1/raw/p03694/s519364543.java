```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        String s = sc.nextLine();
        String[] parts = s.split(" ");
        int mn = 1001;
        int mx = 0;
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                int a = Integer.parseInt(part);
                if (a < mn) mn = a;
                if (a > mx) mx = a;
            }
        }
        
        System.out.println(mx - mn);
    }
}
```