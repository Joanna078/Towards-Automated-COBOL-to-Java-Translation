```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        String[] arr = inp.split(" ");
        int n = Integer.parseInt(arr[0]);
        int k = Integer.parseInt(arr[1]);
        int a = k % 2;
        double s1 = (double) n / k;
        int f1 = (int) s1;
        int s2 = (int) ((s1 - f1) * 10);
        int cnt = 0;
        if (a == 1) {
            cnt = f1 * f1 * f1;
        } else {
            cnt = f1 * f1 * f1;
            if (s2 < 5) {
                cnt += f1 * f1 * f1;
            } else {
                cnt += (f1 + 1) * (f1 + 1) * (f1 + 1);
            }
        }
        System.out.println(String.format("%d", cnt));
    }
}
```