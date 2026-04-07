```java
import java.util.Scanner;

public class ABC_101_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        String n = scanner.nextLine();
        
        int num = Integer.parseInt(n.replace(" ", ""));
        int sn = 0;
        
        // Calculate sum of digits
        for (int i = 0; i < n.length(); i++) {
            char ch = n.charAt(i);
            if (ch != ' ') {
                int now = Character.getNumericValue(ch);
                sn += now;
            }
        }
        
        // Divide sum by number and check remainder
        int r = sn % num;
        
        if (r == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```