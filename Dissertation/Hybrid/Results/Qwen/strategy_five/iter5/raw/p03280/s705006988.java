```java
import java.util.Scanner;

public class ABC_106_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input section
        System.out.print("Enter input: ");
        String inp = scanner.nextLine();
        
        // Data section
        int a = Integer.parseInt(inp.split(" ")[0]);
        int b = Integer.parseInt(inp.split(" ")[1]);
        int tmp = a * b - (a + b - 1);
        String zs = String.format("%05d", tmp); // Ensure ZS is always 5 digits
        
        // Logic section
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < zs.length(); i++) { // Include all characters
            if (zs.charAt(i) != '0' || ans.length() > 0) { // Append non-zero characters and trailing zeros
                ans.append(zs.charAt(i));
            }
        }
        
        // Output section
        System.out.println(ans.toString());
    }
}
```