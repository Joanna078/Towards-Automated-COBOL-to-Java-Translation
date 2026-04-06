```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int n = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        n--;
        m--;
        int tmp = n * m;
        String zs = String.format("%04d", tmp);
        System.out.println(zs.substring(1));
    }
}
```