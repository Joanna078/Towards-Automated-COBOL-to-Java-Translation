```java
import java.util.Scanner;

public class ABC_105_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input
        int n = Integer.parseInt(scanner.nextLine());
        
        StringBuilder str = new StringBuilder();
        int p = 0;
        
        // Conversion logic
        while (n != 0) {
            if (n % 2 == 1) {
                str.insert(p++, '1');
                n--;
            } else {
                str.insert(p++, '0');
            }
            n /= -2;
        }
        
        // Reverse string
        String ans = str.reverse().toString();
        
        // Output
        if (ans.isEmpty()) {
            System.out.println("0");
        } else {
            System.out.println(ans);
        }
    }
}
```