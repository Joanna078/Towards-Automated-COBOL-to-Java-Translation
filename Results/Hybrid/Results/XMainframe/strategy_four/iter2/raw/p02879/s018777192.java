```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        int a = 0, b = 0;
        int temp1 = 0, temp2 = 0;
        
        // Find the first space
        for (int i = 0; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                temp1 = i;
                break;
            }
        }
        
        // Extract the first number
        a = Integer.parseInt(inp.substring(0, temp1));
        
        // Find the second space
        for (int i = temp1 + 1; i < inp.length(); i++) {
            if (inp.charAt(i) == ' ') {
                temp2 = i;
                break;
            }
        }
        
        // Extract the second number
        b = Integer.parseInt(inp.substring(temp1 + 1, temp2));
        
        if (a <= 9 && b <= 9) {
            System.out.printf("%011d%n", a * b);
        } else {
            System.out.println("-1");
        }
    }
}
```