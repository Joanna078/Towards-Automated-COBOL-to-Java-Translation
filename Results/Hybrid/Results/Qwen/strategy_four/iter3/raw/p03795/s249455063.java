```java
import java.util.Scanner;

public class ABC_055_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        
        // Processing section
        int tmpN = n / 15;
        int tmp = 800 * n - tmpN * 200;
        String zs = String.format("%07d", tmp);
        
        // Call to UNANS method
        unans(zs);
        
        // Output section
        System.out.println(ans.substring(1)); // Remove the leading zero
    }

    private static String ans = "";

    private static void unans(String zs) {
        StringBuilder sb = new StringBuilder();
        for (char c : zs.toCharArray()) {
            if (c != ' ') {
                sb.append(c);
            }
        }
        ans = sb.toString();
    }
}
```