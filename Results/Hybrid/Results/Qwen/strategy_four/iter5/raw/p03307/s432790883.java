```java
import java.util.Scanner;

public class ABC_102_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = Integer.parseInt(scanner.nextLine());
        
        // Processing
        int x = n / 2;
        int d = n % 2;
        
        if (d != 0) {
            n *= 2;
        }
        
        String zs = String.format("%011d", n);
        
        String dummy = "";
        StringBuilder ans = new StringBuilder();
        
        for (char c : zs.toCharArray()) {
            if (c == ' ') continue;
            dummy += c;
            ans.append(c);
        }
        
        // Output
        System.out.println(ans.toString().substring(0, Math.min(10, ans.length())));
        
        scanner.close();
    }
}
```