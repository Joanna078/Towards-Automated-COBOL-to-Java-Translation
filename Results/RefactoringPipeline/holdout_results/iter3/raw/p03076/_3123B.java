```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, n1, n2;
        double n3;
        int w1, gk = 0, m1 = 0, m2 = 0, n2w = 10;
        
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter a number: ");
            n = scanner.nextInt();
            n1 = n / 10;
            n2 = n % 10;
            n3 = n + 0.9;
            
            w1 = (int) (n3 * 10);
            
            if (n2 > 0 && n2 < n2w) {
                gk += m1 - m2 + n;
                m1 = w1;
                m2 = n;
                n2w = n2;
            } else {
                gk += w1;
            }
        }
        
        System.out.println(gk);
        scanner.close();
    }
}
```