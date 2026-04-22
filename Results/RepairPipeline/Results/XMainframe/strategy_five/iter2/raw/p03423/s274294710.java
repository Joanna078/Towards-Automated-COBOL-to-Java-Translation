```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = N / 3;
        String ZS = String.format("%03d", tmp); // Ensure ZS is always 3 digits
        String ans = ZS.substring(ZS.length() - 2); // Get the last two characters
        System.out.println(ans);
    }
}
```