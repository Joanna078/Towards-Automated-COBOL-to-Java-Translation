```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = N / 3;
        String ZS = String.format("%03d", tmp); // Ensure ZS is always 3 characters long
        String ans = ZS.substring(1); // Extract the last two characters
        System.out.println(ans);
    }
}
```