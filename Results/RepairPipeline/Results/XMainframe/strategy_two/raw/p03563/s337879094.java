```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int diff = Math.abs(G - R);
        int sum = R + G;
        String result = Integer.toString(diff);
        System.out.println(result);
    }
}
```