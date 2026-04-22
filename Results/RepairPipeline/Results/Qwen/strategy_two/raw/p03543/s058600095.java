```java
import java.util.Scanner;

public class ABC_079_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Accept input from user
        System.out.print("");
        int n = scanner.nextInt();
        
        int d = n;
        int bk = d % 10;
        int cnt = 1;
        
        // Loop until d becomes 0
        while (d != 0) {
            d /= 10;
            int r = d % 10;
            
            if (bk == r) {
                cnt++;
            }
            
            bk = r;
        }
        
        // Check if cnt is greater than or equal to 3
        if (cnt >= 3) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        scanner.close();
    }
}
```