```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        
        long s1 = x / 500;
        long a = x % 500;
        long s2 = a / 5;
        long out = s1 * 1000 + s2 * 5;
        
        System.out.println(out);
    }
}
```