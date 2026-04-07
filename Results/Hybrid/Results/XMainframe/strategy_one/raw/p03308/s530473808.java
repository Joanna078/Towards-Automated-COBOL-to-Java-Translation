```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int x = Character.getNumericValue(s.charAt(i));
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
        System.out.println(max - min);
    }
}
```