```java
import java.util.Scanner;

public class ABC_070_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        System.out.print("Enter values separated by spaces: ");
        String inp = scanner.nextLine();
        
        // Parsing input
        String[] parts = inp.split("\\s+");
        int a = Integer.parseInt(parts[0]);
        int b = Integer.parseInt(parts[1]);
        int c = Integer.parseInt(parts[2]);
        int d = Integer.parseInt(parts[3]);
        
        // Compute max and min
        int mx = Math.max(a, c);
        int mn = Math.min(b, d);
        
        if (mx < mn) {
            mn -= mx;
        } else {
            mn = 0;
        }
        
        // Convert result to string
        String zs = String.format("%03d", mn);
        
        // Reverse string
        StringBuilder sb = new StringBuilder(zs).reverse();
        String ans = sb.toString().trim();
        
        // Output
        System.out.println(ans.substring(0, ans.length()));
    }
}
```