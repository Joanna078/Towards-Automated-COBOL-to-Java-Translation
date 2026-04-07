```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ln = sc.nextLine();
        String[] arr = ln.split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int cnt = 1;
        while (n >= Math.pow(k, cnt)) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
```