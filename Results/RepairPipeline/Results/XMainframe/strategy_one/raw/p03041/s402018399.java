```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int b = sc.nextInt();
        char c = (char) ('a' + b - 1);
        System.out.println(s.substring(0, b - 1) + c + s.substring(b - 1));
    }
}
```