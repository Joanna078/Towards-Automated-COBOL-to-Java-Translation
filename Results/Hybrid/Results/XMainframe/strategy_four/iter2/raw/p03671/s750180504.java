```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int tmp = a + b;
        int maxVal = Math.max(a, Math.max(b, c));
        int result = maxVal - tmp;
        String zs = String.format("%06d", result);
        String ans = zs.substring(1); // Remove the leading zero
        System.out.println(ans);
    }
}
```